package Lesson_3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main2 {
    /*
    Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
     */
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myList.add(random.nextInt(0,10));
        }
        System.out.println(myList);
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);
    }
}
