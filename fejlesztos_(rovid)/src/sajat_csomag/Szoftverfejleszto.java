package sajat_csomag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Szoftverfejleszto {
	// 7
	private List<Alkalmazott> szoftverfejlesztok;

	public Szoftverfejleszto() {
		szoftverfejlesztok = new ArrayList<Alkalmazott>();
	}

	// 8
	public void add(Alkalmazott alkalmazott) {
		for (Alkalmazott alk : szoftverfejlesztok)
			if (alk.getNev().equals(alkalmazott.getNev()))
				return;
		szoftverfejlesztok.add(alkalmazott);
	}

	// 9
	public int size() {
		return szoftverfejlesztok.size();
	}

	// 10
	public Alkalmazott get(String nev) {
		for (Alkalmazott alk : szoftverfejlesztok)
			if (alk.getNev().equals(nev))
				return alk;
		return null;
	}

	// 11
	public void remove(String nev) {
		for (Alkalmazott alk : szoftverfejlesztok)
			if (alk.getNev().equals(nev))
				szoftverfejlesztok.remove(alk);
	}

	// 12
	public Alkalmazott[] toArray_ABC() {
		ArrayList<Alkalmazott> copy = new ArrayList<Alkalmazott>(szoftverfejlesztok);
		Collections.sort(copy);
		Alkalmazott[] rendezett = new Alkalmazott[copy.size()];
		copy.toArray(rendezett);
		return rendezett;
	}

	// 13
	public Alkalmazott getLegjobb() {
		return Collections.max(this.szoftverfejlesztok, new Alkalmazott.JosagComparator());
	}

	// 14
	public ArrayList<Alkalmazott> senior() {
		ArrayList<Alkalmazott> seniorok = new ArrayList<Alkalmazott>();
		for (Alkalmazott alk : szoftverfejlesztok)
			if (alk.getBeosztas().equals(Alkalmazott.Beosztas.SENIOR))
				seniorok.add(alk);
		return seniorok;
	}
}
