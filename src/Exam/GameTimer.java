package Exam;

import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {
	private int secondPassed;
	Timer timer;
	TimerTask task;

	public GameTimer(int totalSeconds) {
		timer = new Timer();
		task = new TimerTask() {

			@Override
			public void run() {
				secondPassed++;
				if (totalSeconds - secondPassed == 0) {
					System.out.println("TIME'S UP!");
					Game.endGame();
				}
			}
		};
	}

	public Runnable run() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("GAME START!");
		System.out.println();
		System.out.println();
		System.out.println();
		timer.scheduleAtFixedRate(task, 1000, 1000);
		return null;
	}
}
