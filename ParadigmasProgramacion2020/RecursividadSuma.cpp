#include <iostream>

using namespace std;

int suma(int inicio, int fin) {
    int siguiente = inicio + 1;
    
    if(actual != fin) {
        return inicio + suma(siguiente, fin);
    }
    else {
        return fin;
    }
}

int main(){
    int n;
    cin >> n;
    
    int resultado = suma(1, n);
    
    cout << resultado << endl;
    
    return 0;
}
