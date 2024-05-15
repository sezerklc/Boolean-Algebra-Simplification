package _21010310064_SezerCan_Kilic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

public class _21010310064_main {

	public static void main(String[] args) throws IOException {
		File file= new File("boole.txt");
		BufferedReader reader=null;
	    reader= new BufferedReader(new FileReader(file));
	    String girdi= reader.readLine();
		
		_21010310064_Degisken Degiskenler= new _21010310064_Degisken(girdi);
	    Character F= Degiskenler.F;
		Character A= Degiskenler.A;
		Character B= Degiskenler.B;
		Character C= Degiskenler.C;
		Character D= Degiskenler.D;
		System.out.println("Doğruluk tablosu:");
		System.out.println();
		System.out.println(A+" "+B+" "+C+" "+D+" "+F);
		
		ArrayList<String> bilesen = _21010310064_Degisken.Bilesen(girdi);
				
		int [][] table=_21010310064_Tablo.tablo();
		
        table[0][4]=1;
        for (int i = 0; i < 16; i++) {
            System.out.println(table[i][0] + " " + table[i][1] + " " + table[i][2] + " " + table[i][3]+" "+table[i][4]);
        }
        String Bilesen = _21010310064_Degisken.AcikFonk(bilesen);
		System.out.println(Bilesen);

	}
}
