using System;
class Empleado{
    
    public string primerNombre;
    public string apellidoPaterno;
    public double salarioMensual;
    
    public Empleado(){
        primerNombre = "";
        apellidoPaterno = "";
        salarioMensual = 0.0;
    }
    
    public double obtenerSalarioAnual(){
        return salarioMensual * 12;
    }
}

class EmpleadoTest{
    static void Main(String[] args){
        Empleado emp1 = new Empleado();
        Console.WriteLine("Primer nombre del empleado 1: ");
        emp1.primerNombre = Console.ReadLine();
        
        Console.WriteLine("Apellido paterno del empleado 1: ");
        emp1.apellidoPaterno = Console.ReadLine();
        
        Console.WriteLine("Salario mensual del empleado 1: ");
        emp1.salarioMensual = Convert.ToDouble(Console.ReadLine());
        
        if (emp1.salarioMensual < 0.0) emp1.salarioMensual = 0.0;
        
        Empleado emp2 = new Empleado();
        Console.WriteLine("Primer nombre del empleado 2: ");
        emp2.primerNombre = Console.ReadLine();
        
        Console.WriteLine("Apellido paterno del empleado 2: ");
        emp2.apellidoPaterno = Console.ReadLine();
        
        Console.WriteLine("Salario mensual del empleado 2: ");
        emp2.salarioMensual = Convert.ToDouble(Console.ReadLine());
        
        if (emp2.salarioMensual < 0.0) emp2.salarioMensual = 0.0;
        
        Console.WriteLine("\n--- SALARIOS ANUALES INICIALES ---");
        Console.WriteLine(emp1.primerNombre + " " + emp1.apellidoPaterno + ": $" + emp1.obtenerSalarioAnual());
        Console.WriteLine(emp2.primerNombre + " " + emp2.apellidoPaterno + ": $" + emp2.obtenerSalarioAnual());
        
        emp1.salarioMensual = emp1.salarioMensual * 1.10;
        emp2.salarioMensual = emp2.salarioMensual * 1.10;
        
        Console.WriteLine("\n--- SALARIOS ANUALES FINALES ---");
        Console.WriteLine(emp1.primerNombre + " " + emp1.apellidoPaterno + ": $" + emp1.obtenerSalarioAnual());
        Console.WriteLine(emp2.primerNombre + " " + emp2.apellidoPaterno + ": $" + emp2.obtenerSalarioAnual());
    
        
    }
}