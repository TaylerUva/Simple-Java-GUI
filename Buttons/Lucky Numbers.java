import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;
import java.util.Random;

class LuckyNumbers{

	public static void loadWindow() {
		//Add icon
		ImageIcon icon = new ImageIcon("images/questionBlock.png");
		
		//Create and set up the window.
		JFrame frame = new JFrame("Lucky Number");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getRootPane().putClientProperty("apple.awt.fullscreenable", Boolean.valueOf(true)); //Adds macOS fullscreen capabilities
		frame.setLocationRelativeTo(null);
		
		//Create and set up content panel
		JPanel panel = new JPanel(new GridLayout(2, 1));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setBackground(new Color(54, 108, 207));
		
		//Adding Lables
		JLabel label = new JLabel("Click the button to find your lucky numbers!");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(Color.WHITE);	// Set color to white
		panel.add(label, BorderLayout.NORTH);
		
		//Adding Regular Button
		JButton button = new JButton("What are my Lucky Numbers?");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Random rand = new Random(); 
				int num1 = rand.nextInt(101);
				int num2 = rand.nextInt(101);
				int num3 = rand.nextInt(101);
				String message = "Your lucky numbers are: " + num1 + ", "+ num2 + ", and "+ num3 + "!";
				JOptionPane.showMessageDialog(frame, message, "Your numbers are...", JOptionPane.INFORMATION_MESSAGE, icon);
			}
		});
		panel.add(button, BorderLayout.SOUTH);
		
		//LoadWindow
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		loadWindow(); 
	}
}