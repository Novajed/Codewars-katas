public class Maskify {
    public static String maskify(String str) {                    
    
    char[] preConverted = str.toCharArray();  
    
    for (int i = 0; i < preConverted.length - 4; i++) {
        preConverted[i] = '#';
      }    
      
      String masked =  String.copyValueOf(preConverted);  
      return masked;        
    }
}
