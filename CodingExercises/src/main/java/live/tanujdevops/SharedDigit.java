package live.tanujdevops;

public class SharedDigit {
	public static void main(String[] args) {
		System.out.println("hasSharedDigit(12, 23) " + hasSharedDigit(12, 23));
		System.out.println("hasSharedDigit(9, 99) " + hasSharedDigit(9, 99));
		System.out.println("hasSharedDigit(15, 55) " + hasSharedDigit(15, 55));
		System.out.println("hasSharedDigit(12, 13) " + hasSharedDigit(12, 13));
	}

	public static boolean hasSharedDigit(int n1, int n2) {
		if (n1 < 10 || n1 > 99 || n2 < 10 || n2 > 99) {
			return false;
		}

		while (n1 > 0) {
			int digitN1 = n1 % 10;
			int temp = n2;

			while (n2 > 0) {
				int digitN2 = n2 % 10;

				if (digitN1 == digitN2) {
					return true;
				}

				n2 /= 10;
			}

			n1 /= 10;
			n2 = temp;
		}

		return false;
	}
}
