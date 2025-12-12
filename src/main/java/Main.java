import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Agencia: ");
        String agencia = sc.nextLine();
        System.out.print("Nome do Titular: ");
        String titular = sc.nextLine();
        System.out.print("Tipo da Conta  (CONTA_CORRENTE, CONTA_POUPANCA, CONTA_SALARIO): ");
        String tipoConta = sc.nextLine();

        Conta conta1 = new Conta(
                agencia,
                titular,
                TipoConta.valueOf(tipoConta)
        );


        System.out.println(conta1);


    }
}
