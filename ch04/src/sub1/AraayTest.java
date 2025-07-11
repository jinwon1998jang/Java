package sub1;

import java.util.Iterator;

/**
 * 날짜: 2025. 7. 8.
 * 작성자:  Jang Jinwon
 * 내용: 배열(Array) 실습하기
 */
public class AraayTest {

	public static void main(String[] args) {
		//배열
		int[] arr1= {1,2,3,4,5};
		char[] arr2= {'A','B','C'};
		String[] arr3 = {"서울", "대전", "대구","부산","광주"};
		boolean[] arr4 = {true,false,true,true,false};
		//System.out.println("arr1: "+arr1);
		//배열 원소 인덱스
		System.out.println("arr1[0]: "+arr1[0]);
		System.out.println("arr2[1]: "+arr2[1]);
		System.out.println("arr3[2]: "+arr3[2]);
		
		//배열 길이(사이즈)
		System.out.println("arr1 배열 길이 :"+arr1.length);
		System.out.println("arr2 배열 길이 :"+arr2.length);
		System.out.println("arr3 배열 길이 :"+arr3.length);
		
		//배열 반복문
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1["+i+"]:"+arr1[i]);
		}
		for(int num:arr1) {
			System.out.println("num["+num+"]: "+num);
		}
		for(char al:arr2) {
			System.out.println("al: "+al);
		}
		for(String city:arr3) {
			System.out.println("city: "+city);
		}
		
		//1차원 배열
		int[] scores = {80,60,78,62,92};
		int total=0;
		
		for (int score : scores) {
			total+=score;
		}
		System.out.println("총합:"+total);
		
		//2차원 배열
		
		int[][] arr2d= {{1,2,3},
						{4,5,6},
						{7,8,9}};
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				System.out.printf("arr2d[%d][%d]: %d\n",i,j,arr2d[i][j]);
				
			}
			
		}
	
		//3차원 배열
		
		int[][][] arr3d= {{{1,2,3},
						   {4,5,6},
						   {7,8,9}},
						{{10,11,12},
					    {13,14,15},
					    {16,17,18}},
						{{19,20,21},
					    {22,23,24},
					    {25,26,27}}};
		for (int i = 0; i < arr3d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				for (int k = 0; k < arr3d[i][j].length; k++) {
					System.out.printf("arr3d[%d][%d][%d]: %d\n",i,j,k,arr3d[i][j][k]);	
				}
			}
			
		}
	}

}
