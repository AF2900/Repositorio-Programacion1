import co.edu.uniquindio.poo.Carro;
import co.edu.uniquindio.poo.Conductor;
import co.edu.uniquindio.poo.Moto;
import co.edu.uniquindio.poo.Vehiculo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

public class ConductorTest {
    @Test
    public void testAsignarVehiculoYVehiculosPorTipo() {
        Conductor conductor = new Conductor("Juan", "Perez", "12345", LocalDate.parse("1990-01-01"));
        Moto moto = new Moto("MOTO123", 2, 250);

        conductor.asignarVehiculo(moto);

        List<Vehiculo> motos = conductor.getVehiculos("Moto");

        assertEquals(1, motos.size());
        assertTrue(motos.get(0) instanceof Moto);
    }

    @Test
    public void testTotalPagadoPeajes() {
        Conductor conductor = new Conductor("Ana", "Lopez", "67890", LocalDate.parse("1985-05-05"));
        Moto moto = new Moto("MOTO456", 1, 150);
        Carro carro = new Carro("CAR456", 1, true, false);

        conductor.asignarVehiculo(moto);
        conductor.asignarVehiculo(carro);

        double expected = moto.calcularPeaje() + carro.calcularPeaje();
        assertEquals(expected, conductor.totalPagado());
    }
}
