import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;
import java.io.*;
import java.util.*;

class FortuneTeller{

	private  static void loadWindow() {
		//Add icon
		ImageIcon icon = new ImageIcon("resources/questionBlock.png");
		
		//Create and set up the window.
		JFrame frame = new JFrame("Lucky Number");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getRootPane().putClientProperty("apple.awt.fullscreenable", Boolean.valueOf(true)); //Adds macOS fullscreen capabilities
		
		//Create and set up content panel
		JPanel panel = new JPanel(new GridLayout(2, 1));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setBackground(new Color(54, 108, 207));
		
		//Adding Lables
		JLabel label = new JLabel("Click the button to find your fortune!");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(Color.WHITE);	// Set color to white
		panel.add(label, BorderLayout.NORTH);
		
		//Adding Regular Button
		JButton button = new JButton("What is my fortune?");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Random rand = new Random(); 
				int num1 = rand.nextInt(101);
				int num2 = rand.nextInt(101);
				int num3 = rand.nextInt(101);
				String message = "Your fortune is: " + readRandomFortune()  + "\n" +
								 "Your lucky numbers are: " + num1 + ", "+ num2 + ", and "+ num3 + "!";
				JOptionPane.showMessageDialog(frame, message, "Your numbers are...", JOptionPane.INFORMATION_MESSAGE, icon);
			}
		});
		panel.add(button, BorderLayout.SOUTH);
		
		//LoadWindow
		frame.setContentPane(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	private static String readRandomFortune() {
		File file = new File("resources/fortunes.txt");
		ArrayList<String> fortunes = new ArrayList<String>();
		int numOfFortunes = 0;
		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()){
				fortunes.add(sc.nextLine());
				numOfFortunes++;
			}
		} catch (Exception e) {
			System.out.println("File does not exits");
		}
		Random rand = new Random();
		return fortunes.get((rand.nextInt(numOfFortunes)));
	}
	
	public static void main(String[] args) {
		readRandomFortune();
		loadWindow(); 
	}
}