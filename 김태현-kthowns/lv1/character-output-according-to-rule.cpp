#include <iostream>

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    std::cin >> n;

    for(int i=1; i<=n; i++){
        for(int j=n-i; j>0; j--){
            std::cout << ' ' << ' ';
        }
        for(int j=1; j<=i; j++){
            std::cout << '@' << ' ';
        }
        std::cout << std::endl;
    }
    for(int i=n-1; i>0; i--){
        for(int j=0; j<i; j++){
            std::cout << '@' << ' ';
        }
        std::cout << std::endl;
    }
    return 0;
}

/*
n=2
1 1
0 2
0 1

n=3

2 1 (n-1~0) (1~n)
1 2
0 3
0 2
0 1
*/
