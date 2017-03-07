package pack1;

import java.awt.*;

import javax.swing.JLabel;

public class DrawGameOver extends JLabel {
	protected void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Var.screenwidth, Var.screenheight);
		g.setColor(Color.WHITE);
		
//		for (int i = 0; i <= 30; i++) {
//			if(i ==19 || i==20)
//		      {
//		         continue;
//		      }
//			g.fillRect(Var.screenwidth/2-5, i * 20, 10, 10);
//		}
//		
//		g.fillRect(Var.x, Var.y, 25, 150);
//		g.fillRect(Var.gegnerx, Var.gegnery, 25, 150);
		
		g.setFont(Var.pixelfont);
		
		g.drawString("" + Var.title, 143, 280);
		
		g.setFont(Var.myFont);
		
		g.drawString("Game Over", 250, 400);
		
		g.drawString("Winner: " + Var.winner, 250, 500);
		
		repaint();
	}
}