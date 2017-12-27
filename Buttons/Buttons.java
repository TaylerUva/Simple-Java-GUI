import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WindowedProgram{

	public static void loadWindow() {
		//Add icon
		ImageIcon icon = new ImageIcon("images\TULogo.png");
		
		//Create and set up the window.
		JFrame frame = new JFrame("Button");// Creates a new frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);	// Makes window centered on screen (null does this)
		frame.getRootPane().putClientProperty("apple.awt.fullscreenable", Boolean.valueOf(true)); //Adds macOS fullscreen capabilities
		JPanel panel = new JPanel();		// Create new panel to hold contents
		
		//Adding Lables
		JLabel label = new JLabel("Hello");
		panel.add(label);
		
		//Adding Regular Button
		JButton button = new JButton("Press Me");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(frame, "Yay! You pressed me!", "Button Clicked", JOptionPane.INFORMATION_MESSAGE, icon);
			}
		});
		panel.add(button);
		
		//LoadWindow
		frame.setContentPane(panel);
		frame.pack();	// Sets window dimentions to just fit contents.
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		loadWindow(); 
	}
}