public class measureTime{
	public static long Fibonacci(int n){
		if (n < 1) return 0;
		if (n == 1) return 1;
		return Fibonacci(n-1) + Fibonacci(n-2);
	}
	
	public static void main(String []args){
		long startTime = System.nanoTime();
		Fibonacci(10);
		long stopTime = System.nanoTime();
		System.out.println(stopTime - startTime);
	}
}