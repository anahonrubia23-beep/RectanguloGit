/**
 * Paquete que contiene la lógica para la gestión de figuras geométricas, 
 * específicamente rectángulos en un sistema de coordenadas.
 */

package com.mycompany.rectangulogit;

/**
 *
 * @author anaho
 */
public class Rectangulo {
    //Longitud de la base del rectángulo
    private int base;
    //Longitud de la altura del rectangulo
    private int altura;

    //Constructor vacio que crea por defecto
    public Rectangulo() {
        base = 0;
        altura = 0;
    }
    
    //Constructor que inicializa el rectangulo con dimensiones específicas
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //Getter y Setter
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    //Calcula el área total del rectangulo
    public int area() {
        return base * altura;
    }

    //Calcula el perimetro total del rectangulo
    public int perimetro() {
        return  (2 * base + 2 * altura);
    }

    //Método para visualizar los datos del rectangulo
    public void verRectangulo() {
        System.out.println("Datos del Rectángulo:");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
        System.out.println("---------------------------");
    }
    
}
