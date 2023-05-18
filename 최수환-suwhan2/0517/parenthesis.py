'''
의사코드
1. 문자열 받기
2. 카운드 초기화
3. 이중 for문으로 괄호가 만족하는 경우 count++
4. 프린트
'''


parenthesis = input()
count = 0

for i in range(len(parenthesis) - 1):
    for j in range(i + 1, len(parenthesis) - 1):
        if parenthesis[i] == '(' and parenthesis[i + 1] == '(' and parenthesis[j] == ')' and parenthesis[j + 1] == ')':
            count += 1
            
print(count)
