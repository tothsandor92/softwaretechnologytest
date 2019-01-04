package sajat_csomag;

import java.util.Comparator;

public class Alkalmazott implements Comparable<Alkalmazott> {
	// 2
	public enum Beosztas {
		JUNIOR, SENIOR, MANAGER
	}

	// 1
	private String nev;
	private int fizetes;
	private int munkatapasztalat;
	private Beosztas beosztas;

	//equals hasznalja
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nev == null) ? 0 : nev.hashCode());
		return result;
	}

	//osszehasonlitashoz kell
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alkalmazott other = (Alkalmazott) obj;
		if (nev == null) {
			if (other.nev != null)
				return false;
		} else if (!nev.equals(other.nev))
			return false;
		return true;
	}

	// 3
	public Alkalmazott(String nev, int fiezetes, int munkatapsztalat, Beosztas beosztas) {
		super();
		this.nev = nev;
		this.fizetes = fiezetes;
		this.munkatapasztalat = munkatapsztalat;
		this.beosztas = beosztas;
	}

	// 4
	@Override
	public String toString() {
		return "név: " + nev + ", fizetés: " + fizetes + ", munkatapasztalat: " + munkatapasztalat
				+ ", beosztás: " + beosztas;
	}

	// 5
	public String getNev() {
		return nev;
	}

	// 5
	public int getFiezetes() {
		return fizetes;
	}

	// 5
	public int getMunkatapsztalat() {
		return munkatapasztalat;
	}

	// 5
	public Beosztas getBeosztas() {
		return beosztas;
	}

	// 12 sorbarendezeshez kell
	@Override
	public int compareTo(Alkalmazott arg0) {
		return this.nev.compareTo(arg0.nev);
	}

	// 6
	public static class JosagComparator implements Comparator<Alkalmazott> {

		@Override
		public int compare(Alkalmazott arg0, Alkalmazott arg1) {
			if (arg0.fizetes / arg0.munkatapasztalat > arg1.fizetes / arg1.munkatapasztalat)
				return 1;
			if (arg1.fizetes / arg1.munkatapasztalat > arg0.fizetes / arg0.munkatapasztalat)
				return -1;
			return 0;
		}
	}
}
