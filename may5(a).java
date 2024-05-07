// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println( "Enter a word : ");
        String word = scanner.nextLine();
        
        Solution solution = new Solution();
        boolean isValid = solution.isValid(word);
        
        if(isValid) {
            System.out.println("This word is valid.");
        }else{
            System.out.println("This word is invalid");
        }
        scanner.close();
    }
}
        
class Solution{
    public boolean isValid(String word){

        if (word.length() < 3 || !containsVowel(word) || !containsConsonant(word)) {
            return false;
        }
        
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));

            if (!(Character.isDigit(ch) || (ch >= 'a' && ch <= 'z'))) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean containsVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return true;
            }
        }
        return false;
    }
    
    private boolean containsConsonant(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if ((ch >= 'a' && ch <= 'z') && !isVowel(ch)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
