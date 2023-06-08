/*
dateInspect(m, d){
    arr_m[] <- 2021년의 각 월의 마지막날
    result <- 기본값을 0으로 함

    if(0<m<13){
        if(0<d<=해당 달의 마지막날)
            result = 1
    }
    return result
}
*/

#include <iostream>

int dateInspect(int m, int d){
    int arr_m[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int result = 0;

    if(0<m && m<13)
        if(0<d && d<=arr_m[m-1])
            result = 1;

    return result;
}

int main() {
    int m, d;
    std::cin >> m >> d;

    if(dateInspect(m,d) == 1)
        std::cout << "Yes";
    else
        std::cout << "No";

    return 0;
}
