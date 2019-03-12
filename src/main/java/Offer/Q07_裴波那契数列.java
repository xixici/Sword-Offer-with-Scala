package Offer;

public class Q07_Åá²¨ÄÇÆõÊýÁÐ {
	public int Fibonacci(int n) {
		int a = 1, b = 1, v = 0;
		if (n == 1 || n == 2) {
			v = 1;
		}
		if (n>=3) {
			for(int i=3; i<=n; i++) {
				v = a + b;
				a = b;
				b = v;
			}
		}
		return v;		
    }	
}
