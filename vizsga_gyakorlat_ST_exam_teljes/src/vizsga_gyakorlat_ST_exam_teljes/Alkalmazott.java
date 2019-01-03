package vizsga_gyakorlat_ST_exam_teljes;

import java.util.Comparator;
public class Alkalmazott implements Comparable<Alkalmazott> {

	
	@Override
	public int compareTo(Alkalmazott o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	public enum Beosztas{
		JUNIOR, SENIOR, MANAGER
	}
	
	private String nev;
	private int fizetes;
	private int eve_szama;
	private Beosztas beosztas;
	public Alkalmazott(String nev, int fizetes, int eve_szama, Beosztas beosztas) {
		super();
		this.nev = nev;
		this.fizetes = fizetes;
		this.eve_szama = eve_szama;
		this.beosztas = beosztas;
	}
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public int getFizetes() {
		return fizetes;
	}
	public void setFizetes(int fizetes) {
		this.fizetes = fizetes;
	}
	public int getEve_szama() {
		return eve_szama;
	}
	public void setEve_szama(int eve_szama) {
		this.eve_szama = eve_szama;
	}
	public Beosztas getBeosztas() {
		return beosztas;
	}
	public void setBeosztas(Beosztas beosztas) {
		this.beosztas = beosztas;
	}
	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev + ", fizetes=" + fizetes + ", eve_szama=" + eve_szama + ", beosztas="
				+ beosztas + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((beosztas == null) ? 0 : beosztas.hashCode());
		result = prime * result + eve_szama;
		result = prime * result + fizetes;
		result = prime * result + ((nev == null) ? 0 : nev.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alkalmazott other = (Alkalmazott) obj;
		if (beosztas != other.beosztas)
			return false;
		if (eve_szama != other.eve_szama)
			return false;
		if (fizetes != other.fizetes)
			return false;
		if (nev == null) {
			if (other.nev != null)
				return false;
		} else if (!nev.equals(other.nev))
			return false;
		return true;
	}
	
	public static class JosagComparator implements Comparator<Alkalmazott>{

		@Override
		public int compare(Alkalmazott arg0, Alkalmazott arg1) {
			if (arg0.fizetes / arg0.eve_szama > arg1.fizetes / arg1.eve_szama)
				return 1;
			if (arg1.fizetes / arg1.eve_szama > arg0.fizetes / arg0.eve_szama)
				return -1;
			return 0;
		}
		
	}
	
}
