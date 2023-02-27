package basic.array;

public class Array2DQuiz {
	
	public static void main(String[] args) {
		/*
		 1. 각 학생 평균 
		 2. 각 과목의 평균
		 3. 반 평균 (모든 학생들의 평균)
		 소수점 첫째
		 */
		int[][] score = {
				{79,80,99},//a학생
				{95,85,89},//b학생
				{90,65,56},//c학생
				{69,78,77}//d학생
				//3과목
		};
		String[] stuName = {"A학생","B학생","C학생","D학생"};
		String[] subName = {"국어","영어","수학"};
		double totalSum=0;
		double stuSum=0;		
		System.out.print("<각 학생 평균> \n");
		for(int i=0;i<stuName.length;i++) {
			for(int j=0;j<subName.length;j++) {
				stuSum = stuSum+ (double)score[i][j];
			}
			System.out.printf("%s 평균점수 : %.1f점\n",stuName[i],stuSum/subName.length);
			totalSum = totalSum + (double)stuSum/subName.length;
			stuSum=0;
		}
		double subSum=0;		
		System.out.print("\n<각 과목 평균> \n");
		for(int i=0;i<subName.length;i++) {
			for(int j=0;j<stuName.length;j++) {
				subSum = subSum+(double)score[j][i];
			}
			System.out.printf("%s 평균점수 : %.1f점\n",subName[i],subSum/stuName.length);
			subSum=0;
		}
		System.out.print("\n================");
		System.out.print("\n반 평균 : ");
		System.out.printf("%.1f점 ",totalSum/stuName.length);
	}
}
