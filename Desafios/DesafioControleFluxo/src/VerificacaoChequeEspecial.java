import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo atual da conta bancária
        double saldo = scanner.nextDouble();

        // Solicita o valor do saque que o cliente deseja realizar
        double saque = scanner.nextDouble();

        // Define o limite do cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Transacao realizada com sucesso.");
        } else {
            // Verifica se o saque ultrapassa o limite do cheque especial
            if (saque <= saldo + limiteChequeEspecial) {
                double saqueComChequeEspecial = saque - saldo;
                saldo = 0;
                System.out.printf("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
