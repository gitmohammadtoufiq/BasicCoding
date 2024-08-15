package codes;

public class Armstrong {

	public static void main(String[] args) {

		int number = 154;

		int temp = number;

		int rem;
		int sum = 0;

		while (temp != 0) {
			rem = temp % 10;
			sum = sum + rem * rem * rem;
			temp = temp / 10;

		}

		if (sum == number) {
			System.out.println("armstrong");
		}

		else {
			System.out.println("not armstrong");
		}
	}

}
