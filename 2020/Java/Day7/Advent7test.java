import java.util.*;

public class Advent7test {

    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> kovcki = new ArrayList<String>();
        String a = "Owo";
        int stevec = 0;
        int vrstice = 0;
        int[]memorizacija = new int[596];


        while (vrstice < 595){
            a = sc.nextLine();
            vrstice++;
            if(!(a.indexOf("shiny gold bag") == 0) &&!a.isEmpty())
                kovcki.add(a);
        }

        for(int t = 0; t < kovcki.size(); t++){
            int zacasni = stevec;
            String vrstica = kovcki.get(t);
            stevec += stZlatih(kovcki, vrstica, t, memorizacija);
            memorizacija[t]= (stevec > zacasni) ? 1 :  2 ;
        }
        System.out.println(stevec);




    }

    public static int stZlatih(ArrayList<String> kovkci,String vrstica, int t, int[] memorizacija){
        String []tabela = vrstica.split("contain");

        if(tabela[1].contains("no other bags")) {
            memorizacija[t] = 2;
            return 0;
        }
        if(tabela[1].contains("shiny gold bag")) {
            memorizacija[t] = 1;
            return 1;
        }

        String []rekurzija = tabela[1].split(",");


        for(int j = 0; j < kovkci.size(); j++){
            String trenutni = rekurzija[t].substring(3, rekurzija[i].length());
            if(kovkci.get(j).indexOf(trenutni) == 0) {
                obstaja = true;
                vrstica = kovkci.get(j);
                System.out.println(vrstica);
                if(memorizacija[j] == 1) return 1;
                if(memorizacija[j]==2) return 0;

            }
        }
        


    }
}