package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {
		
		int a = (int)((Math.random()*18)+2);
		System.out.printf("*** 구구단 %d단 ***\n",a);
		System.out.println("======================");
		for(int i =1 ; i<=19;i++) {			
			System.out.printf("%d X %d = %d\n",a,i,a*i);
		}
	}
}
