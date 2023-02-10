
package Guia1.Calculadora;

import guia1.Calculadora.Calculadora;
import java.util.Scanner;

public class Consola {
public static void main(String[] args){
    Calculadora objeto1= new Calculadora();
    Scanner objetoIn= new Scanner(System.in);
    System.out.println("Menú De Operaciones"); 
    System.out.print("\n 1. Suma \n 2. Resta \n 3. Multiplicación"
            + "\n 4. Division\n 5. Sen\n 6. Cos \n 7. Tan \n 8. Raiz Enesima\n 9. Potencia Enesima\n 10. Calcular el Iva Del 19%  \n Seleccione la operación: "); 
    int s=objetoIn.nextInt();
    switch(s){
        case 1:
    System.out.println("Digite un número : ");
    objeto1.a=objetoIn.nextInt();
    System.out.println("Digite otro número : "); 
    objeto1.b=objetoIn.nextInt();
            objeto1.suma();
    System.out.println("La suma es: " + objeto1.c);
            break;
        case 2:
    System.out.println("Digite un número : ");
    objeto1.a=objetoIn.nextInt();
    System.out.println("Digite otro número : "); 
    objeto1.b=objetoIn.nextInt();
            objeto1.resta();
    System.out.println("El resultado de la resta es: " + objeto1.c);
            break;
        case 3:
    System.out.println("Digite un número : ");
    objeto1.a=objetoIn.nextInt();
    System.out.println("Digite otro número : "); 
    objeto1.b=objetoIn.nextInt();  
    System.out.println("El resultado de la multiplicación es: " + objeto1.multiplicacion(objeto1.a,objeto1.b));
            break;
            case 4:
    System.out.println("Digite un número : ");
    objeto1.a=objetoIn.nextInt();
    System.out.println("Digite otro número : "); 
    objeto1.b=objetoIn.nextInt();
    System.out.println("El resultado de la Division es: " + objeto1.division(objeto1.a,objeto1.b));
            break;
            case 5:
    System.out.println("Digite un número : ");
    objeto1.a=objetoIn.nextInt();
    System.out.println("El resultado del Seno es: " + objeto1.seno(objeto1.a));
            break;
            case 6:
    System.out.println("Digite un número : ");
    objeto1.a=objetoIn.nextInt();
    System.out.println("El resultado del Coseno es: " + objeto1.cos(objeto1.a));
   
            break;
            case 7:
    System.out.println("Digite un número : ");
    objeto1.a=objetoIn.nextInt();
    System.out.println("El resultado de la Tangente es: " + objeto1.tan(objeto1.a));
            break;
            case 8:
    System.out.println("Digite un número : ");
    objeto1.radicando=objetoIn.nextInt();
    System.out.println("Digite otro número : "); 
    objeto1.indice=objetoIn.nextInt(); 
    objeto1.raiz();
    System.out.println("El resultado De La Raiz Enesima Es : " + objeto1.resultado);
            break;
            case 9:
    System.out.println("Digite La Base  : ");
    objeto1.a=objetoIn.nextInt();
    System.out.println("Digite El Exponente : "); 
    objeto1.b=objetoIn.nextInt();  
    System.out.println("El resultado De La Potencia Enesima es : " + objeto1.pon(objeto1.a,objeto1.b));
            break;
            case 10:
    System.out.println("Digite un número : ");
    objeto1.a=objetoIn.nextInt();
    objeto1.iva();
    System.out.println("El IVA de $" + objeto1.a + " Es De : $"+ objeto1.c);
            break;
        default:
    System.out.println("ERROR NO ESTA ESA OPCION");
            break;
    }
} 
}
