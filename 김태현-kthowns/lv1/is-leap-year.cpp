#include <iostream>

int main() {
    int y;

    std::cin >> y;

    if(y%4 == 0){
        if(y%100 == 0){
            if(y%400 == 0) std::cout << "true";
            else std::cout << "false";
        }else std::cout << "true";
    }else{
        std::cout << "false";
    }

    return 0;
}
