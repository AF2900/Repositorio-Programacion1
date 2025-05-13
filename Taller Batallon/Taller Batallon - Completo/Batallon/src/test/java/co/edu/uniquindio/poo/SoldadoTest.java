package co.edu.uniquindio.poo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.logging.Logger;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


class SoldadoTest {
    private Batallon batallon;
    private Soldado s1, s2, s3;
    private static final Logger LOG = Logger.getLogger(SoldadoTest.class.getName());

    @Test
    //Prueba 1
    public void testAsiganrMisionSoldado() {
        LOG.info("La prueba Asignar mision a soldado inicio");

        Batallon newBatallon = new Batallon("Jhan", 0011);

        Soldado soldado = new Soldado("santi", "109245", 19, true, Especializacion.MEDICO, RangoMilitar.CABO);
        newBatallon.getListSoldados().add(soldado);

        LocalDate fechaMision = LocalDate.of(2024, 12, 12); // fecha correcta

        Mision mision = new Mision(1212, fechaMision, "Quimbaya");

        newBatallon.getListMisiones().add(mision);


        boolean resultado = newBatallon.asignarSoldadoMision("1212", "109245");
        assertTrue(resultado);
        assertFalse(soldado.getDisponibilidad());
    }

    @Test
    // Prueba 2
    public void liberarSoldadosFinalizadaMision() {
        LOG.info("La prueba liberar soldado de mision finalizada inicio");

        Batallon newBatallon = new Batallon("Octava Bigada", 121700);

        Soldado soldado = new Soldado("Sofi", "11091", 19, false, Especializacion.MEDICO, RangoMilitar.CABO);
        newBatallon.getListSoldados().add(soldado);
        LocalDate fechaMision = LocalDate.of(2024, 12, 12);
        Mision mision = new Mision(1212, fechaMision, "Quimbaya");
        newBatallon.getListMisiones().add(mision);

        newBatallon.asignarSoldadoMision("1212", "11091");

        newBatallon.liberarSoldadosFinalizadaMision(0);

        assertTrue(newBatallon.getListPersonal().get(0).getDisponibilidad());
    }

    @Test
    //Prueba 3
    public void buscarSoldadosPorEspecialidad() {
        LOG.info("La prueba buscar soldado por especialidad inició");
        Batallon newBatallon = new Batallon("MarinaEspecial", 909090);

        Soldado soldado = new Soldado("Andres Juan", "109090", 21, false, Especializacion.MEDICO, RangoMilitar.SARGENTO);
        Soldado soldado2 = new Soldado("Juan", "121224", 23, true, Especializacion.MEDICO, RangoMilitar.SOLDADO);

        newBatallon.getListSoldados().add(soldado);
        newBatallon.getListSoldados().add(soldado2);

        LinkedList<Soldado> resultado = newBatallon.buscarSoldadosPorEspecialidad(Especializacion.MEDICO);

        assertEquals(1, resultado.size(), "Se esperaba un único soldado disponible con especialización MÉDICO.");
        LOG.info("La prueba buscar soldado por especialidad finalizó");
    }

    @BeforeEach
    public void setUp() {
        // Crear batallón
        batallon = new Batallon("Batallón Alfa", 101);

        // Crear soldados
        s1 = new Soldado("Carlos Pérez", "S001", 28, true, Especializacion.MEDICO, RangoMilitar.CABO);
        s2 = new Soldado("Lucía Díaz", "S002", 30, false, Especializacion.COMUNICACIONES, RangoMilitar.CABO);
        s3 = new Soldado("José Martínez", "S003", 26, true, Especializacion.LOGISTICA, RangoMilitar.SARGENTO);

        batallon.getListSoldados().add(s1);
        batallon.getListSoldados().add(s2);
        batallon.getListSoldados().add(s3);
    }

    @Test
    //Prueba 4
    public void testObtenerSoldadosDisponiblesPorRango() {
        LinkedList<Soldado> disponiblesCabo = batallon.obtenerSoldadosDisponiblesPorRango(RangoMilitar.CABO);
        assertEquals(1, disponiblesCabo.size());
        assertTrue(disponiblesCabo.contains(s1));
    }

    @Test
    //Prueba 5
    public void testCalcularEdadPromedioPersonal() {
        double promedio = batallon.calcularEdadPromedioPersonal();
        assertEquals((28 + 30 + 26) / 3.0, promedio);
    }

    @Test
    //Prueba 6
    public void testAgregarID() {
        // Modificamos el ID de un soldado manualmente
        s1.setId("NUEVO123");
        assertEquals("NUEVO123", s1.getId());
    }
}