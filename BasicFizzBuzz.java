public class BasicFizzBuzz {
	static void fizzbuzz(int num){
		if ((num % 3 == 0) || (num % 5 == 0)) {
			if (num % 3 == 0) { System.out.print("Fizz");}
			if (num % 5 == 0) { System.out.print("Buzz");}
			System.out.print(""+ System.lineSeparator());
		} else {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		for (int i = 1 ; i <= 100 ; i ++) {
			fizzbuzz(i);
		}
	}
}
