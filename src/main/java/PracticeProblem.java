public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean hasCapital(String cap){
		return !cap.equals(cap.toLowerCase());
	}

	public static boolean isPrime(int num){
		boolean brg= false;
		if (num <= 1) {
			return false;
		}

	for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
	}

}

