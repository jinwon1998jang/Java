package step6;

import java.io.*;
import java.util.*;
public class Main02 {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] cor_arr= {1,1,2,2,2,8};
		int[] fix_arr=new int[6];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		for (int i = 0; i < cor_arr.length; i++) {
			System.out.print(cor_arr[i]-Integer.parseInt(st.nextToken())+" ");
		}

		br.close();
	}

}
