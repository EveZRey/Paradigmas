#include <iostream>

using namespace std;

voidimprimiLinea(char c = '*', int longitud = 45);

int main() {
    imprimirLinea();
    imprimirLinea('=');
    imprimirLinea('+');
    imprimirLinea('-');
    
    return 0;
}

void imprimirLinea(char c, int long) {
    for(int i = 1; i <= longitud; i++)
        cout << c ;
    cout << "\n";

}
