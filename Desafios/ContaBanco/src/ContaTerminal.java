/* TO DO:
    * Conhecer e importar a classe Scanner;
    * Exibir as mensagens para o nosso usuário;
    * Obter pela classe Scanner os valores digitados no terminal;
    * Exibir a mensagem da conta criada.
*/

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        Integer conta = scanner.nextInt();

        System.out.println("Digite o valor do saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}