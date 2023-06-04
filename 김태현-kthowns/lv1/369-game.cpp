#include <iostream>

int main() {
    int n;
    std::cin >> n;

    for(int i=1; i<=n; i++){
		if(i % 3 == 0)
			std::cout << "0 ";
		else if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
			std::cout << "0 ";
		else if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
			std::cout << "0 ";
		else
			std::cout << i << " ";
    }
    return 0;
}
