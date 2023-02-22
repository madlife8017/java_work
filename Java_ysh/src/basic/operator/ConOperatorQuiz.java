package basic.operator;

public class ConOperatorQuiz {
	public static void main(String[] args) {
		
		int a = (int)((Math.random()*355)+42);
		System.out.println("발생한 난수 : " + a);
		String b = (a%2==0 ? "짝수입니다." : "홀수입니다.");
		System.out.println("3항 연산의 결과 : " + b);
	}
}
