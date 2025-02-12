import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o número da Agência: ");
        int agencia = sc.nextInt();
        sc.nextLine();
        System.out.print("Agora digite a conta: ");
        String conta = sc.nextLine();
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu saldo %.2f já está disponível para saque %n", nome, agencia, conta, saldo);
    }
}
