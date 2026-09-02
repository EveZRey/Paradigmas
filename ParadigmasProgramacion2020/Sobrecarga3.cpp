#include <iostream>

using namespace std;

float mifunc(float i);
double mifunc(double i);

int main() {
    cout << mifunc(10.1) << " ";
    cout << mifunc(20);
    
    return 0;
}

float mifunc(float i) {
    return i;
}

double mifunc(double i) {
    return -i;
}
