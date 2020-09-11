/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19graduspahrengete;

import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
    private final Scanner scanner = new Scanner(System.in);
    public void run(){
        System.out.println("Конвертер градусов Цельсия в градусы по Фаренгейту");
        System.out.println("Введите градусы по Цельсия");
        double gradC = scanner.nextDouble();
        System.out.println("По фаренгейту это: ");
        double gradF = gradC * 9 / 5 +32;
        System.out.printf("%.2f%n",gradF);
    }
}
