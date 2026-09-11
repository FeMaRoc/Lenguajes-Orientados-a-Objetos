from Pizzeria import PedidoPizza

objeto1 = PedidoPizza()

objeto1.tamanio = "Grande"
objeto1.descripcion = "Masa tradicional"
objeto1.noIngredientes = 2

objeto1.generarResumenPedido()

objeto2 = PedidoPizza("Chica", 0, "Vegana")
objeto2.generarResumenPedido()