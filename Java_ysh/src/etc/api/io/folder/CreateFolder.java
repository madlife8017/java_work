package etc.api.io.folder;

import java.io.File;
import java.time.format.DateTimeFormatter;

public class CreateFolder {

	public static void main(String[] args) {
		/*
		 - 자바에서 외부 경로로 폴더를 생성할 때는 File 클래스를 사용합니다.
		 - 생성자으 ㅣ매개값으로 폴더를 생성할 경로 + 폴더명을 지정합니다.
		 */
		
		
		File file = new File("C:\\work\\folder_test"); 
		
		if(!file.exists()) { //해당 파일 존재 하면 true 아니면 false
			file.mkdirs(); //폴더생성. //s는 존재하지 않는 경로 여러개 만들어줌 //그냥 mkdir은 하나만 만들어줌
			System.out.println("폴더생성완료");
			
		}else {
			 System.out.println("해당 폴더가 존재합니다.");
		}

	}

}
