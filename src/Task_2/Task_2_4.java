package Task_2;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task_2_4 {
    public static void main(String[] args) {
        String userString = inputString();
        while (userString.isEmpty()){
            System.out.println("The line is empty!");
            userString = inputString();
        }
        System.out.println(userString);
    }

    public static String inputString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input string: ");
        return sc.nextLine();
    }
}
