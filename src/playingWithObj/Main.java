package playingWithObj;

public class Main {
	
//	public static void printRef(Box b) {
//		System.out.println(b);
//	}
	
	public static void printObjRef(Object obj) {
		System.out.println(obj);
	}

	public static void main(String[] args) {
		
		Box b1 = new Box();
		printObjRef(b1);
		Bottle bt1 = new Bottle();
		printObjRef(bt1);
	}

}
