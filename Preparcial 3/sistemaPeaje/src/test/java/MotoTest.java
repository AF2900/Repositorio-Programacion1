import co.edu.uniquindio.poo.Moto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MotoTest {
    @Test
    public void testDescripcion() {
        Moto moto = new Moto("XYZ123", 3, 250);
        String descripcion = moto.descripcion();
        assertEquals("Moto - Placa: XYZ123, Cilindraje: 250", descripcion);
    }


    @Test
    public void testCalculoPeajeCilindrajeMayor200() {
        Moto moto = new Moto("ABC987", 2, 250);
        assertEquals(7000.0, moto.calcularPeaje());
    }

    @Test
    public void testCalculoPeajeCilindrajeMenorIgual200() {
        Moto moto = new Moto("DEF456", 1, 150);
        assertEquals(5000.0, moto.calcularPeaje());
    }
}
