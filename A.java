public class A {
	
	public A(){
		System.out.print("A");
	}
	
	{
		System.out.print("block");
	}
	
	static {
		System.out.print("static");
	}

    public static final void main(String[] args) {
    	A a = new A();
    }
}
