package live.tanujdevops;

public class Main {
	public static void main(String[] args) {
		calculateScore("Tanuj", 500);
	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
}
