package pakke;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Klasse {
	private int AnswerToLifeUniverseAndEverything = 42;

	public Klasse(){
		
	}
	public int getAnswer(){
		return AnswerToLifeUniverseAndEverything;
	}
	
	public static void main(String[] args) {
		JFrame jf = new JFrame("AnswerToLifeUniverseAndEverything");
		jf.setLayout(new FlowLayout());
		JLabel jl = new JLabel(Integer.toString(new Klasse().getAnswer()));
		jl.setFont(new Font("Serif", Font.PLAIN, 200));
		jf.add(jl);
		jf.setSize(400, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);

	}

}
