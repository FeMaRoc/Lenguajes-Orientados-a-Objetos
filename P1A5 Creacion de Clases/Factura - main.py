class Factura:
    def __init__(self):
        self.numPieza = ""
        self.descripcion = ""
        self.cantidad = 0
        self.precio = 0.0
        
    def obtenerMontoFactura(self):
        return self.cantidad*self.precio

#FacturaTest
ferre = Factura()

ferre.numPieza = input("Ingresa el numero de piezas: ")
ferre.descripcion = input("Descripcion: ")
ferre.cantidad = int(input("Cantidad: "))
ferre.precio = float(input("Precio: "))

ferre.cantidad = 0 if ferre.cantidad<0 else ferre.cantidad
ferre.precio = 0.0 if ferre.precio<0 else ferre.precio

print("\nFactura: ", ferre.obtenerMontoFactura())