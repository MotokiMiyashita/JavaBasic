package practice13.common;

public class SuperHero extends Hero{
	private Item equipment;

	public SuperHero(){
		super(25,10,7);
	}

	public int attack() {
		int power2 = this.power + equipment.getAdditionalDamage();
		System.out.println(this.name+"の攻撃 "+power2+"のダメージ");
		return power2;
	}
//	 * 		attackメソッドをオーバーライドし、
//	 * 		powerに加えて、additionalDamage分を加算した値としてください
//	 *
//	 * 		equipmentのアクセサ

	public void setSuperHeroItem(Item item) {
		equipment = item;
	}
	public String getSuperHeroEquipment() {
		return equipment.getItemName();
	}
	public int getSuperHeroEquipmentPower() {
		return equipment.getAdditionalDamage();
	}
}
