import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        int firstNumber = new Scanner(System.in) .nextInt(); // вывод в консоль первого числа

        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in) .nextInt(); // вывод в консоль второго числа

        System.out.println(firstNumber+secondNumber); //вывод в консоль суммы
        System.out.println(firstNumber-secondNumber); // вывод в консоль разности
        System.out.println(firstNumber*secondNumber); // вывод в консоль произведения
        System.out.println((double) firstNumber/secondNumber); // присвоение int(целочисленный тип)
        // double(вещественного типа), чтобы вычислял дробные и вывод в консоль частного
    }
}

