import java.util.Scanner;
import java.io.*;
public class Main {
    public static void main(String[] args) {

        //Спросить пользователя "как тебя зовут?"
        //прочитать его имя
        //Если имя заканчивается на а, я или и, вывести "Приветик!", иначе выевсти "Здарова!"

        System.out.println("Введите Ваше имя!");
        Scanner sc = new Scanner(System.in);
        String fname = sc.next();
        //System.out.println("Вы ввели имя: " + fname + ".");


        String string = fname;
        String x = string.substring(string.length() - 1);
        if (x.equals("а") || x.equals("я") || x.equals("и")) System.out.println("Приветик!");
        else System.out.println("Здарова!");
    }
    }






