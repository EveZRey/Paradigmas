#include<iostream>
#include<cstdlib>

using namespace std;

void invertir(int num) {
    cout << num % 10;
    if(num > 10)
        invertir(num/10);
}

int main() {

}
