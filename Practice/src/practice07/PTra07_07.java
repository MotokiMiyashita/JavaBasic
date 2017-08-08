package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_07 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください
		int sum = 0;
		int cnt = 0;
		for(int[] row : array) {
			for(int score : row) {
				sum += score;
				cnt++;
			}
		}
		double average = (double)sum/cnt;
		System.out.print("cnt="+cnt + " sum="+sum);
		System.out.println(" average="+String.format("%.2f", average));
	}
}
