package test5;
import java.io.*;
import java.util.*;

/**
 * 날짜: 2025. 7. 23.
 * 이름: 장진원
 * 내용: 자바 API 클래스 연습문제
 */
public class Test05 {

	public static void main(String[] args) {
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("미국", 2000);
		Grape grape = new Grape("일본", 1000);
		
		showInfo(apple);
		showInfo(banana);
		showInfo(grape);

	}

	public static void showInfo(Object fruit) {

		if (fruit instanceof Apple) {
			Apple apple = (Apple) fruit;
			System.out.println(apple);
		} else if (fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			System.out.println(banana);
		} else if (fruit instanceof Grape) {
			Grape grape = (Grape) fruit;
			System.out.println(grape);
		}
	}
}
