import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LuckyNumbers{

	public static void loadWindow() {
		//Add icon
		ImageIcon icon = new ImageIcon("TULogo.png");
		
		//Create and set up the window.
		JFrame frame = new JFrame("Button");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);	// Set pizxel size of window
		frame.getRootPane().putClientProperty("apple.awt.fullscreenable", Boolean.valueOf(true)); //Adds macOS fullscreen capabilities
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		
		//Adding Lables
		JLabel label = new JLabel("Hello");
		panel.add(label);
		
		//Adding Regular Button
		JButton button = new JButton("Press Me");
		button.setActionCommand("Pressed");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(frame, "Yay! You pressed me!", "Button Clicked", JOptionPane.INFORMATION_MESSAGE, icon);
			}
		});
		panel.add(button);
		
		//LoadWindow
		frame.setContentPane(panel);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		loadWindow(); 
	}
}