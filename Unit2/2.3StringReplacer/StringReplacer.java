// Ryan Densmore
// 2.3 StringReplacer
// 9/28/18
import java.util.Scanner;

public class StringReplacer { 

    /**
     * 
     * DO NOT MODIFY ANYTHING BETWEEN THESE COMMENTS
     */

    public static void main(String[]args){
        // create a Scanner object to grab input from keyboard
        Scanner keyboard = new Scanner(System.in);
        //prompt user for strings 
        System.out.print("Enter the original string: ");
        String original = keyboard.nextLine().trim();

        System.out.print("Enter what string you want to replace: ");
        String replaceString = keyboard.nextLine().trim();

        System.out.print("Enter what you want to replace it with: ");
        String replaceWith = keyboard.nextLine().trim();

        //print out the new string.
        System.out.println("New string: " + stringReplacer(original, replaceString, replaceWith));
                        
        //close the keyboard object or I'll get complaints from the compiler.
        keyboard.close();
    }

    /**
     * 
     * DO NOT MODIFY ANYTHING BETWEEN THESE COMMENTS
     */

    // 1) modify the header to have the correct return type & access modifier
    public static String stringReplacer(String o, String replace, String replaceWith) {

        // 2) construct a new String that has every instance of *replace* replaced with the
        // string *replaceWith* -- check the String API for how to do this.
        // There is 1 method that can do this for you.
        String newString = o.replace(replace, replaceWith);

        // 3) return the new string you just made.
        return newString;
    }

}
