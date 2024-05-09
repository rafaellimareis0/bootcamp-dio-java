package est.bootcamp.anatomiaDeClasses;
public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.err.println(nomeCompleto);
        int i = 1;
        for(i = 1; i < 11; i++){
            System.err.println(i);
        }

        //testando
        int a, b;
        a = 2;
        b = 2;
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //testando expressoes
        boolean cond1 = true;
        boolean cond2 = true;
        if(cond1 && cond2){
            System.out.println("as duas sao verdadeiras");
        } 
        if (cond1 || cond2){
            System.out.println("apenas uma das duas é verdadeira");
        }
    }
}