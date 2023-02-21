package basic;

import java.util.Scanner;

public class CeltoFahr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 온도 : ");
		
		double a = sc.nextDouble();
		double b = (a*1.8) +32;
		
		System.out.println("====================");
		System.out.printf("섭씨 온도 : %.1f℃\n",a);
		System.out.printf("화씨 온도 : %.1f℉\n",b);
		System.out.println("====================");
		
		sc.close();
	
	}

}
