#include <iostream>

int main() {
    int n;
    std::cin >> n;

    for(int i = 0; i<n; i++){
        for(int j=(n*i)+1; j<=(n*i)+n; j++){
            if(i%2==0)
                std::cout << j;
            else
                std::cout << ((n*i)+n)-(j-(n*i))+1;

            if(j%n==0) std::cout << std::endl;
            else std::cout << ' ';
        }
    }

    return 0;
}
