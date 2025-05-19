import co.edu.uniquindio.poo.Conductor;
import co.edu.uniquindio.poo.Camion;
import co.edu.uniquindio.poo.Estacion;
import co.edu.uniquindio.poo.Recaudador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class EstacionTest {
    @Test
    public void testAgregarYBuscarRecaudador() {
        Estacion est = new Estacion("Est1", "Dept1");
        Recaudador rec = new Recaudador("Luis", "Ramirez", "111", LocalDate.parse("1990-01-01"), 1200.0);

        est.agregarRecaudador(rec);
        Recaudador buscado = est.buscarRecaudador("Luis Ramirez");  // ✔️ esto está bien ahora

        assertNotNull(buscado);  // ✔️ verifica que no sea null
        assertEquals("luis ramirez", buscado.getNombreCompleto());
    }

    @Test
    public void testConductoresConCamionPesado() {
        Conductor c1 = new Conductor("Carlos", "Soto", "222", LocalDate.parse("1980-03-03"));
        Camion camionPesado = new Camion("CAM100", 1, 4, 15);
        c1.asignarVehiculo(camionPesado);

        Conductor c2 = new Conductor("Maria", "Lopez", "333", LocalDate.parse("1990-04-04"));
        Camion camionLigero = new Camion("CAM101", 2, 2, 8);
        c2.asignarVehiculo(camionLigero);

        Estacion est = new Estacion("Est3", "Dept3");

        List<Conductor> resultado = est.conductoresConCamionCargaPesada(Arrays.asList(c1, c2));

        assertEquals(1, resultado.size());
        assertEquals("Carlos", resultado.get(0).getNombre());
    }
}