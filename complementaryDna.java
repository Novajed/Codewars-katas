public class DnaStrand {
  public static String makeComplement(String dna) {
      
      // Initialize char array the length of String dna
      char[] complement = new char[dna.length()];       
      
      // Check each char of dna, push corresponding char into complement array 
      for(int i = 0; i < dna.length(); i++) {
          if (dna.charAt(i) == 'A') {
            complement[i] += 'T';
          } else if (dna.charAt(i) == 'C') {
            complement[i] += 'G';
          } else if (dna.charAt(i) == 'T') {
            complement[i] += 'A';
          }  else if (dna.charAt(i) == 'G') {
            complement[i] += 'C';
          }
         }   
          // Concatenate complementary dna into String and return the value 
          String finalComplement = String.copyValueOf(complement);
          return finalComplement;
  }
}
