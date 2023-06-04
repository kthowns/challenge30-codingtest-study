'''
괄호쌍 만들기
의사코드
1. 괄호를 입력받아 리스트에 넣는다.
2. 외부 for문은 '((' 을 잡는 역할을 하고 내부 for문은 '))'을 잡는 역할을 한다.
3. 한번에 움직이는 window size를 2로 두고 진행하여 외부 for문에서 반복 횟수가 -1이 되고,
내부 for문에서도 시작 수를 +1 하고 끝 수를 -1한다.
'''
n = list(input())
cnt = 0

for i in range(len(n) -1 ):
    for j in range(i + 1,len(n) - 1):
        if n[i] == n[i+1] == '(' and n[j] == n[j+1] == ')':
            cnt +=1
            
print(cnt)
