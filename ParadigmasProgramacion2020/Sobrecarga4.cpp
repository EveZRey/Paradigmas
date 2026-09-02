#include <iostream>

using namespace std;

unsigned char mifunc(unsigned char ch);
char mifunc(char ch);

int main() {
    cout << mifunc('c'); 
    cout << mifunc(88) << " "; 

    return 0;
}

unsigned char mifunc(unsigned char ch) {
    return ch - 1;
}

char mifunc(char ch) {
    return ch + 1;
}
