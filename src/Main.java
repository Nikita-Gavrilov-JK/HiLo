import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int wallet = 2000;
        Scanner scanner = new Scanner(System.in);
        int theRandomNum = (int)(Math.random() * 10  - 5);
        System.out.println(theRandomNum);


        while (wallet > 200) {
            System.out.println("Выаш баланс -->>> " + wallet);

            System.out.println("Выберите число от 1 до 100:  ^_^ ");
            int myNumber = scanner.nextInt();
            System.out.println("Вы ввели число " + myNumber);

                if (myNumber == theRandomNum) {
                    System.out.println("Урааа вы победили \\_^_^_/\n Ваш выйграш составил 10 очков");
                } else {
                    System.out.println("Жаль но вы проиграли попробуйте ещё раз) \n");
                    wallet -= 450;
            }
        }
        System.out.println("Увы у вас нет денег приходите позже \n ");
        scanner.close();
    }
}