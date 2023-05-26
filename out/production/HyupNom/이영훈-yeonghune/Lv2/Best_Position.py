'''
최고의 13위치 2
의사코드
for문이 많아서 의사코드는 생략하겠습니다 죄송합니다

풀이법
하나의 고정된 격자 A를 지정하고 겹치지 않는 모든 원소들을 비교한다.
'''

n = int(input())

lst = []
Result =[]

for i in range(n):
    lst.append(list(map(int,input().split())))

for i in range(n): #세로라인
    for j in range(n-2):#가로라인
        fixed_first = lst[i][j] + lst[i][j+1] + lst[i][j+2]

        l = j
        while n - (l+3) >= 3:
            variable_second = lst[i][l+3] + lst[i][l+4] + lst[i][l+5]
            sum = fixed_first + variable_second
            Result.append(sum)
            l += 3

        for k in range(i+ 1 , n):
            for l in range(n-2):
                variable_second = lst[k][l] + lst[k][l+1] + lst[k][l+2]
                sum = fixed_first + variable_second
                Result.append(sum)

print(max(Result))