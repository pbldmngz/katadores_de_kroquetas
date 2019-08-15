package palindrome;

/**
 *
 * @author gadar, pbldmngz, mariana
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(reverse("abcde"));
    }
    //This method reverses a phrase and return a true/false value
    //If reversed string (no blanc spaces) equals base string
    public static Boolean reverse (String st)
    {
        st = st.replaceAll("\\s+","");
        char[] arr = new char[st.length()];
        for (int i = st.length()-1; i >= 0; i--)
        {
            arr[i] = st.charAt(i);
        }
        String string = new String(arr);
        
        return (st.equals(string));
    }
}
