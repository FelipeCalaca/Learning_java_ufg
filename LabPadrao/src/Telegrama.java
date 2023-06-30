// Classe concreta Telegrama
class Telegrama extends Documento {
    public Telegrama(String remetente) {

        super(remetente, "Telegrama");
    }

    public void criar() {
        System.out.println("Criando um documento telegrama: " + getNumero() + ", " + getRemetente());
    }
}