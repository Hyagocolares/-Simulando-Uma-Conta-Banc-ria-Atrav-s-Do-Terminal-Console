
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Número da Agência: ");
        numero = sc.nextInt();

        System.out.println("Agência: ");
        sc.nextLine();
        agencia = sc.nextLine();

        System.out.println("Seu saldo: ");
        saldo = sc.nextDouble();


        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " ja está disponivel para saque.");

    }
}