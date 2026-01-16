package exception_handling;

// Custom Exception
class UnderAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public UnderAgeException(String msg) {
		super(msg);
	}
}

public class ExceptionHandling3 {

	// Method to validate age
	public static void ageValidator(int age) {
		try {
			if (age < 18) {
				throw new UnderAgeException("Age is below 18. Not eligible!");
			} else {
				System.out.println("Age is valid. Eligible.");
			}
		} catch (UnderAgeException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		ageValidator(16);
		ageValidator(21);
	}
}
