package homeWork_03_Zusammen;

import java.util.Scanner;

/**
 * 11.09.2023
 * cohort 35
 *
 * @author Mihail Nedioglo (AIT TR)
 */
/*
Задача 4.
Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3?
Покажите это на конкретных примерах.
 */
public class task_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите какое-то целое число");
        int var = scanner.nextInt();

        System.out.println("Остаток от деления на 2: " + var % 2);
        System.out.println("Остаток от деления на 3: " + var % 3);
    }
}
