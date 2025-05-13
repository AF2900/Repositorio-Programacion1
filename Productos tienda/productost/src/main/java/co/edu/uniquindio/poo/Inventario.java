package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Inventario {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public Producto buscarPorCodigo(String codigo) {
        for (Producto p : productos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public List<Producto> listarPorTipo(Class<?> tipo) {
        return productos.stream().filter(p -> tipo.isInstance(p)).collect(Collectors.toList());
    }

    public double calcularValorTotalDisponible() {
        return productos.stream()
                .filter(p -> p.getEstado() == Estado.DISPONIBLE)
                .mapToDouble(Producto::getPrecio)
                .sum();
    }

    public void generarInformePorCategoria() {
        Map<String, List<Producto>> grupos = new HashMap<>();

        for (Producto p : productos) {
            String clase = p.getClass().getSimpleName();
            grupos.computeIfAbsent(clase, k -> new ArrayList<>()).add(p);
        }

        for (String categoria : grupos.keySet()) {
            List<Producto> grupo = grupos.get(categoria);
            double total = grupo.stream().mapToDouble(Producto::getPrecio).sum();
            System.out.println(categoria + ": " + grupo.size() + " productos, valor total: $" + total);
        }
    }

    public void aplicarDescuentoAElectronicosGarantizados(int meses, double porcentaje) {
        for (Producto p : productos) {
            if (p instanceof Electronico) {
                Electronico e = (Electronico) p;
                if (e.getGarantiaMeses() > meses) {
                    e.aplicarDescuento(porcentaje);
                }
            }
        }
    }
}