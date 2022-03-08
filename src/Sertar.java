
public class Sertar {
	private int latime = 0;
	private int lungime = 0;
	private int inaltime = 0;

	public Sertar(int latime, int lungime, int inaltime) {
		if (latime < 1 || latime > 100)
			this.latime = 25;
		else
			this.latime = latime;
		if (lungime < 1 || lungime > 100)
			this.lungime = 25;
		else
			this.lungime = lungime;
		if (inaltime < 1 || inaltime > 100)
			this.inaltime = 14;
		else
			this.inaltime = inaltime;
	}

	public void Print() {
		System.out.println(
				"Sertar - Latime: " + this.latime + ", Lungime: " + this.lungime + ", Inaltime " + this.inaltime);
	}

}
