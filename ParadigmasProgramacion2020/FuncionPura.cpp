#include<iostream>

//int sumYimp(int a, int b) {
//    int resultado = a + b;
//    cout << "El resultado, es: " << resultado << endl;
//    return resultado;
//}

int sumFunPura(int a, int b) {
    return a + b;
}

void resultadoLog(int resultado) {
    cout << resultado << endl;
}

int main() {
    int a = 5, b = 7;
    int resultado = sumFunPura(a,b);
    resultadoLog(resultado);
}
