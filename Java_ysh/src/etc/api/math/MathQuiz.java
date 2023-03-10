package etc.api.math;

public class MathQuiz {
	
	/*
	 * 1~10 1
	 * 11~20 2
	 * 21~30 3 반환되는 로직메서드 page
	 *  
	 */
	
	
	static int page (int a) {
		return (int)Math.ceil(a/10.0);
	}
	
	public static void main(String[] args) {
		System.out.println(page(21));
	}
}
