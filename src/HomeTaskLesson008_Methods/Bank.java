/*
Задание 2
Используя IntelliJ IDEA, создайте класс Bank.
Представьте, что вы реализуете программу для банка, которая помогает определить, погасил ли клиент
кредит или нет. Допустим, ежемесячная сумма платежа должна составлять 100 грн. Клиент должен
выполнить 7 платежей, но может платить реже большими суммами. Т.е., может двумя платежами по 300
и 400 грн. Закрыть весь долг.
Создайте метод, который будет в качестве аргумента принимать сумму платежа, введенную экономистом
банка. Метод выводит на экран информацию о состоянии кредита (сумма задолженности, сумма
переплаты, сообщение об отсутствии долга).
*/


package HomeTaskLesson008_Methods;

import java.util.Scanner;

public class Bank {
    static double clientLoanSum = 1000.00;
    static double regularLoanPayment = 200.00;

    public static void main(String[] args) {

        System.out.println("Введите сумму регулярного платежа: ");
        Scanner in = new Scanner(System.in);
        System.out.println(calculateDebt(in.nextDouble()));
    }

    public static String calculateDebt(double payment) {
        double result = clientLoanSum - payment;
        if (result <= 0) {
            return String.format("Ваш кредит погашен, сумму превышения регулярного платежа равна %.2f",
                    payment - regularLoanPayment);
        } else {
            return String.format("Платёж принят, остаток долга: %.2f", clientLoanSum - payment);
        }
    }

}
