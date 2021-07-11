import java.util.*;

public class Advent3 {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int lokacija = 0;
        int stevec = 0;
        String a = sc.nextLine();
        int dolzina = a.length();

        while (sc.hasNextLine()){
            a = sc.nextLine();
            if(a.isEmpty()) break;
            lokacija = (lokacija + 3) % dolzina;
            if(a.charAt(lokacija) == '#') stevec++;

        }
        System.out.println(stevec);

    }


}