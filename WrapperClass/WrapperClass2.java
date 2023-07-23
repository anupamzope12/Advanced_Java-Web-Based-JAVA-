package WrapperClass;

public class WrapperClass2 {
	public static void main(String[] args) {
	int a=50;
	System.out.println(a);
	
	Integer b = new Integer(100);
	int v=b;
	System.out.println(b);
	System.out.println(v);
	
	Integer c=Integer.valueOf(200);
	//converting int into Integer this is explicitly
	System.out.println("BOXING");
	System.out.println(c);
	}

}
