#include <iostream>

using namespace std;

void funcion(int i);
void funcion(int i, int j); 
void funcion(double k);

int main() {
    funcion(10);
    funcion(10, 20); 
    funcion(12.23);

    return 0;
}

void funcion(int i) {
    cout << "En funcion(int), i es " << i << '\n';
}

void funcion(int i, int j) {
    cout << "En funcion(int, int), i es " << i;
    cout << ", j es " << j << '\n';
}

void funcion(double k) {
    cout << "En funcion(double), k es " << k << '\n';
}
