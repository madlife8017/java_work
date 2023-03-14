package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
1. 스캐너를 통해서 파일명을 정확히 입력받습니다.

2. file폴더에 해당 파일이 존재한다면 해당 파일을 
upload폴더로 복사하세요.
파일이 존재하지 않는다면 "파일명이 없습니다." 예외구문을 출력하세요.

3. 복사 도중에 에러가 발생하면 "파일 처리 중 예외 발생!" 구문을 출력.
 */

public class FileQuiz {

	public static void main(String[] args) {
		System.out.print("파일명을 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("C:\\work\\file\\"+name);
			fos = new FileOutputStream("C:\\work\\upload\\"+name);

			byte[] arr = new byte[100];

			//			while(true) {
			//				int result = fis.read(arr);
			//				if(result ==-1) break;
			//				fos.write(arr, 0, result);
			//			}
			int result;
			while((result=fis.read(arr))!=-1) fos.write(arr, 0, result);

			System.out.println("복사완료되었습니다.");

		} catch (FileNotFoundException e) {
			System.out.println("파일명이 없습니다.");
		} catch(Exception e) {
			System.out.println("파일 처리 중 예외 발생!");
		} finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}

}
