
public class Birou {
	Sertar s1;
	Sertar s2;
	private int latime = 0;
	private int lungime = 0;
	private int inaltime = 0;

	public Birou(Sertar s1, Sertar s2, int latime, int lungime, int inaltime) {
		this.s1 = s1;
		this.s2 = s2;

		if (latime < 1 || latime > 500)
			this.latime = 120;
		else
			this.latime = latime;
		if (lungime < 1 || lungime > 500)
			this.lungime = 100;
		else
			this.lungime = lungime;
		if (inaltime < 1 || inaltime > 200)
			this.inaltime = 70;
		else
			this.inaltime = inaltime;
	}

	public void Print() {
		System.out.println(
				"Birou: Latime: " + this.latime + ", Lungime: " + this.lungime + ", Inaltime: " + this.inaltime);
		s1.Print();
		s2.Print();
	}
}
