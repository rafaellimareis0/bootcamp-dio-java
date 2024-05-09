/*
    Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
    Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
    Revise sobre regras de declaração de variáveis
    Atributo	Tipo	Exemplo
    Numero	Inteiro	1021
    Agencia	Texto	067-8
    Nome Cliente	Texto	MARIO ANDRADE
    Saldo	Decimal	237.48
    Revise sobre terminal, main args e a classe Scanner
    Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
    Programa: "Por favor, digite o número da Agência !"
    Usuário: 1021 (depois ENTER para o próximo campo)
    Revise sobre concatenação e classe String com método concat
    Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
    "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
    Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.
*/

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