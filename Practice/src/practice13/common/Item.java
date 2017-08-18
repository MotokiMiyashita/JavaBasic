package practice13.common;

public class Item {

	private String name;
	private int additionalDamage;


	/**
	 * 装備品の初期値を設定するコンストラクタ
	 * @param name	装備品名
	 * @param additionalDamage	追加ダメージ
	 */
	public Item(String name, int additionalDamage) {
		this.name=name;
		this.additionalDamage=additionalDamage;
	}

	/**
	 * アイテム名を取得します
	 * @return アイテム名
	 */
	public String getItemName() {
		return this.name;
	}
	/**
	 * アイテム名を設定します
	 * @param name	設定したいアイテム名
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getAdditionalDamage() {
		return this.additionalDamage;
	}
}
