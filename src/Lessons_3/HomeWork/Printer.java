package Lessons_3.HomeWork;

import java.util.Arrays;
import java.util.SortedSet;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже/ Реализовал не слиянием, т.к. нет времени
        Arrays.sort(a);
        return a;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}
