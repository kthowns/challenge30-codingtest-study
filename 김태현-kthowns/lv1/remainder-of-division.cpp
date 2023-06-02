#include <iostream>

int main() {
    int a, b;
    int digits[10] = {0,};
    int sum = 0;

    std::cin >> a >> b;

    while(a > 1){
        digits[a%b] += 1;
        a = a/b;
    }

    for(int i=0; i<10; i++)
        sum += digits[i] * digits[i];

    std::cout << sum;
    return 0;
}
