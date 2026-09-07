public class Kendaraan {
	int jumlahRoda;
	Makanan food;

	public Kendaraan(int jumlahRoda) {
		this.jumlahRoda = jumlahRoda;

		if(this.jumlahRoda > 4) {
			food = new Makanan();
		}
		else if (this.jumlahRoda <= 4) {
		    food = new Makanan();
		    food.defaultCalorie(3);
		}
	}

	public Kendaraan() {
		this.jumlahRoda = 4;
		food = new Makanan();
		food.defaultCalorie(0);
		
	}
 
	public void jalan(String message) {
		System.out.println("Vrmm" + message + "......////");

		if(this.food != null && this.jumlahRoda > 4) {
			this.food.calorie++;
		}
	}
}
