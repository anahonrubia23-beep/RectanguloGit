

package com.mycompany.rectangulogit;

/**
 *
 * @author anaho
 */
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
        base = 0;
        altura = 0;
    }
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

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

    public int area() {
        return base * altura;
    }

    public int perimetro() {
        return  (2 * base + 2 * altura);
    }

    public void verRectangulo() {
        System.out.println("Datos del Rectángulo:");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
        System.out.println("---------------------------");
    }
}
