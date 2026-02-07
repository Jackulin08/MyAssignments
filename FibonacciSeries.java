package assgn1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 10;      
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Series: ");
    
          for (int i = 1; i <= n; i++) {
            System.out.print(a +" ");

            int c = a + b;
            a = b;
            b = c;
           
        }
	}

}
