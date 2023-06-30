// Classe concreta FabricaDocumentos
class FabricaDocumentos extends Fabrica {
    public Documento fabricarDocumento(String tipo, String remetente) {
        // Lógica para determinar qual tipo de documento criar com base no tipo informado
        if (tipo.equals("Carta")) {
            return new Carta(remetente);
        } else if (tipo.equals("Notificação")) {
            return new Notificacao(remetente);
        } else if (tipo.equals("Telegrama")) {
            return new Telegrama(remetente);
        } else {
            return null;
        }
    }
}