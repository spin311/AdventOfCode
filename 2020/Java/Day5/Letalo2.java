import java.util.*;

public class  Letalo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = 7;

        boolean tabela [][] = new boolean [128][8];
        int seznamId [] = new int [128 * 8];

        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            int trenutnaVrsta =sortirajKolona(id, 127, 0, i1, 'F' );
            int trenutnaKolona =  sortirajKolona(id, i1, i1, 10, 'L' );
            tabela[trenutnaVrsta][trenutnaKolona] = true;

            }
        for(int i = 0; i <tabela.length; i++){
            for(int j = 0; j < tabela[0].length; j++){
                if((!tabela[i][j]) && ){
                    System.out.println(i * 8 + j);
                }

            }
        }



    }

    private static int sortirajKolona(String kolona, int zgMeja, int i1, int i2, char a) {
        int spMeja = 0;
        for (int i = i1; i < i2; i++) {
            if (kolona.charAt(i) == a) {
                zgMeja = (zgMeja + spMeja) / 2;

            } else {
                spMeja = (spMeja + zgMeja) / 2 + (((spMeja + zgMeja) % 2 == 0) ? 0 : 1);

            }
        }
        return spMeja;
    }

}