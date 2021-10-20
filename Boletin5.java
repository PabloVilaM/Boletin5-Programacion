package boletin5;

import java.util.Scanner;

public class Boletin5 {

    public static void main(String[] args) {
        
        Consumo primerConsumo = new Consumo();
        
        primerConsumo.SetLitros(50);
        primerConsumo.SetpGas(1.57f);
        
        Consumo segundoConsumo = new Consumo(200,500f,120f,1.60f);
        
        double cm = segundoConsumo.consumoMedio(210, 21.5f);
        System.out.println("El consumo medio es : " + cm);
        
       segundoConsumo.SetLitros(100);
       float litros = segundoConsumo.GetLitros();
       System.out.println("Los litros son : " + litros);
       float velocidad = segundoConsumo.GetvMedia();
        System.out.println("La velocidad media es : " + velocidad);
       
       //Lo de arriba seria la manera de hacerlo con Setters y las funcones creadas, ahora voy a pedir las cosas por teclado.
       
       Consumo tercerConsumo = new Consumo();
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Dime los km y el precio al que esta la gasolina/litro");
       double km = sc.nextDouble();
       float precio = sc.nextFloat(); //Supondremos que el usuario da los valores que solicita el ejercicio.
       
       Consumo cuartoConsumo = new Consumo(200,500f,120f,1.60f);
       System.out.println("El consumo medio es : " + cm);
        System.out.println("Dime os litros que queres e a velocidade media");
      float vm = sc.nextFloat();
      float l = sc.nextFloat();
      
      cuartoConsumo.SetLitros(l);
      cuartoConsumo.SetvMedia(vm);
       System.out.println("Los litros son : " + l);
       System.out.println("La velocidad media es : " + vm);
       
       
       
        
    }
    
}
