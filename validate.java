package ValidExp;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
 
// Class to which the above package belongs
public class validate
{
 
    public static boolean phonenumber(String ph) 
    {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher match = pattern.matcher(ph);
        return (match.matches());
    }

    public static boolean email (String email)
    {
        Pattern pat= Pattern.compile("[a-z0-9]+@[a-z]+.[a-z]{2,3}");
        Matcher match = pat.matcher(email);
        return (match.matches());
    }

    public static boolean pan(String num)
    {
        
        Pattern pattern = Pattern.compile("[A-Z]{5}+[0-9]{4}+[A-Z]{1}");
        Matcher match = pattern.matcher(num);
        return (match.matches());
    }

    public static boolean adhaar(String pan)
    {
        Pattern pattern = Pattern.compile("^\\d{11}$");
        Matcher match = pattern.matcher(pan);
        return (match.matches());
    }

    public static void main(String args[]) {
        validate v1 = new validate();
            
        Boolean g=v1.phonenumber("21833243");
        Boolean k=v1.email("riyagmail.com");
        System.out.println( "Hhehe: "+g+"\nenern: " +k);
       
    }
}