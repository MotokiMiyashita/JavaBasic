package practice10;

public class Car {
	 int serialNo;
	 String color;
	 int gasoline;

	 int run () {
		 gasoline--;
		 if(!(gasoline<0)) return new java.util.Random().nextInt(15+1);
		 else return -1;
	 }
}
