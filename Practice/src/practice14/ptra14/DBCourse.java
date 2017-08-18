package practice14.ptra14;

public class DBCourse implements practice14.common.Course{
	/*
	 * ★ common.Courseを実装した、DBCourseクラスを作成してください
	 *
	 * コース名称
	 * 		「【Eラーニング】DB基礎」
	 * 単元
	 * 		DB基礎
	 * 		SQL基礎
	 * 		正規化
	 * 		SQL応用
	 */
	String[] str= {
			"DB基礎",
	 		"SQL基礎",
	  		"正規化",
	  		"SQL応用",
	  		};


	/**
	 * コースの名称を取得します。
	 * 例）Java、DB基礎、IT基礎　など
	 * @return	単元の名称
	 */
	public String getCourseName() {
		return PREFIX+"DB";
	}

	/**
	 * コースの単元を取得します
	 * 例）プログラミングの書き方、式と演算子　など
	 * @return
	 */
	public String[] getCourseUnit(){
		return this.str;
	}
}
