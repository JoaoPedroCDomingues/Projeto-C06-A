public class Cliente{

    String nome;
    long cpf = 40028922012L;
    static int prom1, prom2, prom3;


    float calculaTotalCompra(){

        int val;

        val = (prom1 * 1892) + (prom2 * (1892 + 1234) + (prom3 * (1892 + 5678)));

        return val;
    }
}
