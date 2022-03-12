import java.util.*;

public class Punto {
    //Atributos
    private int x;
    private int y;
    private int a;
    private int b;
    double operacion;

    //Constructor
    public Punto(int a, int b, int x, int y){
        this.a = a;
        this.b = b;
        this.x = x;
        this.y = y;
        System.out.println("Los datos ingresados son los siguientes");
        System.out.println("------------------------------------------------");
        System.out.println("Punto 1: " + a + ", " +b);
        System.out.println("Punto 2: " + x + ", " +y);
        System.out.println("\nLa distancia entre el punto 1 y el punto 2 es:");
        operacion = Math.sqrt(Math.pow((a-b),2)+ Math.pow ((x-y),2));
        System.out.println("..... = " + operacion);
    }

    //Metodos
    public void setX (int x){
        this.x = x;
    }
    public int getX (){
        return x;
    }
    public void setY (int y){
        this.y = y;
    }
    public int getY (){
        return y;
    }
    public void setA (int a){
        this.a = a;
    }
    public int getA (){
        return a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getB(){
        return b;
    }
    public void mostrar (){
        System.out.println("Los datos ingresados son los siguientes");
        System.out.println("------------------------------------------------");
        System.out.println("Punto 1: " + a + ", " +b);
        System.out.println("Punto 2: " + x + ", " +y);
        System.out.println("\nLa distancia entre el punto 1 y el punto 2 es:");
        operacion = Math.sqrt((a-b)^2+(x-y)^2);
        System.out.println("..... = " + operacion);
    }
    public static void main(String[] args) {
        String nombre;
        int a;
        int b;
        int x;
        int y;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Programa para deducir distancia entre dos puntos");
        System.out.println("------------------------------------------------------");
        System.out.println("\nIngrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Hola " + nombre + " a continuacion se le solicitaran los puntos que desea calcular.");
        System.out.println("Del punto 1");
        System.out.print("Ingrese el punto A: ");
        a = sc.nextInt();
        System.out.print("\nIngrese el punto B: ");
        b = sc.nextInt();
        System.out.println("\nDel punto 2");
        System.out.print("Ingrese el punto X: ");
        x = sc.nextInt();
        System.out.print("Ingrese el punto Y: ");
        y = sc.nextInt();
        Punto com = new Punto (a,b,x,y);
    }
}