import java.util.*;

public class Advent2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int spMeja = 0;
        int zgMeja = 0;
        char crka;
        int stPravilnih = 0;


        while(sc.hasNextLine()) {

             String a = sc.nextLine();
            String[] tabela = a.split(":"); // vrstico razdelimo na dva dela
            String geslo = tabela[1];
            String mejeK = tabela[0]; //meje in koda(znak)

            String[] pomozna = mejeK.split(" "); // razdelimo na 1-3 in a
            String[] stevila = pomozna[0].split("-");

            spMeja = Integer.parseInt(stevila[0]);
            zgMeja = Integer.parseInt(stevila[1]);
            crka = pomozna[1].charAt(0);

            int stevec = 0;

            for (int i = 0; i < geslo.length(); i++) {
                if (geslo.charAt(i) == crka) stevec++;
            }

            if (stevec >= spMeja && stevec <= zgMeja) stPravilnih++;
            System.out.println(stPravilnih);
        }








     /*  for(String i : tabela){
           System.out.println(i);

       }

      */
    }



}