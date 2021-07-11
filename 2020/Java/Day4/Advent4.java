import java.util.*;

public class Advent4 {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);


        String[]temp = new String[8]; //zacasna tabela za shranjevanje
        int stevecVeljavnih = 0;
        int vrstice = 0;


        while(sc.hasNextLine() && vrstice < 957){
            ArrayList<String> podatki = new ArrayList<String>();
            //prazna vrstica = nov dokument
            String a = "owo";
            while (!a.isEmpty()){
                 a = sc.nextLine();
                 vrstice++;
               temp = a.split(" ");
               Collections.addAll(podatki, temp);
          }
            stevecVeljavnih += preveri(podatki);


        }

        System.out.println(stevecVeljavnih);






    }

    public static int preveri(ArrayList<String> podatki){

        String[] kljuci = {"byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid"};
            for(int i = 0; i < kljuci.length; i++){
                boolean preveri = false;
                for(int j = 0; j < podatki.size(); j++){
                    if(podatki.get(j).contains(kljuci[i])) preveri = true;
                }
                if(!preveri) return 0;

            }
        return 1;


    }
}