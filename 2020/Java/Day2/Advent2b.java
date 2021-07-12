import java.util.*;
import java.io.*;

public class Advent2b {

    public static void main(String[] args) {

        try{
            File obj = new File("Data2.txt");
            File res = new File("Resultb.txt");
            Scanner reader = new Scanner(obj);

            int placeOne = 0;
            int placeTwo = 0;
            char letter;
            int numCorrect = 0; //number of lines that are correct


            while(reader.hasNextLine()) {

                String a = reader.nextLine();
                String[] array = a.split(":"); //split each line by ':' we get: (min-max letter) and (password)->ex: array[0]="1-3 a", array[1] ="abcde"
                String password = array[1];
                String limits = array[0]; //min, max + letter

                String[] temp = limits.split(" "); // split onto 1-3 and a
                String[] numbers = temp[0].split("-");

                placeOne = Integer.parseInt(numbers[0]);
                placeTwo = Integer.parseInt(numbers[1]);
                letter = temp[1].charAt(0);
                //check if exactly one of the letters at places placeOne and placeTwo is the same as char 'letter'
                if((letter == password.charAt(placeOne) && letter != password.charAt(placeTwo))
                        || letter == password.charAt(placeTwo) && letter != password.charAt(placeOne) ) numCorrect++;
            }

            try{

                if(res.createNewFile()) {
                    FileWriter writer = new FileWriter(res);
                    writer.append(numCorrect + "\n");
                    writer.close();
                }
            }
            catch(FileNotFoundException e) {
                e.printStackTrace();

            }
        System.out.println(numCorrect);
        reader.close();
        }

        catch(IOException e){
            e.printStackTrace();
        }
 
    }



}