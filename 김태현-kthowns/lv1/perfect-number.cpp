#include <iostream>

int cpltNum(int num){ //완전수 구하는 함수
    int sum = 0;
    for(int i=1; i<num; i++)
        if(num%i==0)
            sum = sum + i;

    if(sum == num) return 1;
    else return 0;
}

int main() {
    int s, e;
    std::cin >> s >> e;
    int cnt=0;

    for(int i=s; i<e+1; i++)
        if(cpltNum(i)) 
            cnt = cnt+1;
    
    std::cout << cnt;
    return 0;
}
