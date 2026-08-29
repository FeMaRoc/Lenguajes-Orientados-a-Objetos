import java.util.Scanner;
public class FacturaTest{

    public static void main (String args[]){
        Factura ferre = new Factura();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa el numero de piezas: ");
        ferre.numPiezas = input.nextLine();
        
        System.out.println("Agrega la descripcion: ");
        ferre.descripcion = input.nextLine();
        
        System.out.println("Ingresa la cantidad: ");
        ferre.cantidad = input.nextInt();
        
        System.out.println("Ingresa el precio: ");
        ferre.precio = input.nextDouble();
        
        if (ferre.precio < 0) ferre.precio = 0.0;
        if (ferre.cantidad < 0) ferre.cantidad = 0;
        
        System.out.println("Factura: " + ferre.obtenerMontoFactura());
        
    }
    
}