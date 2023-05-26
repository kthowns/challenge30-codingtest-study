'''
의사코드

1. 클래스 선언
    1.init
    2. 출력하는 함수
2. 문자열로 입력값 받아 객체생성 및 초기화
3. 출력

'''
class Bomb:
    def __init__(self, code, color, second):
        self.code = code
        self.color = color
        self.second = second

    def printBomb(self):
        print("code : "+self.code)
        print("color : "+self.color)
        print("second : "+self.second)
        
#입력부
a, b, c = input().split()
#연산부
firstInput = Bomb(a, b, c)
#출력부
firstInput.printBomb()
