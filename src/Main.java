import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA ===");

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        

    }
}