package guia1.Calculadora;
public class Calculadora {
    public int a,b,c;
    public double indice, radicando;
    public float resultado;
    public void suma(){
        c=a+b;
    }
    public void resta(){
        c=a-b;
    }
    public double multiplicacion(int a, int b){
        return a*b;
    }
    public double division(double a, double b){
        return a/b;
    }
    public double seno(double a){
        return Math.sin(a);
    }
    public double cos(double a){
        return Math.cos(a);
    }
    public double tan(double a){
        return Math.tan(a);
    }
    public void iva(){
        c= a*19/100;
    }
    public void raiz(){
        resultado = (float) Math.pow(radicando, 1 / indice);
    }
    public double pon(int a, int b){
        return Math.pow(a, b);
    }
}
