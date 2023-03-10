package etc.api.stringbuilder;

public class StrTest {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		/*
		//String Test
		String str ="a";
		for (int i =1; i<=500000;i++) {
			str += "a";
		}
		
		
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("실행 결과 : "+(end-start)*0.001+"초");
		*/
		
		StringBuilder sb = new StringBuilder("a");
		for(int i=1; i<=500000;i++) {
			sb.append("a");
			
		}

	}

}
