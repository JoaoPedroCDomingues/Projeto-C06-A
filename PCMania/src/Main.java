import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cliente c1 = new Cliente();

        Computador com1 = new Computador();
        Computador com2 = new Computador();
        Computador com3 = new Computador();

        MemoriaUSB m1 = new MemoriaUSB();
        MemoriaUSB m2 = new MemoriaUSB();
        MemoriaUSB m3 = new MemoriaUSB();

        int opt;
        float valor;
        int prom1 = 0;
        int prom2 = 0;
        int prom3 = 0;

        c1.nome = "Cleber";

        com1.marca = "Apple";
        com1.preco = 1892;
        com1.hard.nome[0] = "Pentium Core I3";
        com1.hard.capacidade[0] = 2200;
        com1.hard.nome[1] = "Memoria RAM";
        com1.hard.capacidade[1] = 8;
        com1.hard.nome[2] = "HD";
        com1.hard.capacidade[2] = 500;
        com1.sisOp.nome = "Linux Ubuntu";
        com1.sisOp.tipo = 32;
        m1.nome = "Pen-Drive";
        m1.capacidade = 16;

        com2.marca = "Samsung";
        com2.preco = 1892 + 1234;
        com2.hard.nome[0] = "Pentium Core I5";
        com2.hard.capacidade[0] = 3370;
        com2.hard.nome[1] = "Memoria RAM";
        com2.hard.capacidade[1] = 16;
        com2.hard.nome[2] = "HD";
        com2.hard.capacidade[2] = 1000;
        com2.sisOp.nome = "Windows 8";
        com2.sisOp.tipo = 64;
        m2.nome = "Pen-Drive";
        m2.capacidade = 32;

        com3.marca = "Dell";
        com3.preco = 1892 + 5678;
        com3.hard.nome[0] = "Pentium Core I7";
        com3.hard.capacidade[0] = 4500;
        com3.hard.nome[1] = "Memoria RAM";
        com3.hard.capacidade[1] = 32;
        com3.hard.nome[2] = "HD";
        com3.hard.capacidade[2] = 2000;
        com3.sisOp.nome = "Windows 10";
        com3.sisOp.tipo = 64;
        m3.nome = "HD Externo";
        m3.capacidade = 1000;

        com1.addMemoriaUSB(m1);
        com2.addMemoriaUSB(m2);
        com3.addMemoriaUSB(m3);

        System.out.println("Bem vindo(a) senhor(a) " + c1.nome + " à nossa PCMania!");
        System.out.println("PCs disponíveis da nossa promoção: ");
        System.out.println(" ");
        System.out.println("PC 1: ");
        com1.mostraPCConfigs();
        System.out.println(" ");
        System.out.println("PC 2: ");
        com2.mostraPCConfigs();
        System.out.println(" ");
        System.out.println("PC 3: ");
        com3.mostraPCConfigs();
        System.out.println(" ");
        System.out.println("O que deseja fazer?");
        System.out.println("1- Comprar promoção número 1");
        System.out.println("2- Comprar promoção número 2");
        System.out.println("3- Comprar promoção número 3");
        System.out.println("0- Finalizar compra");
        opt = scanner.nextInt();

        do{
            if(opt == 1){
                prom1++;
                System.out.println("Carrinho atualizado! O que deseja fazer?");
                System.out.println("1- Comprar promoção número 1 novamente");
                System.out.println("2- Comprar promoção número 2");
                System.out.println("3- Comprar promoção número 3");
                System.out.println("0- Finalizar compra");
                opt = scanner.nextInt();
            }
            else if (opt == 2){
                prom2++;
                System.out.println("Carrinho atualizado! O que deseja fazer?");
                System.out.println("1- Comprar promoção número 1");
                System.out.println("2- Comprar promoção número 2 novamente");
                System.out.println("3- Comprar promoção número 3");
                System.out.println("0- Finalizar compra");
                opt = scanner.nextInt();
            }
            else if(opt == 3){
                prom3++;
                System.out.println("Carrinho atualizado! O que deseja fazer?");
                System.out.println("1- Comprar promoção número 1");
                System.out.println("2- Comprar promoção número 2");
                System.out.println("3- Comprar promoção número 3 novamente");
                System.out.println("0- Finalizar compra");
                opt = scanner.nextInt();
            }

        }while(opt != 0);

        valor = c1.calculaTotalCompra(prom1, prom2, prom3);

        System.out.println("Dados finais da compra");
        System.out.println("Cliente: " + c1.nome);
        System.out.println("Cpf: " + c1.cpf);
        System.out.println("Quantidade de PCs da promoção 1 adquiridos: " + prom1);
        System.out.println("Quantidade de PCs da promoção 2 adquiridos: " + prom2);
        System.out.println("Quantidade de PCs da promoção 3 adquiridos: " + prom3);
        System.out.println("Valor final da compra: R$ " + valor);
        System.out.println("Agradecemos pela preferência! Até a próxima!");


        scanner.close();
    }
}