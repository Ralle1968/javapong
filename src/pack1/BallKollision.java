package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class BallKollision {
Timer kollision;
	public BallKollision() {
		kollision = new Timer();
		kollision.schedule(new TimerTask() {
			
			@Override
			public void run() {
				if (Var.bally + 50>= Var.screenheight){
					Var.balldiry = -1;
				}
				if (Var.bally <= 0) {
					Var.balldiry = 1;
				}
				if (Var.ballx + 20 >= Var.screenwidth){
					Var.ballx = Var.screenwidth/2 - 10;
					Var.bally = Var.screenheight/2 - 10;
					Var.balldirx = -1;
					Var.playerpoints += 1;
					if (Var.playerpoints==3){
						new GameOverGui();
						Var.winner = "Player1";
						Var.title = "Game Over";
					}
				}
				if (Var.ballx <= 0){
					Var.ballx = Var.screenwidth/2 - 10;
					Var.bally = Var.screenheight/2 - 10;
					Var.balldirx = 1;
					Var.gegnerpoints += 1;
					if (Var.gegnerpoints==3){
						new GameOverGui();
						Var.jf1.dispose();
						Var.winner = "Computer";
						Var.title = "Game Over";
					}
				}
				if (Var.ballx < Var.x+25 && Var.ballx > Var.x && Var.bally-20 < Var.y+150 && Var.bally > Var.y) {
					Var.balldirx = 1;
				}
				if (Var.ballx < Var.gegnerx && Var.ballx > Var.gegnerx-20 && Var.bally-20 < Var.gegnery+150 && Var.bally > Var.gegnery) {
					Var.balldirx = -1;
				}
			}
		}, 0, 4);
	}

}
