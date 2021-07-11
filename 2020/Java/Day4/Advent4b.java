import java.util.*;

public class Advent4b {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);


        String[]temp = new String[25]; //zacasna tabela za shranjevanje
        int stevecVeljavnih = 0;
        int vrstice = 0;

        while(sc.hasNextLine() && vrstice < 960){
            ArrayList<String> podatki = new ArrayList<String>();
            //prazna vrstica = nov dokument
            String a = "owo";
            while (!a.isEmpty()){
                a = sc.nextLine();
                vrstice++;
                if(!a.isEmpty()) {
                    temp = a.split(" ");
                    Collections.addAll(podatki, temp);
                }
            }
            stevecVeljavnih += preveri(podatki);


        }

        System.out.println(stevecVeljavnih);






    }

    public static int preveri(ArrayList<String> podatki) {

        String[] kljuci = {"byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid"};

            for(int i = 0; i < 7; i++){
                boolean obstaja = false;
                for(int j = 0; j < podatki.size(); j++){
                    String element = podatki.get(j);
                    if(element.contains(kljuci[i])){
                        obstaja = sortiraj(element);
                                break;

                    }
                }
                if(!obstaja) return 0;


            }
            return 1;



    }

    public static boolean sortiraj (String element) {
        String[]tabela = element.split(":");
        String niz = tabela[0]; // kratica pred :
        String geslo = tabela[1]; // vrednost, ki jo dobimo za :

        switch (niz){
            case "byr":
                if(!(geslo.length() == 4)) return false;
            int byrVrednost = Integer.parseInt(geslo);
            return (byrVrednost >= 1920 && byrVrednost <= 2002);


            case "iyr":
                if(!(geslo.length() == 4)) return false;
                 byrVrednost = Integer.parseInt(geslo);
                return (byrVrednost >= 2010 && byrVrednost <= 2020);


            case "eyr":
                if(!(geslo.length() == 4)) return false;
                 byrVrednost = Integer.parseInt(geslo);
                return (byrVrednost >= 2020 && byrVrednost <= 2030);


            case "hgt":
                int hgtVrednost =0;
                String temp = "owo";
                if(geslo.contains("cm")){
                    if(!(geslo.length() == 5)) return false;
                  if(geslo.charAt(0) >= '0' && geslo.charAt(0) <= '9')   temp = geslo.substring(0, 3);
                    hgtVrednost = Integer.parseInt(temp);
                    return(hgtVrednost >= 150 && hgtVrednost <= 193);
                }
                else if(geslo.contains("in")) {
                    if(!(geslo.length()== 4)) return false;
                    temp = geslo.substring(0, 2);
                    if(geslo.charAt(0) >= '0' && geslo.charAt(0) <= '9') hgtVrednost = Integer.parseInt(temp);
                    return(hgtVrednost >= 59 && hgtVrednost <= 76);
                }
                return false;


            case "hcl":
                if(!(geslo.charAt(0) == '#')) return false;
                for(int cezCrke = 1; cezCrke < geslo.length() ; cezCrke++ ){
                    if(!((geslo.charAt(cezCrke) >='0'&& geslo.charAt(cezCrke) <='9')||
                            (geslo.charAt(cezCrke) >='a'&& geslo.charAt(cezCrke) <='f') )) return false;

                }
                return true;


            case"ecl":
                if(!(geslo.length() == 3)) return false;
                String barve = "ambblubrngrygrnhzloth";
                return (barve.contains(geslo));


            case "pid":
                if(!(geslo.length() == 9)) return false;
                for(int pidDolzina = 0; pidDolzina < 9; pidDolzina++){
                    if(!((geslo.charAt(pidDolzina) >= '0') &&(geslo.charAt(pidDolzina) <= '9') )) return false;

                }
                return true;

            default:
                return true;

        }

    }
}