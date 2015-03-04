import javax.swing.JOptionPane;
import java.util.Scanner;
public class SigninLoop {
public static void main(String [] args) {
	String username =""; String password = ""; String usernameverify= ""; String passwordverify = "";
	username = JOptionPane.showInputDialog("Enter your username.");
	password = JOptionPane.showInputDialog("Enter your password.");
	usernameverify = JOptionPane.showInputDialog("Re-enter your username for verification");
	passwordverify = JOptionPane.showInputDialog("Re-enter your password for verification");

while (!username.equals(usernameverify) || (!password.equals(passwordverify))){
	JOptionPane.showMessageDialog(null,"That is the incorrect username or password.");	
	usernameverify = JOptionPane.showInputDialog("Enter your username.");
	passwordverify = JOptionPane.showInputDialog("Enter your password again.");

}
JOptionPane.showMessageDialog(null,"That is the correct username and password.");	
}
}
