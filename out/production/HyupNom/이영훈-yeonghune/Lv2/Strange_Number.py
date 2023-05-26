'''
이상한 진수
의사코드
1. 2진수를 정수형 리스트에다가 입력한다.
2. 리스트에서 가장작은 인덱스에 있는 0을 1로 교체한다.
3. 리스트를 이진수 계산법에 맞게 뒤집는다.
4. 리스트를 이진수 계산법으로 계산한다. 예시( 0번 인덱스 * 2의 0승)
'''

Input = list(map(int,input()))

for i in range(0,len(Input)):
    if Input[i] == 0:
        Input[i] = 1
        break
    
    if i == len(Input)-1:
        Input[i] = 0

Input= Input[::-1]

for i in range(0,len(Input)):
    if Input[i] == 1:
        Input[i] = 2**i

print(sum(Input))
