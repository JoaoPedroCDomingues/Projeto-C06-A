public class Computador {

    String marca;
    float preco;
    SistemaOperacional sisOp;
    HardwareBasico hard;
    MemoriaUSB mem;

    public Computador(){
        sisOp = new SistemaOperacional();
        hard = new HardwareBasico();
    }

    void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preco: R$" + preco);
        System.out.println("Processador: " + hard.nome[0] + " " + hard.capacidade[0] + "Mhz");
        System.out.println("Memória: " + hard.nome[1] + " " + hard.capacidade[1] + "Gb");
        System.out.println("Armazenamento: " + hard.nome[2] + " " + hard.capacidade[2] + "Gb");
        System.out.println("Sistema operacional: " + sisOp.nome + " de " + sisOp.tipo + " bits");
        System.out.println("Exclusivo! Acompanha: " + mem.nome + " de " + mem.capacidade + "Gb");

    }

    void addMemoriaUSB(MemoriaUSB musb){
        this.mem = musb;
    }
}
