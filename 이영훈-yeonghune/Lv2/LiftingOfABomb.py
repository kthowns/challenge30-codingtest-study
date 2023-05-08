'''
폭탄 해제
의사코드
1. 코드와 색상 초를 입력받는다.
2. Bomb 클래스를 생성하면서 인자로 위 세개를 넘긴다.
3. 객체의 속성들에 인자들을 할당한다.
4. 객체의 속성들을 출력한다.
'''
class Bomb:
    code = ''
    color = ''
    second = ''

    def __init__(self,code, color, second):
        self.code = code
        self.color = color
        self.second = second
        self.PRINT()
    
    #출력부
    def PRINT(self):
        print("code : "+self.code)
        print("color : "+self.color)
        print("second : "+self.second)


code, color, second = input().split()

Bomb(code, color, second)
