
class Exception1 extends Exception {
	public Exception1(String msg) { 
		super(msg); 
		System.out.println("Exception1(String msg)");
	}
}

public class Ex1 {
	public static void f() throws Exception {
		System.out.println("Throwing MyException from f()");
		throw new Exception("From f()");
	}
	public static void main(String[] args) {
		try {
			f();
		} catch(Exception e) {
			System.err.println("Caught Exception1");
			e.printStackTrace();
		} finally { 
			System.out.println("Made it to finally");
		}
		
	}	
}