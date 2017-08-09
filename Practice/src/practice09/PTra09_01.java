package practice09;
//import java.util.Timer;
//import java.util.TimerTask;
import practice09.util.Util;

/*
 * PTra09_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra09_01 {
	public static void main(String[] args) {

		String str = "この文字列をゆっくり表示したい";
		Util.dispMessageSlowly(str, 500);

		// ★ 変数strを、Util内のメソッドを用いて0.5秒間隔で表示させなさい
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです
	}
}


/*
public class PTra09_01 extends TimerTask{
	public static void main(String[] args) {

		Timer timer = new Timer();
		timer.schedule(new PTra09_01(), 500, 500);


		// ★ 変数strを、Util内のメソッドを用いて0.5秒間隔で表示させなさい
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです
	}

	public void run() {
		String str = "この文字列をゆっくり表示したい";
		System.out.println(str);
	}
}
*/