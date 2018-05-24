
public class Calculator {

	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
	public int add() {
		return a + b;
	}
	
	public int sub() {
		return a - b;		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "" + a + " and " + b;
				
	}
	
}
