package polymorphism;

class Notification {
	public void send(String msg) {
		System.out.println("Notification: " + msg);
	}
}

class EmailNotification extends Notification {
	@Override
	public void send(String msg) {
		System.out.println("Sending Email: " + msg);
	}
}

class SMSNotification extends Notification {
	@Override
	public void send(String msg) {
		System.out.println("Sending SMS: " + msg);
	}
}

class PushNotification extends Notification {
	@Override
	public void send(String msg) {
		System.out.println("Sending Push Notification: " + msg);
	}
}

class NotificationService {
	public void notifyUser(Notification notification, String msg) {
		notification.send(msg);
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		
		NotificationService n1 = new NotificationService();
		n1.notifyUser(new EmailNotification(), "Welcome User");
		n1.notifyUser(new SMSNotification(), "OTP is 1234");
		n1.notifyUser(new PushNotification(), "New Message Received");

	}

}
