package co.edu.uniquindio.poo;

public abstract  class Vehiculo implements ITarifa {
    protected String placa;
    protected int peajesPagados;

    public Vehiculo(String placa, int peajesPagados) {
        this.placa = placa;
        this.peajesPagados = peajesPagados;
    }

    public String getPlaca() { return placa; }
    public int getPeajesPagados() { return peajesPagados; }
    public void setPeajesPagados(int peajesPagados) { this.peajesPagados = peajesPagados; }

    public abstract String descripcion();
    public abstract double calcularPeaje();

}