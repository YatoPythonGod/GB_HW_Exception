package Task_1;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import javax.sound.midi.Soundbank;
import java.io.*;

public class Task_1_1 {
    public static void main(String[] args) {

        try {
//            System.out.println(getLength(null));
//            System.out.println(getValue(new int [] {1, 2}, 2));
            readFile("test");
        } catch (NullPointerException | IndexOutOfBoundsException | IOException e){
            System.out.println(e.getClass().getName());
        }

    }


    public static int getLength(int [] array){
        return array.length;
    }

    public static int getValue(int [] array, int index){
        return array[index];
    }


    public static void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);
        file.read();
    }


}
