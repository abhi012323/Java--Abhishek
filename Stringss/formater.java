import java.util.Formatter;

public class formater {
    public static void main(String[] args) {
        String greetingsTemplate = "Hello , dear %s! Good %s!" ;
        String morning = "morning" ;
        String evening = "evening" ;
        String afternoon = "afternoon" ;
        String firstName = "Abhishek";


        String formatteString = String.format(greetingsTemplate ,firstName,morning);
        System.out.println(formatteString);

        
        
    }
    
}
