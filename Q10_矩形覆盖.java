package Offer;

public class Q10_矩形覆盖 {
	//跳台阶一样的代码 . 实质也是斐波那契数列问题
	public int RectCover(int target) {
		int a = 1, b = 2, v = 0;
		if (target == 1) {
			v = 1;
		}
		if (target == 2) {
			v = 2;
		}
		for (int i = 0; i < target - 2; i++) {
			v = a + b;
			a = b;
			b = v;
		}
		return v;
	}
}
