
package com.mycompany.rectangulogit;

/**
 *
 * @author anaho
 */
public class RectanguloGit {

    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo(2, 1);
        
        r1.verRectangulo();
        r2.verRectangulo();
        
        r1.setBase(3);
        r1.setAltura(2);
        r1.verRectangulo();
        
    }
}
