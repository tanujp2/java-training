package live.tanujdevops;

public class FlourPacker {
	public static void main(String[] args) {
		System.out.println(canPack(1, 0, 4));
		System.out.println(canPack(1, 0, 5));
		System.out.println(canPack(0, 5, 4));
		System.out.println(canPack(2, 2, 11));
		System.out.println(canPack(-3, 2, 12));
		System.out.println(canPack(1, 0, 4));
		System.out.println(canPack(5, 3, 24));
	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}

		int requiredBigCount = 0;
		int requiredSmallCount = 0;

		while (requiredBigCount <= bigCount && requiredBigCount * 5 <= goal) {
			requiredBigCount++;
		}
		requiredBigCount--;
		
		int remainingGoal = goal - requiredBigCount * 5;

		while (requiredSmallCount <= smallCount && requiredSmallCount <= remainingGoal) {
			requiredSmallCount++;
		}
		requiredSmallCount--;

		return requiredBigCount * 5 + requiredSmallCount >= goal;
	}
}
