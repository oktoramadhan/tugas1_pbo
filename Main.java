public class Main {
	public static void main(String[] args) {
		Kendaraan aceng = new Kendaraan(5);
		Kendaraan gtr = new Kendaraan();
		Kendaraan tronton = new Kendaraan(3);

		gtr.jalan("mmmmmm");

		aceng.jalan("waaaaaa");
		aceng.jalan("wooooo");
		
		tronton.jalan("bombom");

		System.out.println(aceng.food.calorie);
		System.out.println(gtr.food.calorie);
		System.out.println(tronton.food.calorie);
	}
}
