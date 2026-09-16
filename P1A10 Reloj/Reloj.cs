using System;

public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;
    
    public Reloj(){
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    
    public Reloj(int h, int m, int s){
        this.Horas = h;
        this.Minutos = m;
        this.Segundos = s;
    }
    
    public int Horas{
        get { return this.horas; }
        set { 
            if (value >= 0 && value < 24){
                this.horas = value; 
            }
            else {
                Console.WriteLine("La hora ingresada no es valida, por favor ingrese un valor valido.");
                horas = 0;
            }
        }    
    }
    
    public int Minutos {
        get { return this.minutos; }
        set { 
            if (value >= 0 && value < 60) {
                this.minutos = value; 
            }
            else {
                Console.WriteLine("Los minutos ingresados no son validos, por favor ingrese un valor valido.");
                minutos = 0;
            }
        }
    }
    
    public int Segundos {
        get { return this.segundos; }
        set { 
            if (value >= 0 && value < 60) {
                this.segundos = value; 
            }
            else {
                Console.WriteLine("Los segundos ingresados no son validos, por favor ingrese un valor valido.");
                segundos = 0;
            }
        }
    }
    
    public string DarLaHora(){
        return $"{Horas:D2}:{Minutos:D2}:{Segundos:D2}";
    }
    
    public string AMoPM(){
        string AoP = "";
        int h12 = Horas;
        
        if (Horas >= 12){
            AoP = "PM";
            
            if (Horas > 12){
                h12 = Horas - 12;
            }
        }
        else {
            AoP = "AM";
            if (Horas == 0){
                h12 = 12;
            }
        }
        
        return $"{h12:D2}:{Minutos:D2}:{Segundos:D2} {AoP}";
    }
    
    public override string ToString(){
        return "\nHora: " + this.horas + "\nMinutos: " + this.minutos + "\nSegundos: " + this.segundos;
    }
    
}