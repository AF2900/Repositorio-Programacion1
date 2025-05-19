import static org.junit.jupiter.api.Assertions.*;

import co.edu.uniquindio.poo.Electronico;
import co.edu.uniquindio.poo.Estado;
import co.edu.uniquindio.poo.Inventario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class ProductoTest {
    @Test
    void testAplicarDescuentoElectronicoConGarantiaSuficiente() {
        Inventario inventario = new Inventario();
        Electronico celular = new Electronico("Celular", "E001", 1000.0, Estado.DISPONIBLE, "Samsung", "Galaxy A52", 24);
        inventario.agregarProducto(celular);

        inventario.aplicarDescuentoGarantia(12, 0.10);

        assertEquals(900.0, celular.getPrecio(), 0.01);
    }


}