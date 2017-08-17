/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> player = new ArrayList<Player>();
		  try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
	            while (scanner.hasNext()) {
	                String line = scanner.nextLine();
	                String[] value = line.split(",");
	                Player tmp = new Player();
	                tmp.setPosition (value[0]);
	                tmp.setName(value[1]) ;
	                tmp.setCountry(value[2]);
	                tmp.setTeam(value[3]);
	                player.add(tmp);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("ファイルが見つかりません");
	        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		int[] cntLimit = {1,4,4,2};
		for(int k=0; k<4; k++) {

			ArrayList<Player> matchPlayer = new ArrayList<Player>();
			for(int i=0; i<player.size(); i++) {
				Player tmpMatchPlayer = player.get(i);
				String tmpMatchPosition = tmpMatchPlayer.getPosition();
				if(k==0) if("GK".equals(tmpMatchPosition)) {matchPlayer.add(tmpMatchPlayer);}
				if(k==1) if("DF".equals(tmpMatchPosition)) {matchPlayer.add(tmpMatchPlayer);}
				if(k==2) if("MF".equals(tmpMatchPosition)) {matchPlayer.add(tmpMatchPlayer);}
				if(k==3) if("FW".equals(tmpMatchPosition)) {matchPlayer.add(tmpMatchPlayer);}
			}

			ArrayList<Player> selectPlayer = new ArrayList<Player>();
			for(int cnt=0; cnt < cntLimit[k]; cnt++) {
				boolean[] isPicked = new boolean[matchPlayer.size()];
				int randNum=0;
				while(true) {
					randNum = new java.util.Random().nextInt(matchPlayer.size());
					if(!isPicked[randNum]) break;
				}
				selectPlayer.add(matchPlayer.get(randNum));
				isPicked[randNum] = true;
			}
			for(Player p : selectPlayer) System.out.println(p.toString());
		}
	}
}