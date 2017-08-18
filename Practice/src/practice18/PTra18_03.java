/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entityc.Player;

public class PTra18_03 {

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

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		 for(int i=0; i<player.size(); i++) {
			 String tmp = player.get(i).getTeam();
			 if(	"レアル・マドリード".equals(tmp)) {player.remove(i); i--;}
			 else if("バルセロナ".equals(tmp)) {player.remove(i); i--;}
			 // どっちでもいいなら ||　でまとめられる
		 }

		// ★ 削除後のArrayListの中身を全件出力してください
		 for(Player p : player) {
			 System.out.println(p);
		 }

	}
}
