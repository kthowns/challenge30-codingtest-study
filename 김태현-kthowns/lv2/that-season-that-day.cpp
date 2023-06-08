#include <iostream>
#include <string>
#include <vector>

int isLeapYear(int y){
    if(y%4 == 0){
        if(y%100 == 0){
            if(y%400 == 0) return 1;
            else return 0;
        }else return 1;
    }else{
        return 0;
    }
}

int season(int y, int m, int d){
    int arr_m[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if(isLeapYear(y) == 1) arr_m[1] = 29;
    if(0<d && d<=arr_m[m-1]){
        if(3<=m && m<=5)
            return 1;
        else if(6<=m && m<=8)
            return 2;
        else if(9<=m && m<=11)
            return 3;
        else
            return 4;
    }else return 0;
}

int main() {
    int y, m, d;
    std::cin >> y >> m >> d;
    std::vector<std::string> results = { "-1", "Spring", "Summer", "Fall", "Winter"};

    std::cout << results.at(season(y, m, d));
    return 0;
}
