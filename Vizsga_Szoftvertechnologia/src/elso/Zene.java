package elso;



import java.util.Comparator;
public class Zene implements Comparable <Zene> {

	@Override
	public int compareTo(Zene arg0) {
		
		return this.cim.compareTo(arg0.getCim());
	}

	
	public enum Stilus{
		JAZZ, ROCK, DISCO
	}
	
	private String cim;
	private int ar;
	private int hossz;
	private Stilus stilus;
	
	public Zene(String cim, int ar, int hossz, Stilus stilus) {
		super();
		this.cim = cim;
		this.ar = ar;
		this.hossz = hossz;
		this.stilus = stilus;
	}

	@Override
	public String toString() {
		return "Zene [cim=" + cim + ", ar=" + ar + ", hossz=" + hossz + ", stilus=" + stilus + "]";
	}

	public String getCim() {
		return cim;
	}

	public int getAr() {
		return ar;
	}

	public int getHossz() {
		return hossz;
	}

	public Stilus getStilus() {
		return stilus;
	}

	public void setCim(String cim) {
		this.cim = cim;
	}

	public void setAr(int ar) {
		this.ar = ar;
	}

	public void setHossz(int hossz) {
		this.hossz = hossz;
	}

	public void setStilus(Stilus stilus) {
		this.stilus = stilus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ar;
		result = prime * result + ((cim == null) ? 0 : cim.hashCode());
		result = prime * result + hossz;
		result = prime * result + ((stilus == null) ? 0 : stilus.hashCode());
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
		Zene other = (Zene) obj;
		if (ar != other.ar)
			return false;
		if (cim == null) {
			if (other.cim != null)
				return false;
		} else if (!cim.equals(other.cim))
			return false;
		if (hossz != other.hossz)
			return false;
		if (stilus != other.stilus)
			return false;
		return true;
	}
	
	public static  class MusicComparator implements Comparator<Zene>{

		@Override
		public int compare(Zene arg0, Zene arg1) {
			if (arg1.ar / arg1.hossz > arg0.ar / arg0.hossz)
				return 1;
			if (arg0.ar / arg0.hossz > arg1.ar / arg1.hossz)
			return -1;
			return 0;
		}
		
	}
	
	
}
