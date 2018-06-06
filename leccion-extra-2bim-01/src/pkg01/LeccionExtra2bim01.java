/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01;

/**
 *
 * @author Gerson
 */
public class LeccionExtra2bim01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arreglo3 = new double[6];//Declaración de arreglos con posiciones sin datos 
        double[] arreglo1 = {110, 220, 430, 140, 250, 460};//Declaración de arreglos con datos 
        double[] arreglo2 = {10, 20, 30, 40, 50, 60};
        double prom=0; //Declaración variable
        for(int cont=0; cont<arreglo3.length;cont++){ //se cumple hasta la longitud de el arreglo 3 (6)
            arreglo3 [cont] = arreglo1[cont] / arreglo2[cont];//proceso
        }
        System.out.println("Arreglo1\tArreglo2\tArreglo3\n");//Presentacion de títulos
        for(int i=0; i<arreglo3.length;i++){
            System.out.printf("%.1f\t\t%.1f\t\t%.1f\n",arreglo1[i],arreglo2[i],arreglo3[i]);// presentación de arreglos
            prom = prom+arreglo3[i]/6;//proceso para el promedio arreglo 3 
        }
        System.out.printf("%s%.2f\n","El promedio del arreglo 3  es: ",prom);//Salida del promedio arreglo 3 
    }
    
}
