package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //Método obtener productos precio entre 30k y 55k

    public Productos[] obtenerProductosEntrePrecio() {
        Producto[] listProductosEntrePrecio;
        int tamListProd = 0;

        for (int i = 0; i < listProductos.length; i++) {
            if (listProductos[i].getPrecio > 30000 && listProductos[i].getPrecio < 55000) {
                tamListProd++;
            }
        }

        listProductosEntrePrecio = new Producto[tamListProd];
        int indice = 0;

        for (int i = 0; i < listProductos.length; i++) {
            if (listProductos[i].getPrecio > 30000 && listProductos[i].getPrecio < 55000) {
                listProductosEntrePrecio[indice] = listProductos[i]:
                indice++;
            }
        }
    }

    //Segundo método

    public Cliente[] obtenerClientesCompraTV(){
        Cliente[] listClientesCompra;
        int tamListCliente = 0;

        for(int i = 0; i < listClientes.length; i++){
            Cliente clienteIteracion = listClientes[i];
            for(int j = 0; j < clienteIteracion.getListaVentasCliente().length; j++){
                for(int k = 0; k < listClientes[i].getListaVentasCliente[j].getListaDetallesVenta().length; k++){
                    DetalleVenta newDetalle = listClientes[i].getListaVentasCliente[j].getListaDetallesVenta[k];

                    if(newDetalle.getCantidad == 2 && newDetalle.getProducto().getNombre().equals("TV")){
                        listClientesCompra[indice] = clienteIteracion;
                        indice++;
                    }
                }
            }
        }
        return listClientesCompra;
    }

    //Tercer método

    public Cliente clienteMayorCompras(){
        Cliente clienteMayor;
        int cantComprasMayorCliente = 0;

        for(int i = 0; i < listClientes.length; i++){
            if(listClientes[i].getListVentasCliente.length > cantComprasMayorCliente){
                cantComprasMayorCliente = listClientes[i].getListVentasCliente.length;
                clienteMayor = listClientes[i];
            }
        }

        return clienteMayor;
    }
}