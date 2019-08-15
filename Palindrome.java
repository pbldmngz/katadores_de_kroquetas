package palindrome;

/**
 *
 * @author gadar, pbldmngz
 */
public class Palindrome {

    public static void main(String[] args) {
        //System.out.println(reverse("abcdeedcba"));
    }
    //This method reverses a phrase and return a true/false value
    //If reversed string (no blanc spaces) equals base string
    public static Boolean reverse (String st)
    {
        char[] arr = new char[st.length()];
        int r_counter = 0;
        st = st.replaceAll("\\s+","");
        for (int i = st.length()-1; i >= 0; i--)
        {
            arr[r_counter] = st.charAt(i);
            r_counter++;
        }
        String string = new String(arr);
        return (st.equals(string));
    }
}
