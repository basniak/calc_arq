package calc;

import java.util.Scanner;

public class Calc {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Soma s = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao mult = new Multiplicacao();
        Divisao div = new Divisao();

        double x;
        double y;
        System.out.printf("Informe o valor 1: ");
        y = sc.nextDouble();

        System.out.printf("Informe valor 2: ");
        x = sc.nextDouble();


        System.out.println("Soma:"+ s.soma(x, y));
        System.out.println("Subtração:"+ sub.subtracao(x, y));
        System.out.println("Multiplicação:"+ mult.multiplicacao(x, y));
        System.out.println("Divisão:"+ div.divisao(x, y));
    }
}