package studio7;

public class Die {

	private int n;
	
	public Die(int isSides) {
		n = isSides;
	}
	
	public int result() {
		int result = (int)(Math.random()*(n-1))+1;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1 = new Die (69);
		System.out.print(d1.result());
	}

}
