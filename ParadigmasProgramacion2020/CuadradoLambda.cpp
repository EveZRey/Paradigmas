#include<iostream>

int main() {
    auto cuadrado = [](int x) -> int {
        return x * x;
    };

    std :: cout << "Cuadrado de 5, es: " << cuadrado(5) << std :: endl;

    return 0;
}
