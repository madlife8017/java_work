package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		//48~150사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		int i = 48;
		while(150>=i) {
			if(i%8==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		System.out.println();
		System.out.println("1~100 중 4의 배수이면서 8의 배수가 아닌 정수 : ");
		

		int a = 1;
		while(100>=a) {

			if(a%4==0) {
				if(a%8!=0) {
					System.out.print(a +" ");
				}				
			}
			a++;
		}
		
		
	}
}
