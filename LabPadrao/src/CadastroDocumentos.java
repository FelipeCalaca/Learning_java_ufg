// Classe CadastroDocumentos
public class CadastroDocumentos {
    private Fabrica fabricaobj;

    public CadastroDocumentos(Fabrica fabricaparam) {
        this.fabricaobj = fabricaparam;
    }

    public void criarDocumentoModelo(String tipo, String remetente) {
        Documento documento = fabricaobj.fabricarDocumento(tipo, remetente);
        documento.criar();
    }
    //Main abaixo
    public static void main(String[] args) {
        // Utilização do padrão de projeto Factory Method

        // Criação da fábrica de documentos
        Fabrica fabricanova = new FabricaDocumentos();

        // Criação de cadastro de documentos
        CadastroDocumentos cadastro = new CadastroDocumentos(fabricanova);

        // Criação de um documento do tipo "Carta"
        cadastro.criarDocumentoModelo("Carta", "Felipe");

        // Criação de um documento do tipo "Notificação"
        cadastro.criarDocumentoModelo("Notificação", "Perola");

        // Criação de um documento do tipo "Telegrama"
        cadastro.criarDocumentoModelo("Telegrama", "Danyel");

        cadastro.criarDocumentoModelo("Carta", "Jonas");
    }
}