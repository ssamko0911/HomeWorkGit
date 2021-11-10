/*
* Вы работаете в банке, и клиент хочет взять у вас кредит. Вы самостоятельно не считаете в уме сколько он может получит, а даете завести числа клиента в вашу программу.
Программе, для расчета - может ли клиент оплатить кредит, нужны такие данные:
а) Сколько клиент получает
б) сколько у него есть денег на конец месяца
с) на какой срок он хочет его взять
д) сумма
(порядок ввода можно изменять).
Мы говорим о том, что все данные всегда корректны (не может клиент запросить -100) и мы их не проверяем на логику.

Если клиенту кредит с ЕГО условиями доступен - выводим:
"Поздравляем, вам может быть выдан кредит с сроком и суммой."
Если клиенту с ЕГО условиями кредит НЕ доступен, указываем 2 текста друг за другом:
"Вы можете взять кредит, но если увеличите кол-во месяцев (указать сколько месяцев доступно на его сумму)."

"Или вы можете уменьшить сумму кредита на и за этот срок вы сможете его погасить"

Данные о зарплате и сколько у него есть денег на конец месяца - всегда не изменяемые.

Например:
Получает 1000
На конец месяца у него остается 500
Хочет взять 400.
На 1 месяц:
Ему будет одобрен кредит.
Например:
Получает 1000
На конец месяца у него остается 500
Хочет взять 600
На 1 месяц.
Ему будет отказано в кредите.
Предлагаем ему либо уменьшить сумму кредита до 500 или же увеличить кол-во месяцев до двух.
*/

package HomeTaskLesson006_Loops;

import java.util.Scanner;

public class BankTaskOne {

    public static int term;
    public static double creditAmmount;
    public static Scanner in = new Scanner(System.in);
    public static final double WAGE = 1000;
    public static final double MONEYENDOFMONTH = 500;

    public static void main(String[] args) {

        System.out.println("Программа является банковским скоррингом - определяет возможность выдачи кредита.");
        System.out.println("Зарплата клиента составляет " + WAGE + " грн. Остаток средств на конец месяца - "
                + MONEYENDOFMONTH + " грн.\n");
        int customerTerm = getTerm();
        double customerAmmount = getCreditAmmount();
        estimateCreditOption(customerTerm, customerAmmount);
    }

    public static int getTerm() {
        System.out.println("Введите желаемый срок кредитования в месяцах (от 1 до 12): ");
        term = in.nextInt();
        return term;
    }

    public static double getCreditAmmount() {
        System.out.println("Введите сумму кредита: ");
        creditAmmount = in.nextDouble();
        return creditAmmount;
    }

    public static void estimateCreditOption(int term, double amount) {
        if (MONEYENDOFMONTH * term > amount) {
            System.out.println("Поздравляем, вам может быть выдан кредит в сумме " + amount + " грн. сроком на "
                    + term + " месяц(ев).");
        } else {
            System.out.println("Вы можете взять кредит, но если увеличите количество месяцев до "
                    + (term + 1) + "-x"
                    + ".\nИли вы можете уменьшить сумму кредита до " + (MONEYENDOFMONTH * term) + " грн. и за"
                    + " выбранный Вами срок сможете его погасить.\n");
        }

    }
}


