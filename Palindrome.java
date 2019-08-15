package palindrome;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

/**
 *
 * @author gadar, pbldmngz
 */
public class Palindrome {


    public static void main(String[] args) {
        System.out.println(Palindrome("abcde", 0));
    }
    
/**
 * Main code
 * Using recursivity, 
 * 
 */
    public String Palindromo(String string, int control)
    {
        String c = "";
        if (control == string.length)
        {
            return "";
        }
        else
        {
            char l = string.charAt(control);
            i++;
            c = Palindromo(string, control);
            c = c + 1;
            return c;
        }
    }
}
