/*
 * PTra16_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_03 {

	/*
	 * toStringメソッドをオーバーライドしてください
	 *
	 * 処理内容
	 * 	・親クラス（Objectクラス）のtoStringの処理を行ってください
	 *	・その後、改行をして「PTra16_03#toString()の処理」という文字列を連結してください
	 */

	@Override
	public String toString() {
		System.out.println(super.toString());
	    String className = new Object(){}.getClass().getEnclosingClass().getName();
	    return (className+"#toString()の処理");
	}
	
	public static void main(String[] args) {

		// ★ PTra16_03クラスのtoStringメソッドの内容を出力してください
		System.out.println(new PTra16_03().toString());
	}

	
}
