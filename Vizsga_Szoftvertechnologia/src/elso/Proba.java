package elso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Proba {
	private List<Zene> zenek;
	
	public Proba() {
		this.zenek = new ArrayList<Zene>();
	}
	
	public void add(Zene alkalmazott) {
		for (int i = 0; i < zenek.size(); i++) {
			if (zenek.get(i).getCim().equals(alkalmazott.getCim())){
				return;}
		}
		zenek.add(alkalmazott);
	}
	
	public int size() {
		return zenek.size();
	}
	
	public Zene get(String nev) {
		for (int i = 0; i < zenek.size(); i++) {
			if (zenek.get(i).getCim().equals(nev))
				return zenek.get(i);
		}
		return null;
	}
	
	public void remove(String nev) {
		for (int i = 0; i < zenek.size(); i++) {
			if (zenek.get(i).getCim().equals(nev))
				zenek.remove(i);
		}
	}
	
	public Zene[] toArray_ABC() {
		ArrayList<Zene> copy = new ArrayList<Zene>(zenek);
		Collections.sort(copy);
		Zene[] rendezett = new Zene[copy.size()];
		copy.toArray(rendezett);
		return rendezett;
	}
	
	public Zene getLegolcsobb() {
		return Collections.min(this.zenek, new Zene.MusicComparator());
	}
	
	public ArrayList<Zene> cd_tipus() {
		ArrayList<Zene> cd_tipus = new ArrayList<Zene>();
		for (int i = 0; i < zenek.size(); i++) {
			if (zenek.get(i).getStilus().equals(Zene.Stilus.JAZZ))
				cd_tipus.add(zenek.get(i));
		}
		return cd_tipus;
	}
}
