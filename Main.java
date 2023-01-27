import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Ksiazka k1 = new Ksiazka("Bruce Eckel", "Thinking in Java", 2006);
		Ksiazka k2 = new Ksiazka("Radoslaw Sokol", "ABC ochrony przed wirusami", 2004);
    Czytelnik c1 = new Czytelnik("Anna","Dermin");
    Czytelnik c2 = new Czytelnik("Rafał","Pot");
		
		FileWriter fw = new FileWriter("plik.txt");
    FileWriter fw2 = new FileWriter("czytelnicy.txt");
		BufferedWriter bw = new BufferedWriter(fw);
    BufferedWriter bw2 = new BufferedWriter(fw2);
		
		bw.write("-------\n");
		bw.write(k1.toString());
		bw.write("-------\n");
		bw.write("" + k2);
		
		bw.close();
    
    bw2.write("-------\n");
		bw2.write(c1.toString());
		bw2.write("\n");
		bw2.write("" + c2);
		
		bw2.close();
		
		FileReader fr = new FileReader("plik.txt");
    FileReader fr2 = new FileReader("czytelnicy.txt");
		BufferedReader br = new BufferedReader(fr);
		BufferedReader br2 = new BufferedReader(fr2);
    
		while(true) {
			String wiersz = br2.readLine();
			if(wiersz == null) 
        break;
			System.out.print(wiersz + "\n");
		}
		
		br.close();
    br2.close();
	}
}

/*
 * Zadania:
 * 1. Stworz wlasna klase Czytelnik (z atrybutami: imie oraz nazwisko).
 * 2. Otworz do zapisu kolejny plik (np. czytelnicy.txt).
 * 3. Zapisz do niego 2 obiekty klasy Czytelnik.
 * 4. Wypisz na ekran zawartosc pliku czytelnicy.txt.
 * 
 */
