import java.util.*;

public class Advent6 {

    public static void main (String[]args){

        //int 'a' = 97, int 'z' = 122
        Scanner sc = new Scanner(System.in);

        int stevec = 0;
        int vrstice = 0;

        while (sc.hasNextLine() && vrstice < 2256) {
            int []tabela = new int[26];
            String a = "h";
            while(!a.isEmpty()) {
                a = sc.nextLine();
                vrstice ++;
                for(int i = 0; i< a.length(); i++) {
                    int temp = a.charAt(i) - 97;
                    tabela[temp] = 1;

                } //tabelo na i-tem mestu nastavimo na 1
            }
              stevec += stPravilnih(tabela);

        }
        System.out.println(stevec);






    }
    public static int stPravilnih (int[]tabela) {
        int stevilo = 0;
        for(int i = 0; i < tabela.length; i++) stevilo += tabela[i];
        return stevilo;
    }

}