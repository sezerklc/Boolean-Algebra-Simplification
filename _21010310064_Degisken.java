package _21010310064_SezerCan_Kilic;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class _21010310064_Degisken {
	
	List<Character> list = new ArrayList<>();
	Character F;
	Character A;
	Character B;
	Character C;
	Character D;
	
	public _21010310064_Degisken(String girdi) {
		Set<Character> charSet = new LinkedHashSet<Character>();
		 for (int i= 0; i<girdi.length(); i++) {
		 char x=girdi.charAt(i);
			if (x!='='&& x!='+'&& x!=' '&& x != '\'' ) {
				charSet.add(x);
			}
		}
		 List<Character> list = new ArrayList<Character>(charSet);
		    Character F=list.get(0);
			Character A=list.get(1);
			Character B=list.get(2);
			Character C=list.get(3);
			Character D=list.get(4);
	     this.list=list;
	     this.F=F;
	     this.A=A;
	     this.B=B;
	     this.C=C;
	     this.D=D;
	     
  }	
	public static ArrayList<String> Bilesen(String girdi) {
		ArrayList<String> bilesen = new ArrayList<>(Arrays.asList(girdi.split(" ")));
		bilesen.remove(0);
		bilesen.remove(0);
		for (int i = 0; i < bilesen.size(); i++) {
            String eleman = bilesen.get(i);
            if(eleman.equals("+")) {
            	continue;
            }
            bilesen.set(i, eleman);
		}
		for(int i=0; i<bilesen.size();i++) {
			
		}
		return bilesen;
		
	}
	public static String AcikFonk(ArrayList <String> bilesen) {
		String mevcut;
		String fonk="F = ";
		for (int i=0; i<bilesen.size(); i++) {
		    mevcut= bilesen.get(i);
			if (!mevcut.contains("A")) {
				fonk= "A"+mevcut+"+"+"A'"+mevcut;	
			}
		}
			ArrayList<String>Bilesen= Bilesen(fonk);
			for (int i=0; i<Bilesen.size(); i++) {
			    mevcut= Bilesen.get(i);
				if (!mevcut.contains("B")) {
					fonk= "B"+mevcut+"+"+"B'"+mevcut;
				}
			}
			Bilesen= Bilesen(fonk);
				for (int i=0; i<Bilesen.size(); i++) {
				    mevcut= Bilesen.get(i);
					if (!mevcut.contains("C")) {
						fonk= "C"+mevcut+"+"+"C'"+mevcut;
					}
			}
					Bilesen= Bilesen(fonk);
					for (int i=0; i<Bilesen.size(); i++) {
					    mevcut= Bilesen.get(i);
						if (!mevcut.contains("D")) {
							fonk= "D"+mevcut+"+"+"D'"+mevcut;
				
			}
			
	      }  
		return fonk;
        }	
	}
	
	

















