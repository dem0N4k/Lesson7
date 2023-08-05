import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        } */

      /*  boolean isContinue = true;
        while (isContinue) {
            System.out.println("Continue 1/0?");
            int x = new Scanner(System.in).nextInt();
            if (x == 0) {
                isContinue = false;
            }
        }
        System.out.println("Конец");*/

        boolean isContinue = true;
        int x = 0;
        int y = 0;
        while (isContinue) {
            System.out.println("\t\t\tВыберите куда двинуться?\n1 - вверх\n2 - вниз\n" +
                    "3 - вправо\n4 - влево\n");
            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                System.out.println("Робот пошел на клетку вверх!");
                y++;
            } else if (input == 2) {
                System.out.println("Робот пошел на клетку вниз!");
                y--;
            } else if (input == 3) {
                System.out.println("Робот пошел на клетку вправо!");
                x++;
            } else if (input == 4) {
                System.out.println("Робот пошел на клетку влево!");
                x--;
            } else {
                System.out.println("Ошибка!\nИгра окончена!");
                isContinue = false;
                continue;
            }
            System.out.println("Текущие координаты робота: " + x + " " + y + "\n\n\n");
        }
    }
}
