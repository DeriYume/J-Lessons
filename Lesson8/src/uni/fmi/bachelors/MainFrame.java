package uni.fmi.bachelors;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	JTextArea guessesTA;
	private JPanel contentPane;
	private JTextField guessTF;
	
	Random random = new Random();
	String computerNumber;
	int tries = 10;
	
	private String generateNumber() {
		String result = "";
		
		while (result.length() < 4) {
			String letter = random.nextInt(10) + "";
			
			if (result.contains(letter)) {
				continue;
			}
			result += letter;
		}
		return result;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 289, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel hiddenNumberL = new JLabel("????");
		hiddenNumberL.setHorizontalAlignment(SwingConstants.CENTER);
		hiddenNumberL.setBounds(10, 50, 253, 24);
		contentPane.add(hiddenNumberL);
		
		guessTF = new JTextField();
		guessTF.setBounds(10, 120, 253, 20);
		contentPane.add(guessTF);
		guessTF.setColumns(10);
		
		JButton guessB = new JButton("Guess");
		guessB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String playerNumber = guessTF.getText();
				
				String result = checkNumber(playerNumber);
				tries--;
				guessesTA.append("\n" + result);
				
				if (result.contains("4B.")) {
					guessesTA.append("Winner winner, chicken dinner!");
				}
				
				if (tries == 0) {
					hiddenNumberL.setText(computerNumber);
				}
			}
		});
		
		guessB.setBounds(90, 175, 89, 23);
		contentPane.add(guessB);
		
		guessesTA = new JTextArea();
		guessesTA.setEditable(false);
		guessesTA.setBounds(10, 221, 253, 197);
		contentPane.add(guessesTA);
		
		computerNumber = generateNumber();
	}

	protected String checkNumber(String playerNumber) {
		int bulls = 0;
		int cows = 0;
		
		for (int i = 0; i < playerNumber.length(); i++) {
			if (computerNumber.charAt(i) == playerNumber.charAt(i)) {
				bulls++;
			}
			else if (computerNumber.contains(String.valueOf(playerNumber.charAt(i)))) {
				cows++;
			}
		}
		
		return playerNumber + " - " + bulls + "B. " + cows + "C.";
	}
}
