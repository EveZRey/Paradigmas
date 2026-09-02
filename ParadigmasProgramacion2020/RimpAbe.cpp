#include <iostream>

using namespace std;

void impAbe(char consonante) {
    if(consonante <= 'a') {
        impAbe(consonante + 1);
        cout << consonante << endl;
    }
    return;
}

int main() {
    char comienzo = 'z';

    impAbe(comienzo);
    
    return 0;
}
