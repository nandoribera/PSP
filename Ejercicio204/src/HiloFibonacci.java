
public class HiloFibonacci extends Thread{
		private int N;
		
		public void HiloFibonacciN(int n) {
			this.N = n;
		}
		
		public void run() {
		int fibNum = 0;
		for (int i = 0; i < N; i++) {
			fibNum = fibNum + i;
			System.out.println(fibNum);
		}
	}
}
