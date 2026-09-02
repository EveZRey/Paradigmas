#include <iostream>

using namespace std;

void impNum(int num) {
    if(num < 100) {
        impNum(num + 1);
        cout << num << endl;
    }
    return;
}

int main() {
    int comienzo = 0;
    
    impNum(comienzo);
    
    return 0;
}
