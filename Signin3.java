import javax.swing.JOptionPane;
import java.util.Scanner;
public class Signin3 {
public static void main(String [] args) {
	String username =""; String password = ""; String usernameverify= ""; String passwordverify = "";
	username = JOptionPane.showInputDialog("Enter a username."); // User inputs username for the first time
	password = JOptionPane.showInputDialog("Enter a password."); // User inputs password for the first time
	usernameverify = JOptionPane.showInputDialog("Re-enter your username for verification"); // User inputs the username again to verify
	passwordverify = JOptionPane.showInputDialog("Re-enter your password for verification"); // User inputs the password again to verify


if (username.equals(usernameverify) && (password.equals(passwordverify))){   // If the second inputted username and password match this condition will run
	JOptionPane.showMessageDialog(null, "That is the correct username and password."); // Output they were correct
	System.exit(0); // end program
}
else { JOptionPane.showMessageDialog(null,"That is the incorrect username or password."); // if it doesnt match it will output incorrect username or password
	for (int count=1; count<3; count++){ // for loop. the next four lines will run 3 times if the condition isnt meet.
	usernameverify = JOptionPane.showInputDialog("Enter your username again."); // try to verify username again
	passwordverify = JOptionPane.showInputDialog("Enter your password again."); // try to verify password again
    if (username.equals(usernameverify) && (password.equals(passwordverify))){JOptionPane.showMessageDialog(null, "That is correct"); // if it was correct it will output it is correct.
    System.exit(0);} // and exit the program  
	JOptionPane.showMessageDialog(null, "That is the incorrect username of password"); // if the username/pass doesnt match it will say so and begin to loop again.
    	
    
	}

}
JOptionPane.showMessageDialog(null, "You tried too many times."); // after the for loop is tried 3 times it will break out and land here. This says it tried too many times
System.exit(0); // This will end the program
}
}
