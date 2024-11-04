/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rodri
 */
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String id;
    private List<DetallePedido> detalles;
    private double total;

    public Pedido(String id) {
        this.id = id;
        this.detalles = new ArrayList<>();
        this.total = 0.0;
    }

    public String getId() {
        return id;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public double getTotal() {
        return total;
    }

    public void agregarDetalle(DetallePedido detalle) {
        detalles.add(detalle);
        total += detalle.calcularSubtotal();
    }

    public void actualizarTotal() {
        total = 0.0;
        for (DetallePedido detalle : detalles) {
            total += detalle.calcularSubtotal();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pedido ID: " + id + "\n");
        for (DetallePedido detalle : detalles) {
            sb.append(detalle.toString()).append("\n");
        }
        sb.append("Total: ").append(total);
        return sb.toString();
    }
}
