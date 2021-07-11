import java.util.*;

public class  Letalo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = 7;


        boolean seznamId [] = new boolean [128 * 8];

        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            int trenutniId = (sortirajKolona(id, 127, 0, i1, 'F' ) * 8 +
                    sortirajKolona(id, i1, i1, 10, 'L' ));

            seznamId[trenutniId] = true;

        }
        for(int i = 1; i < seznamId.length - 1; i++){
            if((!seznamId[i]) && seznamId[i-1] && seznamId[i + 1]){
                System.out.println(i);
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