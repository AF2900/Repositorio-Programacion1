package co.edu.uniquindio.poo;

public class Carro extends Vehiculo {
    private boolean electrico;
    private boolean servicioPublico;

    public Carro(String placa, int peajesPagados, boolean electrico, boolean servicioPublico) {
        super(placa, peajesPagados);
        this.electrico = electrico;
        this.servicioPublico = servicioPublico;
    }

    public boolean isElectrico() { return electrico; }
    public boolean isServicioPublico() { return servicioPublico; }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public void setServicioPublico(boolean servicioPublico) {
        this.servicioPublico = servicioPublico;
    }

    @Override
    public String descripcion() {
        return "Carro - Placa: " + placa +
                ", Eléctrico: " + electrico +
                ", Servicio Público: " + servicioPublico;
    }

    @Override
    public double calcularPeaje() {
        double tarifa = 10000;
        if (electrico) tarifa *= 0.8;
        if (servicioPublico) tarifa *= 1.15;
        return tarifa;
    }
}