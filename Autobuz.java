
public class Autobuz extends Automobil implements Cloneable {
	private int nrLocuri;
	private int nrLocuriOcupate;
	private int[] locuriOcupate;

	public Autobuz() {
		this.setAn(1923);
		this.setDenumire("BMW");
		nrLocuri = 10;
		nrLocuriOcupate = 3;
		locuriOcupate = new int[] { 1, 2, 3 };
	}

	public Autobuz(int an, String denumire, int nrLocuri, int nrLocuriOcupate, int[] locuriOcupate) {
		super(an, denumire);
		this.nrLocuri = nrLocuri;
		this.nrLocuriOcupate = nrLocuriOcupate;
		this.locuriOcupate = locuriOcupate;
	}

	public Autobuz myClone() {
		Autobuz a = new Autobuz(this.an, this.denumire, this.nrLocuri, this.nrLocuriOcupate, this.locuriOcupate);
		return a;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Autobuz a = null;
		a = (Autobuz)super.clone();
		a.locuriOcupate = this.locuriOcupate;
		a.nrLocuri = this.nrLocuri;
		a.nrLocuriOcupate = this.nrLocuriOcupate;
		return a;
	}
	@Override
	public String toString() {
		String m = "An:" + this.an + " Denumire:" + this.denumire + " nr locuri:" + this.nrLocuri + " nr. locuri oc:"
				+ this.nrLocuriOcupate + "locuri oc:";
		for (int i : locuriOcupate) {
			m += String.valueOf(i) + " ";
		}
		return m;
	}
}
