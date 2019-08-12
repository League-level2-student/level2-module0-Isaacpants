/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jointheleague.graphical.robot.Robot;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame jf;
	JPanel jp;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] jb;
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		jf = new JFrame("Find the Button");
		jp = new JPanel();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String s = JOptionPane.showInputDialog("give me a positive number");
		
		int num = Integer.parseInt(s);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		jb = new JButton[num];
		//5. Make a for loop to iterate through the JButton array
		for (int i = 0; i < jb.length; i++) {
			
		
			//6. initialize each JButton in the array
		jb[i] = new JButton();
			//7. add the ActionListener to each JButton
		jb[i].addActionListener(this);
			//8. add each JButton to the panel
		jp.add(jb[i]);
		}
		//9 add the panel to the window
		jf.add(jp);
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		jf.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "find the hidden button");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		Random r = new Random();
		hiddenButton = r.nextInt(num);
		//14. Set the text of the JButton located at hiddenButton to  "ME"
		
		
jb[hiddenButton].setText("me");
		
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		jb[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(e.getSource().equals(jb[hiddenButton])) {
JOptionPane.showMessageDialog(null, "You win");
		}else {
			//18. else tell them to try again
		JOptionPane.showMessageDialog(null, "look again");
		}
		}
		
		
}
