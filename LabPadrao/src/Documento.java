// Classe abstrata Documento
abstract class Documento {
    public static int numero;
    private String remetente;
    private String tipo;

    public Documento(String remetente, String tipo) {
        this.numero ++ ;
        this.remetente = remetente;
        this.tipo = tipo;
    }

    public abstract void criar();

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }
    public String getRemetente(){
        return remetente;
    }
}