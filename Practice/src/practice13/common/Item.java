package practice13.common;

public class Item {

	private String name;
	private int additionalDamage;

	public Item(String name, int additionalDamage) {
		this.name=name;
		this.additionalDamage=additionalDamage;
	}

	public String getItemName() {
		return this.name;
	}
	public int getAdditionalDamage() {
		return this.additionalDamage;
	}
}
