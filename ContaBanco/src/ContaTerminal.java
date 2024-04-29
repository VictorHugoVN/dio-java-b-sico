import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Por favor, informe o número da agência: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Agência: ");
        String agencia = sc.nextLine();
        System.out.println("Nome do(a) cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Saldo: R$");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque");

    }
}