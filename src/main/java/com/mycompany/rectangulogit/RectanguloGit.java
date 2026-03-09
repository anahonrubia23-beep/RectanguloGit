/**
 * Paquete principal de ejecución del proyecto RectanguloGit.
 */

package com.mycompany.rectangulogit;

/**
 *
 * @author anaho
 */
public class RectanguloGit {

    //Método principal (main) que inicia la ejecución del programa.
    public static void main(String[] args) {
        
        //Creamos los obejtos rectangulo
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo(2, 1);
        
        //Muestran los resultados del rectángulo
        r1.verRectangulo();
        r2.verRectangulo();
        
        r1.setBase(3);
        r1.setAltura(2);
        r1.verRectangulo();
        
    }
}
