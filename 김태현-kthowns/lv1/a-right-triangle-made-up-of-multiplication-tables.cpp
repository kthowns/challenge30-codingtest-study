#include <iostream>

int main() {
    int n;
    std::cin >> n;
    int cnt = n;

    for(int i=1; i<n+1; i++){
        for(int j=1; j<cnt+1; j++){
            std::cout << i << " * " << j << " = " << i*j;
            if(j<cnt) std::cout << " / ";
        }
        std::cout << std::endl;
        cnt = cnt-1;
    }

    return 0;
}
