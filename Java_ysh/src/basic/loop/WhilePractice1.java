package basic.loop;

public class WhilePractice1 {

	public static void main(String[] args) {
		
		System.out.print("1번 : ");
		
		int i =1, c = 0;
		while(30000>=i) {			
			if(i%258==0) {
				c++;				
			}
			i++;
		}
		System.out.println(c);
			
		System.out.print("2번 : ");
		int a = 1, b = 0, sum = 0;
		while(1000>=a) {
			if(1000%a==0) {
				b++;
				sum = sum + a;
			}
			a++;
		}
		System.out.println(b);
		System.out.println(sum);
	}
}
