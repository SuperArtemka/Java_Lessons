package Lesson_1.Task_5;

    class Answer {
        public int countNTriangle(int n) {
            // Введите свое решение ниже
            int triangle = n * (n + 1) / 2;
            return triangle;
        }

    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Main {
        public static void main(String[] args) {
            int n = 0;

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                n = 5;
            }
            else{
                n = Integer.parseInt(args[0]);
            }

            // Вывод результата на экран
            Answer ans = new Answer();
            int itresume_res = ans.countNTriangle(n);
            System.out.println(itresume_res);
        }
    }

