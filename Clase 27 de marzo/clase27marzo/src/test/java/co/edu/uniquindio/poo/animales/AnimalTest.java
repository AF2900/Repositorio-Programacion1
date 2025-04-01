package co.edu.uniquindio.poo.animales;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    @DisplayName("Prueba método equals")
    void test(){
        assertEquals(3,2);
        /// fallar: assertNotEquals(2,2);

        assertNotEquals(carnivoro.getCantidadPatas(), 4);
    }

}