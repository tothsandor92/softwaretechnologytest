package masodik;
import elso.Proba;
import elso.Zene;
import elso.Zene.Stilus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;


public class Kiprobal {

	public static void main(String[] args) {
		File file = new File("src//adatok.txt");
		Proba kiprobal = new Proba();
		
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) {
					Zene zenek = sorFeldolgozo(line);
					kiprobal.add(zenek);
	}
			System.out.println("Beolvasás Kész!");
		} catch (IOException ex) {
			System.out.println("Hiba történt: " + ex.getMessage());
		} catch (ParseException e) {
			System.out.println("A feldolgozás sikertelen!");
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException ex) {
				System.out.println("Hiba a file lezárás közben: " + ex.getMessage());
			}
		}

		System.out.println("\nA zenék cím szerint ABC sorrendbe rendezve: ");
		
		for (Zene zen : kiprobal.toArray_ABC())
			System.out.println(zen);

		System.out.println("\nA JAZZ típusú CD-k: ");
		for (Zene zen : kiprobal.cd_tipus())
			System.out.println(zen);

			
			System.out.println("\nA legolcsóbb CD adatai:");
			System.out.println(kiprobal.getLegolcsobb());
	}
			
			private static Zene sorFeldolgozo(String sor) throws ParseException {
			String[] resz = sor.split(",");
			String cim = resz[0];
			int ar = Integer.parseInt(resz[1]);
			int hossz = Integer.parseInt(resz[2]);
			Stilus stilus = Stilus.valueOf(resz[3]);
			return new Zene(cim, ar, hossz, stilus);
		}

}
