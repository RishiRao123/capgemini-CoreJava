package interfaces;

// A solid real world development tsak, showcasing the interfaces concept use 

interface Authenticator {
	boolean authenticate(String input);
}

class PasswordAuthenticator implements Authenticator {
	private String password;
	
	PasswordAuthenticator(String input) {
		this.password = input;
	}
	
	public boolean authenticate(String input) {
		return (password.equals(input)) ? true : false;
	}
}

class OTPAuthenticator implements Authenticator {
	private String otp;
	
	OTPAuthenticator(String otp) {
		this.otp = otp;
	}
	
	public boolean authenticate(String input) {
		return (otp.equals(input));
	}
}

class AuthenticationService {
	public void login(Authenticator a, String input) {
		System.out.println((a.authenticate(input)) ? "Login successful" : "Invalid credentials");
	}
}

public class Interface2 {

	public static void main(String[] args) {
		
		AuthenticationService a = new AuthenticationService();
		
		a.login(new PasswordAuthenticator("Rishi61416"), "Rishi61416");
		a.login(new PasswordAuthenticator("Rishi61416"), "Ri$hi61417");
		a.login(new OTPAuthenticator("61235"), "61235");
		a.login(new OTPAuthenticator("61235"), "61285");



	}

}
