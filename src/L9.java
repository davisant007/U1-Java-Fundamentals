import javax.swing.JOptionPane;

public class L9{

    public static void main(String[] args) {

        String firstName;
       String lastName;
        firstName = JOptionPane.showInputDialog("What is your first name");
        lastName = JOptionPane.showInputDialog("What is your last name");

        JOptionPane.showMessageDialog(null, " Hello " + firstName +  " " + lastName + "!!");

        
        //All input is recieved as a string

        // PRO TIP: Variables of the same data type can be sepreated with a comma in the declaration

        int mph , minutes;
        double distance , hours;

        mph = Integer.parseInt(JOptionPane.showInputDialog("How fast were you traveling (in MPH)"));
        minutes = Integer.parseInt(JOptionPane.showInputDialog("How long in minutes , were you traveling (in MPH)"));

        hours = minutes/60.0;

        distance = mph * hours;

        JOptionPane.showMessageDialog(null, "you travled" + distance + "miles" );

        System.exit(0);


    }




}
