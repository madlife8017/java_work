package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {
		/*
		 1. 파일을 읽어들이는 데 사용하ㅡㄴ 클래스느 FileInputStream 입니다.
		 2. 생성자의 매개값으로 읽어들ㅇ리 파일의 전체 경로를 적습니다.
		 3. InputStream 객체는 생성자에 throws가 있기 때문에
		 예외처리를 진행하셔야 합니다.
		 
		 */
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:/Work/file/뭐냐.txt/");
//			while(true) {
//				int data = fis.read();
//				System.out.print((char)data);// 숫자형을 문자형으로 환 축
//				if(data==-1)break;
//				
//			}
			
			byte[] arr = new byte[100];
			int result = fis.read(arr); //100바이트 단위로 읽어드링미
			System.out.println("읽어들인 데이터의 길이 : "+result);
			System.out.println(Arrays.toString(arr));
			
			int i = 0;
			while(arr[i]!=0) {
				System.out.print((char)arr[i]);
				i++;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
