package br.com.javadeveloper;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a agência do cliente: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo do cliente: ");
        double saldo = scanner.nextDouble();

        ContaBanco conta = new ContaBanco();

        conta.setNumero(numeroConta);
        conta.setAgencia(agencia);
        conta.setNomeCliente(nome);
        conta.setSaldo(saldo);

        System.out.println(conta);
    }
}
