import co.edu.uniquindio.poo.Camion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CamionTest {
    @Test
    public void testDescripcion() {
        Camion camion = new Camion("CAM001", 4, 4, 12.5);
        assertEquals("Camión - Placa: CAM001, Ejes: 4, Carga: 12.5 toneladas", camion.descripcion());
    }

    @Test
    public void testCalcularPeajeConCargaAlta() {
        Camion camion = new Camion("CAM002", 3, 4, 15);
        double expected = 4 * 7000 * 1.1;  // 30800.0
        assertEquals(expected, camion.calcularPeaje());
    }

    @Test
    public void testCalcularPeajeConCargaBaja() {
        Camion camion = new Camion("CAM003", 1, 2, 8);
        double expected = 2 * 7000; // 14000.0
        assertEquals(expected, camion.calcularPeaje());
    }

    @Test
    public void testCapacidadAltaVerdadero() {
        Camion camion = new Camion("CAM004", 1, 3, 11);
        assertTrue(camion.getCapacidadCarga() > 10);
    }

    @Test
    public void testCapacidadAltaFalso() {
        Camion camion = new Camion("CAM005", 1, 3, 9);
        assertTrue(camion.getCapacidadCarga() < 10);
    }
}