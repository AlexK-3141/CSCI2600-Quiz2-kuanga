class Fibonacci {

	public long fibHelper(long n, long a, long b) {
		if (n == 0) {
			return a;
		} else if (n == 1) {
			return b;
		}
		return fibHelper(n - 1, b, a + b);
	}
	
	public long getFibTerm(long n) {
		if (n < 0) {
			throw new IllegalArgumentException(n + " is negative");
		} else {
			return fibHelper(n, 0, 1);
		}	        
	}
	
	public static void main(String[] argv) {
		Fibonacci fib = new Fibonacci();
		for (int i = 0; i <= 20; i += 1) {
			long startTime = System.currentTimeMillis();
			long fibTerm = fib.getFibTerm(i);	    		
			long endTime = System.currentTimeMillis();
			long totalTime = endTime - startTime;
			System.out.println(i + "th Fibonacci term: " + fibTerm + "; Fibonacci method elapsed time: " + totalTime + " ms");
		}
	}
	
}
