package com.matias.example.entity;

import com.matias.example.model.Cliente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;



@Entity

@Getter

@Setter

public class Factura {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;



    @ManyToOne

    @JoinColumn(name = "cliente_id")

    private Cliente cliente;



    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)

    private List<DetalleFactura> detallesFactura;



    private Date fecha;

    private Double total;



    public int getCantidadTotalProductos() {

        int totalProductos = 0;

        for (DetalleFactura detalle : detallesFactura) {

            totalProductos += detalle.getCantidad();

        }

        return totalProductos;

    }

}