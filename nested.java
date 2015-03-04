import javax.swing.JOptionPane;
import java.util.Scanner;
public class nested{
public static void main(String [] args){
	String 	NumPlayers;  String Numpeople = ""; double groupsize; double teamsize;
	Numpeople= JOptionPane.showInputDialog("How many people are there?");
	NumPlayers= JOptionPane.showInputDialog("How many players are there?");
double dblNumplayers=Double.parseDouble(NumPlayers);
double dblNumpeople=Double.parseDouble(Numpeople);


if (dblNumpeople>10){ 
groupsize=dblNumpeople/2;
JOptionPane.showMessageDialog(null,"The number of people is  " + "The group size is " + groupsize);}
else if (dblNumpeople>2 && dblNumpeople<=10)
{ groupsize=dblNumpeople/3;
JOptionPane.showMessageDialog(null,"The number of people is " + "The group size is " + groupsize);
}
else{
JOptionPane.showMessageDialog(null, "You need at least 3 people for a group.");
}
if ( dblNumplayers>=11 && dblNumplayers<=55){
teamsize=dblNumplayers/11;
JOptionPane.showMessageDialog(null, "The number of players is " + dblNumplayers + " The team size is " + teamsize);}
else{
teamsize =1;
JOptionPane.showMessageDialog(null, "The team size is " + teamsize);}
}
}