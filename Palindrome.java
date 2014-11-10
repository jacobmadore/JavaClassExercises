/* 
  Jacob Madore
  November 9, 2014
  Assignment4 – Program 2
*/

//This one took me a while. I had to go to many different sites to research
//how arrays work because the book didn't explain the concepts well enough
import java.util.*;
import java.util.Scanner;
 
public class Palindrome
{
  private static int used = 0;
  public static char [] array = new char [80]; 
  public static String a = "";  
  public static void main(String[] args)
  {          
        System.out.println("This program will tell if your entered string is a palindrome.");
        boolean checkPalindrome;           
        while(true)
        {
           array = getCharacters();
           if (array[0] == '.') //check the array for a period to call checkPalindrome
           {
               break;
           }
           checkPalindrome = isPalindrome(array, array.length);
           System.out.println("----------------------------------------------");
           System.out.println("Is " + a + " a palindrome?: " + checkPalindrome);
           System.out.println("----------------------------------------------");  
        } 
  }
  //getCharacters method for pulling the 
  public static char [] getCharacters()
  {
         Scanner keyboard = new Scanner (System.in);
         System.out.println("Input a string below. End program by entering a \".\"");
         a = keyboard.nextLine().toLowerCase();
            
         return a.toCharArray();
  }
  //isPalindrome method check to see if the string is a palindrome or not
  public static boolean isPalindrome(char[] array, int used)
  {
        for(int i = 0; i < Math.floor(used/2); i++) //math.floor used to ensure odd and even strings work
        {
             if(array[i] != array[used-1-i])
             {
                return false;
             }
        }
        return true;
   }
}
