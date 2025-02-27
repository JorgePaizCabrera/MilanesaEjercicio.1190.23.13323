/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectolibro;

/**
 *
 * @author jorge
 */
public class libroclass {
    private String titulo;
    private String autor;
    private int año;
    private double precio;

    public libroclass(String titulo, String autor, int anio, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = anio;
        this.precio = precio;
    }

    public double calcularDescuento() {
        if (año < 2000) {
            return precio * 0.10; // 10% de descuento
        } else {
            return precio * 0.05; // 5% de descuento
        }
    }

    public double precioConDescuento() {
        return precio - calcularDescuento();
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + año);
        System.out.println("Precio original: $" + precio);
        System.out.println("Precio con descuento: $" + precioConDescuento());
    }

    public static void main(String[] args) {
        libroclass libro = new libroclass("Cien años de soledad", "Gabriel García Márquez", 1967, 20.00);
        libro.mostrarInformacion();
    }
    
}
