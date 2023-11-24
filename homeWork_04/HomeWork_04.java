package homeWork_04;

import java.util.Scanner;

/**
 * 10.09.2023
 * ImputOutput
 *
 * @author Mihail Nedioglo (AIT TR)
 */
/*
Введите ваше имя:
Марсель
Введите вашу фамилию:
Сидиков
Введите ваш город:
Берлин
Введите ваш возраст:
29
Введите ваш рост (в метрах):
1.85
 */
public class HomeWork_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя: " );
        String name = scanner.nextLine();

        System.out.println("Введите вашу фамилию: ");
        String nachName = scanner.nextLine();

        System.out.println("Введите ваш город: ");
        String stadt  = scanner.nextLine();

        System.out.println("Введите ваш возраст ");
        int alt = scanner.nextInt();

        System.out.println("Введите ваш рост (в метрах): ");
        double hoch = scanner.nextDouble();

        String message = "Меня зовут " + name + " " + nachName + ", мне " + alt + " лет, я из " + stadt + ", мой рост - " + hoch;
        System.out.println(message);

        //Вывод:
        //Меня зовут Марсель Сидиков, мне 29 лет, я из Берлин, мой рост - 1.85






    }
}
