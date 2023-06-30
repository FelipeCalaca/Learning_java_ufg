import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class FolhaPagamento {
    public static void main(String[] args) {
        String nomeArquivo = "C:\\Users\\windows\\IdeaProjects\\LabArquivos\\src\\11-1 - funcionarios.txt";

        List<Funcionario> funcionarios = lerFuncionariosDoArquivo(nomeArquivo);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.mostraFuncionario());
        }
    }

    public static List<Funcionario> lerFuncionariosDoArquivo(String nomeArquivo) {
        List<Funcionario> funcionarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split("#");
                String nome = campos[0];
                char sexo = campos[1].charAt(0);
                double salario = Double.parseDouble(campos[2]);
                int dependentes = Integer.parseInt(campos[3]);

                Funcionario funcionario = new Funcionario(nome, sexo, salario, dependentes);
                funcionarios.add(funcionario);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return funcionarios;
    }
}