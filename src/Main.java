//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();

        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
                /*new Locale("es", "ES"));*/
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String fechaLarga = tiempo.getFecha().format(formatoLargo);
        String fechaCorta = tiempo.getFecha().format(formatoCorto);

        System.out.println(fechaLarga);
        System.out.println(fechaCorta);
    }
}