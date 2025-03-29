public class Cliente{

    String nome;
    long cpf = 40028922012L;


    float calculaTotalCompra(int prom1, int prom2, int prom3){

        int val;

        val = (prom1 * 1892) + (prom2 * (1892 + 1234) + (prom3 * (1892 + 5678)));

        return val;
    }
}
