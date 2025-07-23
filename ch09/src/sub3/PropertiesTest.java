package sub3;

import java.io.*;
import java.util.*;
/**
 * 날짜: 2025. 7. 23.
 * 이름: 장진원
 * 내용: 프로퍼티스(Properties) 자료구조 실습
 */
public class PropertiesTest {

	public static void main(String[] args) {
		
		//프로퍼티: 키-값이 모두 문자열인 자료구조
		//Map<String,String> map = new HashMap();와 같음
		Properties prop=new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		System.out.println(prop);
		//최적화
		String path="C:\\Users\\GGG\\Desktop\\fruit.properties";
		
		try {
			FileOutputStream fos=new FileOutputStream(path);
			prop.store(fos, null);
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
		
	}

}
