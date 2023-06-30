// Classe concreta Notificacao
class Notificacao extends Documento {
    public Notificacao(String remetente) {
        super(remetente, "Notificação");
    }

    public void criar() {
        System.out.println("Criando um documento notificação: " + getNumero() + ", " + getRemetente());
    }
}