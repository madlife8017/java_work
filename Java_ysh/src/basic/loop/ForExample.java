package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		
		/*
		int i = 1;
		int total = 0;
		
		while( i <= 10) {
			total += i;
			i++;
		}
		
		int total = 0;
		for(int i=1; i<=10; i++) {
			total += i;
		}
		*/
		
		for(int i=1;i <=200;i++) {
			if(i%6==0 && i%12!=0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		int a = 0;
		for(int j=1;j<=60000;j++) {
			if (j%177==0) {
				a++;
			}
		}
		System.out.println(a);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하시오 : ");
		a = sc.nextInt();
		int sum = 1;
		for(int z = 1 ; z<=a ; z++) {
			sum *=z;			
		}
		System.out.println(sum);
		
	}
}
