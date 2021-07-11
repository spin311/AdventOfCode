import java.util.*;
import java.io.*;

public class Advent1 {

    private static final int X = 2020; //number we are looking for

    public static int findSum(List<Integer> numbers) {
        int a, b, len, firstNum, secondNum;
        len = numbers.size();

        for(a = 0; a < len; a++) {
            for(b = len - 1; b > a; b--){
                //iterating thru all items in ArrayList until sum of a+b = X
                firstNum = numbers.get(a);
                secondNum = numbers.get(b);
                if(firstNum + secondNum == X) {
                return (firstNum * secondNum);
                        }
                    }
                }
                return 0;
    }


    public static void main(String[]args) {
        try {
            File obj = new File("Data1.txt");
            File res = new File("Result.txt");
            Scanner reader = new Scanner(obj); //scanner for txt file
            List<Integer> numbers = new ArrayList<Integer>();
            while(reader.hasNextInt()) {
                int current = reader.nextInt(); //read current line(int)
                numbers.add(current);
                }
                Collections.sort(numbers);
                int anwser = findSum(numbers);
                //create new 'Result.txt' file(if it doesn't exist) and write the anwser in the file
                    try{
                        if(res.createNewFile()) {
                            FileWriter writer = new FileWriter(res);
                            writer.append(""+ anwser + "\n");
                            writer.close();
                        }
                    }
                    catch(IOException e){
                        e.printStackTrace();
                    }

                System.out.println(anwser); //write the anwser in terminal

        reader.close();
                }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}