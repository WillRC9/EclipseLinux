package variable;
import java.util.*;
public class variable {
    private String Nombre="William";
    private String Apellidos="Aguado Carrillo";
    private int Edad="21";
    public static void main(String [] args){
        int l,m,c;
        float a,b,d;
        variable myObj = new variable();
        System.out.println("Nombre: "+myObj.Nombre);
        System.out.println("Apellidos: "+myObj.Apellidos);
        System.out.println("Edad: "+myObj.Edad);

        Scanner teclado=new Scanner(System.in);
        System.out.print("Ingrese un Número: ");
        l=teclado.nextInt();
        System.out.print("Ingrese un Número: ");
        m=teclado.nextInt();
        System.out.print("Ingrese un Número: ");
        l=teclado.nextInt();
        System.out.print("Ingrese un Número: ");
        a=teclado.nextFloat();
        System.out.print("Ingrese un Número: ");
        b=teclado.nextFloat();
        c=l+m;
        d=a*b;
        System.out.print("El resultado de la suma es: "+c);
        System.out.print("El resultado de la multiplicacion es: "+d);


    }
}