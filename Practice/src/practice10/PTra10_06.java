package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ★ carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * ★ 各carインスタンスのrunメソッドを実行して、200km先の目的地に到達した順位を出力してください
		 */
		Car[] car = new Car[3];
		java.util.Scanner scanner = new java.util.Scanner(System.in);


		for(int i=0; i<car.length; i++) {
			car[i] = new Car();
			System.out.println("車の色とガソリンをカンマ区切りで入力して下さい");
			String line = scanner.nextLine();
			String[] value = line.split(",");
			car[i].serialNo = Integer.parseInt(value[0]);
			car[i].color = value[1];
			car[i].gasoline = Integer.parseInt(value[2]);
		}

		int[] arrivalTime = new int[car.length] ;
//		int[] remainDist = new int[car.length];
		for (int i=0; i<car.length; i++) {

			final int distance = 200;
			int n = 0;
			int result = 0;
			int remaining = distance;
			while(!((result=car[i].run())<0)) {
				remaining -= result;
				n++;
				if(remaining<=0) {
					System.out.println("目的地まで"+n+"時間かかりました。残りのガソリンは、"+car[i].gasoline+"リットルです");
					arrivalTime[i] = n;
					break;
				}
			}
		}

		//順位比較計算
		boolean[] isRanked = {false, false, false};
		int[] rank = new int[3];
//		arrivalTime[0] = 27;
//		arrivalTime[1] = 23;
//		arrivalTime[2] = 26;

		for(int i=0; i<car.length; i++) {
			int maxi=0;
			int max=0;
			for(int j=0; j<car.length; j++) {
				if(arrivalTime[j] > max && isRanked[j]!=true) {
					maxi = j ;
					max = arrivalTime[maxi];
				}
			}
			rank[i] = maxi;
			isRanked[maxi] = true;
			System.out.println("maxi "+(maxi+1));
		}
		for(int i=0; i<car.length; i++) System.out.println(car[rank[i]].serialNo);
	}
}
