//github.com/novajed

public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    // your code here
    char[] vowels = {'a','e','i','o','u'};
    
    for(int i = 0; i < str.length(); i++ ) {
      for(int j = 0; j < vowels.length; j++) {
        if(str.charAt(i) != vowels[j]) {
          vowelsCount += 0;
        } else {
          vowelsCount++;
        }
      }
    }
    
    return vowelsCount;
  }

}
