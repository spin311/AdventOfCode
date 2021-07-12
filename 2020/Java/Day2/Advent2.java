import java.util.*;
import java.io.*;

public class Advent2 {

    public static void main(String[] args) {

        try{
        File obj = new File("Data2.txt");
        File res = new File("Result.txt");
        Scanner reader = new Scanner(obj);

        int minimum = 0; //min number of letters
        int maximum = 0; //max number of letters
        char letter;
        int numCorrect = 0; //number of lines that are correct


        while(reader.hasNextLine()) {

            String a = reader.nextLine();
            String[] array = a.split(":"); //split each line by ':' we get: (min-max letter) and (password)->ex: array[0]="1-3 a", array[1] ="abcde"
            String password = array[1];
            String limits = array[0]; //min, max + letter

            String[] temp = limits.split(" "); // split onto 1-3 and a
            String[] numbers = temp[0].split("-");

            minimum = Integer.parseInt(numbers[0]);
            maximum = Integer.parseInt(numbers[1]);
            letter = temp[1].charAt(0);

            int counter = 0; //counter for correct letters in each line

            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) == letter) counter++; 
    
     } 


            if (counter >= minimum && counter <= maximum) numCorrect++; 
            
    }
            try{
                if(res.createNewFile()) {
                    FileWriter writer = new FileWriter(res);
                    writer.append(numCorrect + "\n");
                    writer.close();
                }

            }
            catch(FileNotFoundException e){
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