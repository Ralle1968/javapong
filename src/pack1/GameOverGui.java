package pack1;

import javax.swing.JFrame;

public class GameOverGui {

	public GameOverGui() {
		Var.jf2 = new JFrame();
		Var.jf2.setSize(Var.screenwidth, Var.screenheight);
		Var.jf2.setTitle("Ralf's Pong");
		Var.jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf2.setLayout(null);
		Var.jf2.setResizable(false);
		Var.jf2.setVisible(true);
		Var.jf2.setLocationRelativeTo(null);
		//Var.jf1.addKeyListener(new KeyHandler());
		Var.jf2.requestFocus();
		
		DrawGameOver labeldraw2 = new DrawGameOver();
		labeldraw2.setBounds(0, 0, Var.screenwidth, Var.screenheight);
		labeldraw2.setVisible(true);
		Var.jf2.add(labeldraw2);
	}

}
