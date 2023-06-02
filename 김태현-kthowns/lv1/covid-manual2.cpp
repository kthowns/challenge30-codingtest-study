#include <iostream>

int main() {
    //감기증상 Y, N
    //증상 Y, 37C 이상 == A
    //증상 N, 37C 이상 == B
    //증상 Y, 37C 이하 == C
    //증상 N 37C 이하 == D
    int clinic[4] = {0,};
    int temp;
    char symp;

    for(int i=0; i<3; i++){
        std::cin >> symp >> temp;
        if(symp == 'Y'){
            if(temp >= 37) clinic[0]++;
            else clinic[2]++;
        }else{
            if(temp >= 37) clinic[1]++;
            else clinic[3]++;
        }
    }

    for(int i=0; i<4; i++)
        std::cout << clinic[i] << ' ';

    if(clinic[0] >= 2)
        std::cout << 'E';
    return 0;
}
