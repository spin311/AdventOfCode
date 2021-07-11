import java.util.*;

public class  Letalo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxId = 0;
        int i1 = 7;

        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            int trenutniId = (sortirajKolona(id, 127, 0, i1, 'F' ) * 8 +
                    sortirajKolona(id, i1, i1, 10, 'L' ));

            if (trenutniId > maxId) {
                maxId = trenutniId;
            }

        }
        System.out.println(maxId);
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