public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 6.9;
        String resultado = nota >= 7 ? "aprovado" : nota >= 5 && nota < 7 ? "recuperação" : "reprovado";
        System.out.println(resultado);
    }
}