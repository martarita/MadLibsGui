import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MadLibs extends JFrame {
	private  JTextField txtAdjective;
	private  JTextField txtPastVerb;
private	 JTextField txtColor;
private	JTextField txtNoun;
	JButton btnNewButton;
	JTextPane txtPSentence;


	public MadLibs() {
		getContentPane().setBackground(new Color(204, 204, 255));
		setTitle("Mad  Libs");
		getContentPane().setLayout(null);
		
		JLabel lblMadLibsApp = new JLabel("Mad Libs App");
		lblMadLibsApp.setFont(new Font("MathJax_Fraktur", Font.BOLD, 28));
		lblMadLibsApp.setHorizontalAlignment(SwingConstants.CENTER);
		lblMadLibsApp.setBounds(199, 29, 199, 30);
		getContentPane().add(lblMadLibsApp);
		
		JLabel lblEnterAnAdjective = new JLabel("Enter an adjective");
		lblEnterAnAdjective.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		lblEnterAnAdjective.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterAnAdjective.setBounds(23, 101, 152, 24);
		getContentPane().add(lblEnterAnAdjective);
		
		JLabel lblEnterAColor = new JLabel("Enter a color");
		lblEnterAColor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterAColor.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		lblEnterAColor.setBounds(310, 101, 152, 24);
		getContentPane().add(lblEnterAColor);
		
		JLabel lblEnterPastTense = new JLabel("Enter past tense verb");
		lblEnterPastTense.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterPastTense.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		lblEnterPastTense.setBounds(5, 152, 170, 24);
		getContentPane().add(lblEnterPastTense);
		
		JLabel lblEnterANoun = new JLabel("Enter a noun");
		lblEnterANoun.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEnterANoun.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		lblEnterANoun.setBounds(310, 152, 152, 24);
		getContentPane().add(lblEnterANoun);
		
		txtAdjective = new JTextField();

		txtAdjective.setBounds(178, 103, 114, 19);
		getContentPane().add(txtAdjective);
		txtAdjective.setColumns(10);
		
		txtPastVerb = new JTextField();
		
		txtPastVerb.setColumns(10);
		txtPastVerb.setBounds(178, 154, 114, 19);
		getContentPane().add(txtPastVerb);
		
		txtColor = new JTextField();
		
		
		txtColor.setColumns(10);
		txtColor.setBounds(472, 103, 114, 19);
		getContentPane().add(txtColor);
		
		txtNoun = new JTextField();
		
		txtNoun.setColumns(10);
		txtNoun.setBounds(472, 154, 114, 19);
		getContentPane().add(txtNoun);
		
		btnNewButton = new JButton("Press here to viev Your Mad Lib");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String adjective = txtAdjective.getText();
				//System.out.println(adjective);
				String pastVerb = txtPastVerb.getText();
				String 	color = txtColor.getText();
				String	noun = txtNoun.getText();
				txtPSentence.setText("The "+color+" dragon "+pastVerb+" at the "+ adjective+" "+noun+". And everyone lived happily ever after.The end.");
						}
		});
		btnNewButton.setBackground(new Color(255, 204, 255));
		btnNewButton.setBounds(121, 213, 356, 25);
		getContentPane().add(btnNewButton);
		
		txtPSentence = new JTextPane();
		txtPSentence.setFont(new Font("Century Schoolbook L", Font.BOLD | Font.ITALIC, 16));
		txtPSentence.setBackground(new Color(255, 255, 204));
		txtPSentence.setBounds(5, 270, 581, 75);
		
		getContentPane().add(txtPSentence);
		
	}

	public static void main(String[] args) {
		
		
		MadLibs theGame = new MadLibs (); 
		
		theGame.setSize(new Dimension(600, 400)); //okno o wymiarach...to tez instrukcie
		theGame.setVisible(true);    //staje sie widoczne
		
		
		
		

	}
}
