package Teste;

public class Prime { 
	
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if(isPrime(i))
				System.out.print(i+ " ");
		}
	}

	private static boolean isPrime(int number) {
		for (int j = 2; j < number; j++) {
			if (number % j == 0)
				return false;
		}
		
		if (number == 1) {
			return false;
		}
		return true;
	}

}
