class Fecha:
    def __init__(self):
        self.unMes = 0
        self.unDia = 0
        self.unAnio = 0
        
    def mostrarFecha(self):
        return f"{self.unMes}/{self.unDia}/{self.unAnio}"

  
fechaActual = Fecha()

print("Ingrese los siguientes valores en numeros")
fechaActual.unDia = int(input("Que dia es hoy: "))
fechaActual.unMes = int(input("En que mes estamos: "))
fechaActual.unAnio = int(input("En que anio estamos: "))

print("\n--- FECHA ACTUAL ---")
fechaActual.mostrarFecha()