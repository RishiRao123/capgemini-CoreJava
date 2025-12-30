package oops;

public class Introdcutiontooops {
	static class User{
		int id;
		String email;
		String password;
		
		public User(int id,String email,String password) {
			this.id=id;
			this.email=email;
			this.password=password;
		}
		public User(String email,String password) {
			this.email=email;
			this.password=password;
		}
	} 
	public static void main(String args[]) {
		User u1=new User(1,"rishi@email","123@");
		System.out.println(u1.id);
		System.out.println(u1.email);
		System.out.println(u1.password); 
		
		User u2=new User("rishi@email","123@");
		System.out.println(u2.email);
		System.out.println(u2.password); 
	}

}
