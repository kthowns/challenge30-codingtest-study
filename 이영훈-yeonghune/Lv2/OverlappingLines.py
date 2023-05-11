'''
전부 겹치는 선분
의사코드
1. n번 x1과 x2를 리스트(이중 리스트)에 입력한다.
2. x1과 x2의 최소와 최댓값(1, 101)을 for문을 돌려서 이중 리스트에서 추출한 x1와 x2들
즉, 모든 선분의 (x1:x2)에 속하는지 판단한다.
3. 속하면 Yes, 속하지 않으면 No를 출력한다.
'''
def operating(lst):

    for check in range(1,101):
        flag = True
        for x1, x2 in lst:
            if not x1 <= check <= x2:
                flag =False
                break
        
        if flag == True:
            print('Yes')
            return

    print('No')

n = int(input())
lst = []

for i in range(n):
    x1, x2 = map(int,input().split())
    lst.append([x1, x2])

operating(lst)