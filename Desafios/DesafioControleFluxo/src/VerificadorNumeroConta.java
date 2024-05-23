import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.nextLine();

            verificarNumeroConta(numeroConta);

            // Se o método verificarNumeroConta não lançou exceção, o número é válido
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // Captura a exceção IllegalArgumentException lançada pelo método verificarNumeroConta
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fecha o scanner para liberar recursos
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
