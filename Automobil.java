
public class Automobil {
	protected int an;
	protected String denumire;

	public Automobil() {
		an = 1921;
		denumire = "Mers";
	}

	public Automobil(int an, String denumire) {
		this.an = an;
		this.denumire = denumire;
	}

	public int getAn() {
		return an;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setAn(int newAn) {
		this.an = newAn;
	}

	public void setDenumire(String newDenumire) {
		this.denumire = newDenumire;
	}

	public Automobil myClone() {
		Automobil a = new Automobil(this.an, this.denumire);
		return a;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Automobil a = null;
		a = (Automobil) super.clone();
		a.an = this.an;
		a.denumire = this.denumire;
		return a;
	}

	@Override
	public String toString() {
		return "An:" + this.an + " Denumire:" + this.denumire;
	}
}
