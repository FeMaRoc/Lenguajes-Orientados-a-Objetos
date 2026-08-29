#include <iostream>
using namespace std;

class Factura{
public:
    string numPiezas;
    string descripcion;
    int cantidad;
    double precio;
    
    Factura(){
        numPiezas = "";
        descripcion = "";
        cantidad = 0;
        precio = 0.0;
    }
    
    double obtenerMontoFactura(){
        return cantidad*precio;
    }
    
};


int main(){
    Factura ferre;
    cout << "Numero de piezas: "; cin >> ferre.numPiezas;
    cout << "Descripcion: "; cin >> ferre.descripcion;
    cout << "Cantidad: "; cin >> ferre.cantidad;
    cout << "Precio: "; cin >> ferre.precio;
    
    if (ferre.cantidad < 0) ferre.cantidad = 0;
    if (ferre.precio < 0 ) ferre.precio = 0.0;
    
    cout << "Factura: " << ferre.obtenerMontoFactura();
    
    return 0;
}