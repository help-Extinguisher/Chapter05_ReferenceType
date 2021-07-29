package ch05_array;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		
//		실행 시 특정 조건에 따른 실행을 명령하고 싶을때 사용
//		실행시 처음에 영어로 나오게 하기, 한국어로 나오게 하기 등등 이럴떄 사용
		
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " + " + result);
	}

}
