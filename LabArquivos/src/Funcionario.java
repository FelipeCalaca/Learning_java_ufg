import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
public class Funcionario {
    String nome;
    char sexo;
    double salario;
    int dependentes;

    Funcionario(String nome, char sexo, double salario, int dependentes) {
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
        this.dependentes = dependentes;
    }

    public double impostoRenda() {
        double reducaoDep = 189.59 * dependentes;
        if (salario <= 1903.98)
            return 0;
        else if (salario <= 2826.65)
            return roundToTwoDecimalPlaces((salario * 7.5 / 100 - 142.80) - reducaoDep);
        else if (salario <= 3751.05)
            return roundToTwoDecimalPlaces((salario * 15 / 100 - 354.80) - reducaoDep);
        else if (salario <= 4664.68)
            return roundToTwoDecimalPlaces((salario * 22.5 / 100 - 636.13) - reducaoDep);
        else
            return roundToTwoDecimalPlaces((salario * 27.5 / 100 - 869.36) - reducaoDep);
    }

    private double roundToTwoDecimalPlaces(double value) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        DecimalFormat decimalFormat = new DecimalFormat("#.00", symbols);
        String roundedValue = decimalFormat.format(value);
        return Double.parseDouble(roundedValue.replace(',', '.'));
    }


    public String mostraFuncionario() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return nome + " " + sexo + " " + decimalFormat.format(salario) + " " + dependentes + " " + impostoRenda();
    }
}