#include <iostream>
#include <string>

int tsn(int a, int b){
    int sum = 0;
    for(int i=a; i<=b; i++){
        std::string strTmp = std::to_string(i);
        if(i%3 == 0){
            sum++;
        }else{
            for(int j=0; j<strTmp.length(); j++){
                if(strTmp.at(j) == '3' || strTmp.at(j) == '6' || strTmp.at(j) == '9'){
                    sum++;
                    break;
                }
            }
        }
    }
    return sum;
}

int main() {
    int a, b;

    std::cin >> a >> b;

    std::cout << tsn(a, b);
}
