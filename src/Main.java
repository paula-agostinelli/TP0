//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        Tiempo tiempo = new Tiempo();
        Tiempo2 tiempo2 = new Tiempo2();

        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
                /*new Locale("es", "ES"));*/
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String fechaLarga = tiempo.getFecha().format(formatoLargo);
        String fechaCorta = tiempo.getFecha().format(formatoCorto);

        System.out.println ("Forma anemica");
        // la clase tiempo solo guarda los datos y la responsabilidad de formatear esta en el main

        System.out.println(fechaLarga);
        System.out.println(fechaCorta);

        System.out.println("Forma no anemica");
        //la clase tiempo tiene los matodos propios

        System.out.println(tiempo2.obtenerFechaLarga());
        System.out.println(tiempo2.obtenerFechaCorta());
    }
}