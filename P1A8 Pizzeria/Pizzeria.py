class PedidoPizza:
    def __init__(self, t = "", nI = 0, d = ""):
        self.__tamanio = t
        self.__noIngredientes = nI
        self.__descripcion = d
        
        if t == "Chica":
            self.precioBase = 80.0
        elif t == "Mediana":
            self.precioBase = 100.0
        elif t == "Grande":
            self.precioBase = 120.0
        else:
            self.precioBase = 0.0
    
    @property
    def tamanio(self):
        return self.__tamanio
        
    @tamanio.setter
    def tamanio(self, t):
        self.__tamanio = t
        
        if t == "Chica":
            self.precioBase = 80.0
        elif t == "Mediana":
            self.precioBase = 100.0
        elif t == "Grande":
            self.precioBase = 120.0
    
    @property
    def noIngredientes(self):
        return self.__noIngredientes
    
    @noIngredientes.setter
    def noIngredientes(self, nI):
        self.__noIngredientes = nI
    
    @property
    def descripcion(self):
        return self.__descripcion
    
    @descripcion.setter
    def descripcion(self, d):
        self.__descripcion = d
    
    def calcularTotal(self):
        return self.precioBase + (self.noIngredientes * 15)
    
    def generarResumenPedido(self):
        print("-----TICKET PIZZERIA-----")
        print("Pizza: ", self.tamanio)
        print("Ingredientes extra: ", self.noIngredientes)
        print("Precio pizza: $", self.precioBase)
        print("Total a pagar: $", self.calcularTotal())
        print("-----GRACIAS POR SU COMPRA-----\n")
