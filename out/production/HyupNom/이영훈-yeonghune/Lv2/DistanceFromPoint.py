'''
원점으로부터의 거리
의사코드
1. x좌표와 y좌표를 입력받고 Manhanttan 함수를 통해 거리를 계산한다.
2. 번호와 거리를 lst에 입력한다. (이중리스트를 이용한다.)
3. 리스트를 거리를 기준으로 오름차순 정렬한다.
4. 리스트에서 번호들만 순서대로 출력한다.

자기리뷰
방금 문제들까지 다 클래스로 풀어서 이번에는 이중 리스트로 풀어보았습니다.
개인적으로 클래스보다는 작성하기 어렵지 않았지만, 제3자가 볼때 가독성이 떨어져 보이네요.
'''

def Manhanttan(x , y)->int:
    return abs(x - 0) + abs(y - 0)

n = int(input())
lst = []

#입력부
for idx in range(n):
    x, y = map(int,input().split())
    distance = Manhanttan(x, y)
    lst.append([idx+1, distance])

#연산부
lst = sorted(lst, key = lambda x : x[1])

#출력부
for idx in range(len(lst)):
    print(lst[idx][0])