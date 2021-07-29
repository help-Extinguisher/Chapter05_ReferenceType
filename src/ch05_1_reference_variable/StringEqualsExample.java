package ch05_1_reference_variable;

public class StringEqualsExample {

	public static void main(String[] args) {
		
//		String str1 = "java";
//		String str2 = "java";
//		
//		System.out.println(str1 == str2);
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		
//		String str3 = new String("java");
//		String str4 = new String("java");
//		System.out.println(str3 == str4);
//		System.out.println(str3.equals(str4));
//		
//		System.out.println(System.identityHashCode(str1)); // 고유 코드같은거임
//		System.out.println(System.identityHashCode(str2));
//		System.out.println(System.identityHashCode(str3));
//		System.out.println(System.identityHashCode(str4));
		
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");

	}
	}
}

		
