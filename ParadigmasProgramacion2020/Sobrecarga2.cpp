#include <iostream>

using namespace std;

int valAbs(int i);
double valAbs(double d);
long valAbs(long l);

int main() {
    cout << valAbs(-10) << "\n";
    cout << valAbs(-11.0) << "\n";
    cout << valAbs(-9L) << "\n";

    return 0;
}

int valAbs(int i) {
    cout << "valAbs() usa enteros: ";
    if(i < 0) return -i;
    else return i;
}

double valAbs(double d) {
    cout << "valAbs() usa double: ";
    if(d < 0.0) return -d;
    else return d;
}

long valAbs(long l) {
    cout << "valAbs() usa long: ";
    if(l < 0) return -l;
    else return l;
}
