import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DataAniversario {
    public static void main(String[] args) {

        DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = LocalDate.parse("30/12/2006", mascara);

        Period periodo = Period.between(nascimento, hoje);

        System.out.printf("%s anos, %s meses e %s dias",
                periodo.getYears(),
                periodo.getMonths(),
                periodo.getDays()
        );
    }
}
