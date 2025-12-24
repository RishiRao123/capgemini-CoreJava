package assignment;

public class Assignment1 {
	
	public static void studentMarks(int marks, double attendance) {
		boolean isPassed = (marks>=40 && attendance>=75) ? true : false;
		if(isPassed)
			marks += 5;
		
		System.out.println((isPassed) ? "Pass, Total marks = " + marks : "Fail");
	}
	
	public static void bankAccount(int balance, boolean isActive, int amount) {
	    boolean canWithdraw = balance > 0 && isActive;

	    System.out.println(canWithdraw
	        ? (balance >= amount
	            ? "Withdrawal successful. Balance: " + (balance -= amount)
	            : "Withdrawal denied: Low balance")
	        : "Withdrawal denied: Account inactive or balance zero");
	}
	
	public static void employeeEligibility(double rating, int experience, boolean anyCase, double salary) {
		boolean isEligible = ((rating>4.0 || experience>5) && anyCase==false);
		double salaryIncrement = salary * 0.1;
		
		System.out.println(isEligible ? "Employee is Eligible. Salary: " + (salary += salaryIncrement) : "Employee not Eligible");
	}
	
	public static void discountEligibility(double amount, boolean isPremium, boolean isFirstTime) {
		boolean discount = (amount>2000 && (isPremium==true || isFirstTime==false));
		double discountAmount = amount * 0.25;
		
		System.out.println(discount ? "Discount applicable. Final amount: " + (amount -= discountAmount) : "Discount not applicable");
		
	}

	public static void extraTimeEligibility(boolean isChallenged, float attendance, boolean isApproved, float duration) {
		boolean isEligible = ((isChallenged==true || attendance<60f) && isApproved==true);
		float extraTime = 30.00f;
		
		System.out.println(isEligible ? "Eligible for extra time. Final time: " + (duration += extraTime) : "Not eligible for extra time");
		
	}
	
	public static void fineEligiblity(int speedLimit, boolean isEmergency, int speed) {
		boolean isEligible = (isEmergency!=true && speed>speedLimit);
		float fine = 3000;
		
		System.out.println(isEligible ? "Eligible for penalty. Final fine: " + fine : "Not eligible for fine");
		
	}
	
	public static void storeOrder(int stockQty, boolean isFastMoving, boolean isDiscontinued) {

	    boolean reorder = ((stockQty < 10 || isFastMoving) && !isDiscontinued) ? true : false;

	    if (reorder) {
	        stockQty += 20; 
	        System.out.println("Reorder placed. Updated stock: " + stockQty);
	    } else {
	        System.out.println("No reorder required.");
	    }
	}
	
	public static void validator(String username, String password, boolean isLocked, int loginAttempts) {

	    String orgUsername = "Rishi";
	    String orgPassword = "rishi61416";
	    int maxAttempts = 5;

	    boolean isValid = (username.equals(orgUsername) &&
	                       password.equals(orgPassword) &&
	                       !isLocked);

	    if (isValid) {
	        System.out.println("Login successful");
	        loginAttempts = 0; 
	    } else {
	        loginAttempts += 1; 
	        isLocked = (loginAttempts >= maxAttempts) ? true : false;

	        System.out.println("Login failed. Attempts: " + loginAttempts);

	        if (isLocked) {
	            System.out.println("Account locked due to too many failed attempts.");
	        }
	    }
	}

	
	public static void electricBill(double units, boolean isCommercial) {

	    double ratePerUnit = 5.00;
	    double totalPrice = units * ratePerUnit;

	    boolean isHighUsageOrCommercial = (units > 300 || isCommercial);

	    double normalTax = totalPrice * 0.10;
	    double commercialTax = totalPrice * 0.20;
	    System.out.println(
	        isHighUsageOrCommercial
	        ? "Commercial user. Total bill: " + (totalPrice += commercialTax)
	        : "Normal user. Total bill: " + (totalPrice += normalTax)
	    );
	}
	
	public static void scoreEvaluvator(int score, float timeGiven, float timeTaken,  boolean isCheatsUsed) {
		boolean isEligible = ((score>100 && timeTaken<timeGiven) && isCheatsUsed==false);
		int bonus = 5;
		System.out.println(isEligible ? "Bonus Updated. Total score: " + (score += bonus) : "Bonus not applicable. Total score: " + score);
	}

}
