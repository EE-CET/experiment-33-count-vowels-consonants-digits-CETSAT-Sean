// TODO: Read the string line
// TODO: Initialize counters for vowels, consonants, digits, special
// TODO: Convert to lowercase for easier checking (optional but recommended)
// TODO: Iterate through characters and update counters
// Hint: Character.isDigit(ch), Character.isLetter(ch) might be useful
// TODO: Print the 4 counts separated by spaces
import java.util.Scanner;
public class CountCharacters {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                int vowels = 0;
                int consonants = 0;
                int digits = 0;
                int special = 0;
                s = s.toLowerCase();
                for(int i=0; i<s.length(); i++){
                        char ch = s.charAt(i);
                        if(Character.isLetter(ch)){
                                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                                        vowels++;
                                }
                                else{
                                        consonants++;
                                }
                        }
                        else if(Character.isDigit(ch)){
                                digits++;
                        }
                        else{
                                special++;
                        }
                }
                System.out.println(vowels + " " + consonants + " " + digits + " " + special);
        }

}
