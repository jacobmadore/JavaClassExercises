import java.util.Scanner; 

public class DissectingStrings 
{ 
   public static void main(String[] args) 
   { 
      Scanner cin = new Scanner(System.in); 
      String text = ""; 
      while (true) 
      { 
         System.out.println("This program will attempt to recall the letters input (alphabetical order " +
         "and the number of times it occured in the word.");
         System.out.println("Please enter a sentence. Type \".\" to end program."); 
         text = cin.nextLine(); 
         if (".".equals(text))
         { 
            break; 
         }
         counter(text);
    } 
} 

private static void counter(String text) 
   { 
      int[] arr = new int[26]; 
      text = text.toLowerCase(); 
      System.out.println(text); 

      for (int i = 0; i < text.length(); ++i) 
      if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') 
      ++arr[text.charAt(i) - 'a']; 

      for (int i = 0; i < 26; ++i) 
      System.out.println((char)('a' + i) + ": " + arr[i]); 
   } 
}
