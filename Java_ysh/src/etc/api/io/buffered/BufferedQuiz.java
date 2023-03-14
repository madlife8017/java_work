package etc.api.io.buffered;

import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Scanner;

/*
1. Date클래스를 이용해서 file폴더 내에 하위 경로로
 오늘 날짜 20211111file 이라는 이름으로 폴더를 생성하세요.
2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
 파일을 작성합니다. 
 (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
  연결해 주시면 됩니다.)
4. '그만'으로 파일이 작성되었다면, 아무방법으로나 
 파일을 읽어서 콘솔에 출력해 보세요.
 */
public class BufferedQuiz {

	public static void main(String[] args) {
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDateTime localDateTime = LocalDateTime.now();
		localDateTime.format(dtf);
		Scanner sc = new Scanner(System.in);
		String w= "";



		File file = new File("C:\\work\\file\\"+localDateTime.format(dtf)+"file");
		if(!file.exists()) {
			file.mkdir();
			System.out.println("폴더가 생성되었습니다");
		}else {
			System.out.println("폴더가 이미 존재합니다");
		}
		System.out.print("파일명을 입력하세요 : ");
		String name = sc.next();
		FileWriter ff = null;
		BufferedWriter bw = null;
		
		try {
			ff = new FileWriter("C:\\work\\file\\"+localDateTime.format(dtf)+"file\\"+name+".txt");
			bw = new BufferedWriter(ff);
			System.out.println("파일을 생성하였습니다.");
			System.out.println();
			System.out.println("=========================");
			System.out.println("작성을 시작해주세요");
			System.out.println("'그만'을 입력하시면 중지됩니다.");
			System.out.println("=========================");
			System.out.println();

			while(true) {
				String str = sc.nextLine();
				if(str.equals("그만")) {
					System.out.println("=========================");
					System.out.println("종료합니다");
					break;
				}
				w += (str+"\r\n");
				System.out.println(w);
			}
			bw.write(w);
			bw.flush();
			System.out.println("파일작성완료!");
			System.out.println("=========================");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				ff.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//////////파일 읽기//////////
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr= new FileReader("C:\\work\\file\\"+localDateTime.format(dtf)+"file\\"+name+".txt");
			br= new BufferedReader(fr);
			String read;
			while((read=br.readLine())!=null){
				System.out.println(read);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		


	}

}
