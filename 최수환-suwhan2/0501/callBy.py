'''
1. 정수 연산하기
    1. 인자 두 정수를 비교해 큰값에 *2
    2. 작은값에 +10
    3. 계산결과 반환
2. 정수 두개 입력받기
3. 받은 정수 연산하기
4. 출력
'''

def calculate(a,b) :
    if a>b :
        a*=2
        b+=10
    else:
        a+=10
        b*=2
    return a,b
a ,b= input().split(' ')
a,b = calculate(int(a),int(b))

print(a,b)
