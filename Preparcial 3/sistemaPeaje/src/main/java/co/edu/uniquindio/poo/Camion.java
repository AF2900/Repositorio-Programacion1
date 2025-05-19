package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private int ejes;
    private double capacidadCarga;

    public Camion(String placa, int peajesPagados, int ejes, double capacidadCarga) {
        super(placa, peajesPagados);
        this.ejes = ejes;
        this.capacidadCarga = capacidadCarga;
    }

    public int getEjes() { return ejes; }
    public double getCapacidadCarga() { return capacidadCarga; }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String descripcion() {
        return "Camión - Placa: " + placa + ", Ejes: " + ejes + ", Carga: " + capacidadCarga + " toneladas";
    }

    @Override
    public double calcularPeaje() {
        double tarifa = 7000 * ejes;
        if (capacidadCarga > 10) tarifa *= 1.1;
        return tarifa;
    }
}