package src.com.fedasov.timeConvertor;

import java.util.Scanner;

/*
 *
 * Программа для конвертирования секнд в часы!
 *
 */

public class TimeToHour {
    public static void main(String[] args) {
        System.out.println("Введите количество секунд: ");
        Scanner scan = new Scanner(System.in);
        float seconds = scan.nextFloat();
        System.out.printf("Значение часов в секундах %.1f часов. ", seconds / 3600);
    }
}
