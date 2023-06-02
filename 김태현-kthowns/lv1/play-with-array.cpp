#include <iostream>

int main() {
    int n, qType, q;
    int a, b;

    std::cin >> n >> q;

    int el[n] = {0,};

    for(int i=0; i<n; i++){
        int tmp;
        std::cin >> tmp;
        el[i] = tmp;
    }
    
    for(int i=0; i<q; i++){
        std::cin >> qType;
        if(qType == 1){
            std::cin >> a;
            std::cout << el[a-1];
        }else if(qType == 2){
            int it = 0;
            std::cin >> a;
            for(int j=0; j<n; j++){
                if(el[j] == a){
                    it = j+1;
                    break;
                }
            }
            std::cout << it;
        }else if(qType == 3){
            std::cin >> a >> b;
            for(int i=a-1; i<=b-1; i++)
                std::cout << el[i] << ' ';
        }
        std::cout << std::endl;
    }
    return 0;
}
