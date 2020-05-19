
public class Test01 {
	public static void main(String[] args) {
		
		//print의 기능은 괄호 안의 내용을 출력하는 기능, 한줄 주석
		/*
		System.out.println("1. hello");  문단주석
		System.out.println("2. hello");
		System.out.println("3. hello");
		
		System.out.print("1. hello");
		System.out.print("2. hello");
		System.out.print("3. hello");
		System.out.print("1. hello");System.out.print("2. hello");System.out.print("3. hello");
		
		System.out.println("Hello \n Java");
		System.out.println("Have\t a\t Good\t Time");
		System.out.println("Have a Good Time");
		System.out.println("1234567\t1\t12345678\t123");
		System.out.println("내용 \"작성\" 합니다.");
		System.out.println("내용 \"작\\성\" 합니다.");
		System.out.println("\"K:\\a b c\"");
		
		System.out.println(100);
		System.out.println(123.123);
		System.out.println(100 + 100);
		System.out.println(123.123 + 100);
		
		System.out.println("100" + 100);
		System.out.println("백" + 100);
		System.out.println("백100" + 200);
		System.out.println("백" + (100 + 200));
		System.out.println("문자" + " : 연산");
		*/
		for(int i=1; i<40; i++) {
			System.out.print("=");
		}
		System.out.println("");
		System.out.println("이름\t\t나이\t\t전화번호\t\t\t회비");
		for(int i=1; i<40; i++) {
			System.out.print("=");
		}
		System.out.println("");
		System.out.println("홍길동\t\t"+"\""+15+"\""+"\t\t" + 3672 + "-" + 1234 + "\t\t\t\\" + 20000);
		System.out.println("고길동\t\t\""+15+"\"\t\t" + 2238 + "-" + 1234 + "\t\t\t\\" + 30000);
		System.out.println("김말이\t\t"+"\""+15+"\""+"\t\t" + 1234 + "-" + 1234 + "\t\t\t\\" + 50000);
		
		for(int i=1; i<70; i++) {
			System.out.print("-");
		}
		System.out.println("");
		System.out.println("총합계\t\t\t\t\t\t\t\t\\"+100000);

	}
}



