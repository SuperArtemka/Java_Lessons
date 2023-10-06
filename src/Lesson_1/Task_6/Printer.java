package Lesson_1.Task_6;

class Answer {
    public void printPrimeNums(){
        int i,j;

        for (i=2;i<1000;i++)
        {int k=0;

            for (j=2;j<=i;j++)
            {
                if ((i%j) == 0)
                    k++;
            }
            if (k<2)
                System.out.println(i);
        }

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}