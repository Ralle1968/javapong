package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class BallMovement {
Timer move;
	public BallMovement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {
			
			public void run() {
				Var.ballx += Var.balldirx;
				Var.bally += Var.balldiry;
				
			}
		}, 0, 4);
	}

}
