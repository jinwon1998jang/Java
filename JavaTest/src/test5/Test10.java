package test5;

import java.io.*;

/**
 * 날짜: 2025. 7. 23.
 * 이름: 장진원
 * 내용: 자바 파일 입출력 연습문제
 */

public class Test10 {

	public static void main(String[] args) {
		String path = "C:\\Users\\GGG\\Desktop\\Result.txt";

		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			//추가모드
			//new FileWriter(File file, boolean append) 또는 
			//new FileWriter(String fileName, boolean append)
			
			
			for(int x=2 ; x<=9 ; x++) {
				fw.write(x+"단\n");
				for(int y=1 ; y<=9 ; y++) {
					int z = x * y;
					fw.write(x + " x " + y + " = " + z + "\n");
				}
				fw.write("\n");
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("구구단 파일 출력 완료...");
	}

}
