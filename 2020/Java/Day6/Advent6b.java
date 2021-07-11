import java.util.*;

public class Advent6b {

    public static void main (String[]args){

        //int 'a' = 97, int 'z' = 122
        Scanner sc = new Scanner(System.in);

        int stevec = 0;
        int vrstice = 0;

        while (sc.hasNextLine() && vrstice < 2256) {
           ArrayList<String> gesla = new ArrayList<String>();
            String a = "h";
            while(!a.isEmpty()) {
                a = sc.nextLine();
                vrstice++;
                gesla.add(a);
            }
            gesla.remove((gesla.size() -1));
            stevec += stPravilnih(gesla);

        }
        System.out.println(stevec);






    }
    public static int stPravilnih (ArrayList<String> gesla) {
        String prvi = gesla.get(0).toString();
        if(gesla.size() ==1) return prvi.length();

        int stevilo = 0;
        for(int i = 0; i < prvi.length(); i++){
            boolean contains = true;
            for(int j = 1; j < gesla.size(); j++){
                if(gesla.get(j).toString().indexOf(prvi.charAt(i)) == -1) {
                    contains = false;
                    break;
                    }
                }
            stevilo += ((contains) ? 1 : 0) ;

            }
        return stevilo;
        }

    }

