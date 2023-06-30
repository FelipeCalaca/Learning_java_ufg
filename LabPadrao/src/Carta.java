// Classe concreta Carta
class Carta extends Documento {
    public Carta(String remetente) {
        super(remetente, "Carta");
    }

    public void criar() {
        System.out.println("Criando um documento carta: " + getNumero() + ", " + getRemetente());
    }
}