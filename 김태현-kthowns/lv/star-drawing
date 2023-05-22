#include <iostream>

int main() {
    // 여기에 코드를 작성해주세요.
    int n;
    std::cin >> n;

    n = 2*n-1;

    for(int i=1; i<=n; i=i+2){
        for(int j=0; j<(n-i)/2; j++) std::cout << ' ';
        for(int j=0; j<i; j++) std::cout << '*';
        std::cout << std::endl;
    }

    for(int i=n-2; i>0; i=i-2){
        for(int j=0; j<(n-i)/2; j++) std::cout << ' ';
        for(int j=0; j<i; j++) std::cout << '*';
        std::cout << std::endl;
    }

    return 0;

}
/*
n = 4

3 1 (n-i)/2 i
2 3
1 5
0 7
   *
  ***
 *****
*******
 *****
  ***
   *
*/
