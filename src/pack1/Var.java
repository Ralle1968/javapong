package pack1;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.*;

public class Var {
	static JFrame jf1, jf2;
	static int screenwidth = 800, screenheight = 600;
	static int x = 20, y = 185;
	static int gegnerx = 755, gegnery = 185;
	static int playerpoints = 0, gegnerpoints = 0;
	static int ballx = 100, bally = 500;
	static int balldirx = 1, balldiry = -1;
	static boolean moveup = false, movedown = false;
	static Font pixelfont;
	static Font myFont = new Font("Serif", Font.BOLD, 32);
	static String title = "Ralfs Pong";
	static String winner = "";
	
	public Var() {
		try {
			InputStream mystream = this.getClass().getClassLoader().getResourceAsStream("pack1/resources/coders_crux.ttf");
			pixelfont = Font.createFont(Font.TRUETYPE_FONT, mystream).deriveFont(125f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("pack1/resources/coders_crux.ttf")).deriveFont(125f));
		} catch (FontFormatException | IOException e) {
			
			e.printStackTrace();
		}
	}

}
