using System;
class Factura{
 
    public string numPiezas;
    public string descripcion;
    public int cantidad;
    public double precio;
    
    public Factura(){
        numPiezas = "";
        descripcion = "";
        cantidad = 0;
        precio = 0.0;
    }
    
    public double obtenerMontoFactura(){
        return cantidad * precio;
    }
}

class FacturaTest{
    static void Main(string[] args){
        Factura ferre = new Factura();
        
        Console.WriteLine("Numero de piezas: ");
        ferre.numPiezas = Console.ReadLine();
        
        Console.WriteLine("Descripcion: ");
        ferre.descripcion = Console.ReadLine();
        
        Console.WriteLine("Cantidad: ");
        ferre.cantidad = Convert.ToInt32(Console.ReadLine());
        
        Console.WriteLine("Precio: ");
        ferre.precio = Convert.ToDouble(Console.ReadLine());
        
        
        if (ferre.cantidad < 0) ferre.cantidad = 0;
        if (ferre.precio < 0.0) ferre.precio = 0.0;
        
        Console.WriteLine("\nFactura: " + ferre.obtenerMontoFactura());
    }
}