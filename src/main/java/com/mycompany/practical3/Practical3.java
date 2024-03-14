package com.mycompany.practical3;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
public class Practical3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        if (System.getProperty("os.name", "?").toLowerCase().startsWith("windows")) {
            System.setOut(new java.io.PrintStream(System.out, true, "UTF-8"));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Райманов В.М.\nВариант 1\nВведите марку автомобиля: ");
        String carName = scanner.nextLine();
        Car car = new Car(carName);
        AutoService autoService = new AutoService();
        autoService.modify(car);
        System.out.println("Изменённое название автомобиля: " + car.getName());
    }
}

