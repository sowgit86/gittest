
public class gitfact {


	 
	int n1=5,fact=1; 
	
	public int findfactorial() {
	
		for(int i = 1; i<=5; i++) {
			
			fact = fact *i;
		}
	//System.out.println("the factorial of 5 id : " + fact);
		
		return fact;
		
	}
	public static void main(String[] args) {
		// minor change to check the commit
		
		gitfact a = new gitfact();
		System.out.println("Hello Java");
		System.out.println("the factorial of 5 id : " + a. findfactorial());

	}

}
	