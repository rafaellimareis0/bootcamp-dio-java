public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 10.0;
        
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atual na conta: " + saldo);
        } else{
            System.out.println("Saldo disponível menor que o solicitado, seu saldo atual é: " + saldo);
        }
    }
}
