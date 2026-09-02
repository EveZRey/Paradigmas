#include<iostream>
#include<cstdlib>

using namespace std;

long int potencia(int base, int exponente) {
    if(exponente == 0)
        return 1;
    if(exponente == 1)
        return base;
    else
        return base * potencia(base, exponente - 1);
}

int main() {

]
