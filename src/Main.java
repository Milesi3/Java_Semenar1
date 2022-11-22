

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)//

//        System.out.println("Введите n:");
//        int n = input.nextInt();
//        System.out.print("Треугольное n: ");
//        int T = n * (n + 1) / 2;
//        System.out.println(T);
//        int A = 1;
//        System.out.print("Факториал n: ");
//        for (int i = 1; i <= n; i++) {
//            A = A * i;
//        }
//        System.out.println(A);

        // Вывести все простые числа от 1 до 1000
//        System.out.print("Все простые числа от 1 до 1000: ");
//        int top = 1000;
//        for (int i=2;i<top;i++) {
//            if (checkEz(i))
//                System.out.println(i);
//        }

        // Реализовать простой калькулятор
//        System.out.print("Введите первый аргумент ");
//        int num1 = input.nextInt();
//        System.out.print("Введите второй аргумент ");
//        int num2 = input.nextInt();
//        System.out.print("Введите знак операции ");
//        char operation = input.next().charAt(0);
//        int result = calc(num1,num2,operation);
//        System.out.println("Результат операции: "+result);
//
//        input.close();
    }

    public static int calc(int num1, int num2, char operation){
        int result = 0;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
        }
        return result;
    }
    public static boolean checkEz(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }
}