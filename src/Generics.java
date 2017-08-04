import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
/**
 * Created by johnclayton on 8/3/17.
 */
public class Generics {

public static void main(String[] args){

    //Creating a new buffer read name and settings its value to null
    BufferedReader inputStream = null;


    LinkedList<String> values = new LinkedList<String>();

    try { //Opening of the try statement and loading of the file

        //text file is loaded into instance inputStream
        //File path had to be entered or compiler couldn't find file location
        inputStream = new BufferedReader(new FileReader("/Users/johnclayton/Documents/Computer Science/JavaPrograms/Intermediate Programming/Week 7/Employee Data.txt"));

        //Start of while statement to properly split a line of text and properly break up
        //the data by the uses of its spaces
        String input;
        
        while(input = inputStream.readline()) != null{
            
            arr.add(input);
        
//         while (true) {
//             String input = inputStream.readLine();
//             if (input == null) break;
            //String[] array = input.split(" ");

            values.add(String.valueOf(input));


            for(String i : values) {

                //System.out.print((i)+"\n");

                //values.removeFirst();

                System.out.print((i)+"\n");


            }

        }

        //This is a catch exception for the first try statement and handles any
        //problems with the loading of the text file


    } catch (IOException io) {

        //Print line will display the error message of what went wrong with the loading of the
        //text file
        System.out.println("File IO exception" + io.getMessage());

    } finally {

        // Need another catch for closing the streams
        try {

            if (inputStream != null) {

                inputStream.close();
            }

        } catch (IOException io) {

            //Print line will display the error message of what went wrong with the closing of the
            //text file
            System.out.println("Issue closing the Files" + io.getMessage());
        }
    }
} //Closing of the main method
}//Closing of the Employee Test Class





