package interfaces;

interface Notification {
	void send(String msg);
}

class EmailNotification implements Notification {
	public void send(String msg) {
		System.out.println("Email notification: " + msg);
	}
}

class SMSNotification implements Notification {
	public void send(String msg) {
		System.out.println("SMS notification: " + msg);
	}
}

class NotificationService {
	public void notification(Notification notification, String msg) {
		notification.send(msg);
	}
}

public class Interface1 {

	public static void main(String[] args) {
		
		NotificationService n1 = new NotificationService();
		
		n1.notification(new EmailNotification(), "email received");
		n1.notification(new SMSNotification(), "SMS received");
		
		
	}

}
