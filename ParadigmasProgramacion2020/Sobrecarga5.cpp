#include <iostream>

using namespace std;

double mifunc(double i);
int mifunc(int i, int j = 1);

int main() {
    cout << mifunc(4.1) << " ";
    cout << mifunc(10); 
    
    return 0;
}

double mifunc(double i) {
    return i;
}

int mifunc(int i, int j) {
    return i * j;
}
