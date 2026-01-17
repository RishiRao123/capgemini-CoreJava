package exception_handling;

import java.util.ArrayList;
import java.util.List;

class NotificationFailedException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotificationFailedException(String msg) {
		super(msg);
	}
}

class NotificationTarget {
	String userId;
	boolean isReachable;
	String message;

	NotificationTarget(String userId, boolean isReachable, String message) {
		this.userId = userId;
		this.isReachable = isReachable;
		this.message = message;
	}

	public String sendNotification() throws NotificationFailedException {
		if (!isReachable) {
			throw new NotificationFailedException("Error: Notification failed for User " + userId);
		}

		return message;
	}

}

class NotificationDispatcher {
	List<NotificationTarget> targets;
	List<String> successfulNotifications;
	List<String> failedUsers;

	NotificationDispatcher(List<NotificationTarget> target) {
		this.targets = target;
		successfulNotifications = new ArrayList<>();
		failedUsers = new ArrayList<>();
	}

	public void dispatchNotification() {
		for (NotificationTarget target : targets) {
			try {
				String result = target.sendNotification();
				successfulNotifications.add(result);
			} catch (NotificationFailedException e) {
				System.out.println("Error: " + e.getMessage());
				failedUsers.add(target.userId);
			}
		}
	}

}

public class NotificationDeliverySystem {

	public static void main(String[] args) {

		NotificationTarget n1 = new NotificationTarget("User 1", true, "Email sent");
		NotificationTarget n2 = new NotificationTarget("User 2", false, null);
		NotificationTarget n3 = new NotificationTarget("User 3", true, "SMS sent");

		List<NotificationTarget> targets = new ArrayList<>();
		targets.add(n1);
		targets.add(n2);
		targets.add(n3);

		NotificationDispatcher dispatcher = new NotificationDispatcher(targets);
		dispatcher.dispatchNotification();

		System.out.println("\nSuccessful Notifications:");
		for (String msg : dispatcher.successfulNotifications) {
			System.out.println(msg);
		}

		System.out.println("\nFailed Users:");
		for (String user : dispatcher.failedUsers) {
			System.out.println(user);
		}

	}

}
