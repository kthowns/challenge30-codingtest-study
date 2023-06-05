#include <iostream>

int csgbs(int n, int m){
    int result = n*m;
    int arr_n[100];
    int arr_m[100];

    for(int i=1; i<100; i++){
        arr_n[i] = i*n;
        arr_m[i] = i*m;
    }

    for(int i=1; i<100; i++){
        for(int j=0; j<100; j++){
            if(arr_n[i] == arr_m[j]){
                if(result > arr_n[i])
                    result = arr_n[i];
            }
        }
    }

    return result;
}

int main() {
    int n, m;
    std::cin >> n >> m;

    std::cout << csgbs(n, m);
}


// 최소공배수 : 두 수의 공배수 중 가장 작은 것
// 30, 20 = 60
