
public class Main {

	public static void main(String[] args) {
		Sertar s1 = new Sertar(18, 22, 15);
		Sertar s2 = new Sertar(26, 18, 10);
		Birou b1 = new Birou(s1, s2, 120, 180, 110);
		b1.Print();
	}

}
