import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tiempo2 {

    private LocalDate fecha;

    public Tiempo2() {
        this.fecha = LocalDate.now();
    }

    public String obtenerFechaLarga() {
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy");
        return fecha.format(formatoLargo);
    }

    public String obtenerFechaCorta() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formatoCorto);
    }
}
