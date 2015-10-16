package aesoPoo;

import org.apache.commons.lang3.StringUtils;

public class Teste01 {

	public static void main(String[] args) {
		
		String a = "Java";
		String b = "Java";
		if(a==b){
			System.out.println("Ok 1");
		} 
		a = a + " One";
		b = b + " One";
		if(a.equals(b)){
			System.out.println("Ok 2");
		} 
		if(a==b){
			System.out.println("Ok 3");
		} 
		b = b + " 1";
		System.out.println(StringUtils.join(a, b));
//		for (int i = 0; i < 10; i++) {
//			for(int j = 0; j < 10;j++){
//				System.out.println(i + "" + j + "\n");
//			}
//		}
	}

}
