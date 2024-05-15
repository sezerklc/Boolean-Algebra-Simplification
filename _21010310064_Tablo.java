package _21010310064_SezerCan_Kilic;

public class _21010310064_Tablo {
	public static int[][] tablo() {
		int[][] table = new int[16][5];

        
		for (int i = 0; i < 8; i++) {
            table[i][0] = 0;
        }
        for (int i = 8; i < 16; i++) {
            table[i][0] = 1;
        }

        for (int i = 0; i < 16; i++) {
            table[i][1] = (i / 4) % 2;
        }

        for (int i = 0; i < 16; i++) {
            table[i][2] = ((i / 2) % 2);
        }

        for (int i = 0; i < 16; i++) {
            table[i][3] = i % 2;
        }
        table[0][4]=0;
        int [][]Table= table;

        return Table;
       
       
           
        }
		
}
