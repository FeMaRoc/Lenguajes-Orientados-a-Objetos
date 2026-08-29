import java.util.Scanner;
public class FechaTest{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        Fecha fechaActual = new Fecha();
        
        System.out.println("Ingrese los siguientes valores en numeros");
        
        System.out.println("Que dia es hoy: ");
        fechaActual.unDia = input.nextInt();
        
        System.out.println("En que mes estamos: ");
        fechaActual.unMes = input.nextInt();
        
        System.out.println("En que anio estamos: ");
        fechaActual.unAnio = input.nextInt();
        
        System.out.println("\n--- FECHA ACTUAL ---");
        System.out.println(fechaActual.mostrarFecha());
    }
}