import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WindowedProgram{

	public static void loadWindow() {
		//Create and set up the window.
		JFrame frame = new JFrame("ButtonDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500, 300);	// Set pizxel size of window
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
				JOptionPane.showMessageDialog(frame, "Yay! You pressed me!");
			}
		});
		panel.add(button);
		
		//LoadWindow
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		loadWindow(); 
	}
}