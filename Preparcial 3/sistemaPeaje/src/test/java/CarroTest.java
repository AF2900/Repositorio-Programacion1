import co.edu.uniquindio.poo.Carro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarroTest {
    @Test
    public void testDescripcion() {
        Carro carro = new Carro("CAR123", 5, true, false);
        assertEquals("Carro - Placa: CAR123, Eléctrico: true, Servicio Público: false", carro.descripcion());
    }

    @Test
    public void testCalcularPeajeElectrico() {
        Carro carro = new Carro("ELEC01", 2, true, false);
        assertEquals(8000.0, carro.calcularPeaje());
    }

    @Test
    public void testCalcularPeajeServicioPublico() {
        Carro carro = new Carro("PUB01", 1, false, true);
        assertEquals(11500.0, carro.calcularPeaje());
    }

    @Test
    public void testCalcularPeajeElectricoYServicioPublico() {
        Carro carro = new Carro("ELECPUB", 3, true, true);
        assertEquals(9200.0, carro.calcularPeaje());
    }

    @Test
    public void testCalcularPeajeNormal() {
        Carro carro = new Carro("NORMAL", 0, false, false);
        assertEquals(10000.0, carro.calcularPeaje());
    }
}