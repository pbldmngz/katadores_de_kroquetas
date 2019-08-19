package palindrome;

/**
 *
 * @author gadar, pbldmngz, mariana, juan
 */

public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char answer = ' ';
        Scanner a = new Scanner(System.in);
        System.out.println("Would you like to input a word?  Yes = Y  No = N");
        answer = a.next().charAt(0);
        
        while(answer == 'y' || answer == 'Y') {
            palin.pal();
            System.out.println("\nContinue?  Yes = Y  No = N");
            answer = a.next().charAt(0);
        }
        
        System.out.println("Thanks for playin'");
    }   
}
