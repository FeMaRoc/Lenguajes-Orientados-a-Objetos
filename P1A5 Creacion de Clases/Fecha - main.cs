using System;
class Fecha{
    public int unMes;
    public int unDia;
    public int unAnio;
    
    public Fecha(){
        unMes = 0;
        unDia = 0;
        unAnio = 0;
    }
    
    public string mostrarFecha(){
        return $"{unMes}/{unDia}/{unAnio}";
    }
}

class FechaTest{
    static void Main (String[] args){
        Fecha fechaActual = new Fecha();
        
        Console.WriteLine("Ingrese los siguientes valores en numeros");
        
        Console.WriteLine("Que dia es hoy: ");
        fechaActual.unDia = Convert.ToInt32(Console.ReadLine());
        
        Console.WriteLine("En que mes estamos: ");
        fechaActual.unMes = Convert.ToInt32(Console.ReadLine());
        
        Console.WriteLine("En que anio estamos: ");
        fechaActual.unAnio = Convert.ToInt32(Console.ReadLine());
        
        Console.WriteLine("\n--- FECHA ACTUAL ---");
        Console.WriteLine(fechaActual.mostrarFecha());
    }
}