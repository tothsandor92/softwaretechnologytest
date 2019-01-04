package masik;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import sajat_csomag.Alkalmazott;
import sajat_csomag.Szoftverfejleszto;
import sajat_csomag.Alkalmazott.Beosztas;

public class Proba {

	public static void main(String[] args) {
		File file = new File("src//adatok.txt");

		Szoftverfejleszto fejlesztok = new Szoftverfejleszto();
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) {
				Alkalmazott alkalmazott = sorFeldolgozo(line);
				fejlesztok.add(alkalmazott);
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

		//
		System.out.println("\nA fejlesztõk ABC sorrendben:");
		Alkalmazott[] fej = fejlesztok.toArray_ABC();
		for (int i = 0; i < fej.length; i++)
			System.out.println(fej[i]);
		System.out.println("\nA senior fejlesztõk:");
		ArrayList<Alkalmazott> sen = fejlesztok.senior();
		for (int i = 0; i < sen.size(); i++)
			System.out.println(sen.get(i));
		System.out.println("\nA legjobb fejlesztõ:");
		System.out.println(fejlesztok.getLegjobb());
	}

	private static Alkalmazott sorFeldolgozo(String sor) throws ParseException {
		String[] resz = sor.split(",");
		String nev = resz[0];
		int fiezetes = Integer.parseInt(resz[1]);
		int munkatapsztalat = Integer.parseInt(resz[2]);
		Beosztas beosztas = Beosztas.valueOf(resz[3]);
		return new Alkalmazott(nev, fiezetes, munkatapsztalat, beosztas);
	}
}
