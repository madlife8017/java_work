package basic.loop;

public class LoopNestingQuiz01 {

	public static void main(String[] args) {
		
		int dan , hang;
		
		for(dan=2;dan<=9;dan++) {
			System.out.print(dan + "단 : ");
			for(hang=1;hang<=9;hang++) {
				System.out.printf("%d X %d = %d   ",dan,hang,dan*hang);
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
	
		for(dan=2; dan<=9; dan++) {
			System.out.printf("%d 단\t\t",dan);
			
		}
		System.out.println();
		for(hang=1;hang<=9;hang++) {
			for(dan=2;dan<=9;dan++) {
				System.out.printf("%d X %d = %d\t",dan,hang,dan*hang);
			}		
			System.out.println();		
		}	
	}
}
