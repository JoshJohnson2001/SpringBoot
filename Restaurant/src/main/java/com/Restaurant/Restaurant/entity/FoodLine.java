package com.Restaurant.Restaurant.entity;

import javax.persistence.*;

@Entity
@Table(name ="foodLines")
public class FoodLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_foodLines")
    private int id_foodLines;
    @Column(name="descripcion")
    private String descripcion;

    public FoodLine() {
        super();
    }

    public FoodLine(int id_foodLines, String descripcion) {
        super();
        this.id_foodLines = id_foodLines;
        this.descripcion = descripcion;
    }

    public int getId_foodLines() {
        return id_foodLines;
    }

    public void setId_foodLines(int id_foodLines) {
        this.id_foodLines = id_foodLines;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "FoodLine{" +
                "id_foodLines=" + id_foodLines +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
