import java.util.*;

public class Advent2b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prvoMesto = 0;
        int drugoMesto = 0;
        char crka;
        int stPravilnih = 0;


        while(sc.hasNextLine()) {

            String a = sc.nextLine();
            String[] tabela = a.split(":"); // vrstico razdelimo na dva dela
            String geslo = tabela[1];
            String mejeK = tabela[0]; //meje in koda(znak)

            String[] pomozna = mejeK.split(" "); // razdelimo na 1-3 in a
            String[] stevila = pomozna[0].split("-");

            prvoMesto = Integer.parseInt(stevila[0]);
            drugoMesto = Integer.parseInt(stevila[1]);
            crka = pomozna[1].charAt(0);

            if((crka == geslo.charAt(prvoMesto) && crka != geslo.charAt(drugoMesto))
                    || crka == geslo.charAt(drugoMesto) && crka != geslo.charAt(prvoMesto) ) stPravilnih++;
            System.out.println(stPravilnih);
        }






    }



}