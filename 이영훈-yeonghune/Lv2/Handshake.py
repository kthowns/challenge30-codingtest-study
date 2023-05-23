'''
악수와 전염병의 상관 관계
'''

N, K, P, T = map(int,input().split())
#N 개발자들의 수
#K 옮길수 있는 유효 악수
#P 처음 전염병에 걸려있는 개발자의 번호
#T 반복수

Result =[0] * N #결과를 출력하기 위한 리스트
lst =[0] * T 
Result[P-1] = 1 #초기 감염자
Possibility = [0] * N #감염자들의 감염 가능 횟수를 표시하는 리스트
Possibility[P-1] = K #초기 감염자의 감염가능 횟수

# t, x, y를 입력받고 lst에 저장한다.
for i in range(T):
    t, x ,y = map(int, input().split())
    lst[i] = [t, x, y]

#lst를 시간 순서로 정렬한다.
lst = sorted(lst, key= lambda x : (x[0]))




for i in range(T):
    x = lst[i][1] #x번째 악수자
    y = lst[i][2] #y번째 악수자
    
    #감염 가능횟수가 남아있음은 감염되었다고 판단하고 연산한다
    #x번째 악수자의 감염 가능횟수가 남아있고, y번째 악수자의 감염 가능 횟수가 없을때
    if 0 < Possibility[x-1] and 0 == Possibility[y-1]:
        Possibility[x-1] -=1
        if Result[y-1] != 1: #y번째 감염자가 감염된적이 없었을때만 가능성을 k번으로 초기화하기 위함
            Possibility[y-1] = K
        Result[y-1] = 1
        continue
    
    #y번째 악수자의 감염 가능횟수가 남아있고, x번째 악수자의 감염 가능 횟수가 없을때
    if 0 < Possibility[y-1] and 0 == Possibility[x-1]:
        Possibility[y-1] -=1
        if Result[x-1] != 1: #x번째 감염자가 감염된적이 없었을때만 가능성을 k번으로 초기화하기 위함
            Possibility[x-1] = K
        Result[x-1] = 1
        continue
    
    #x,y 번재 악수자의 감염 가능횟수가 남아있을때
    if 0 < Possibility[x-1] and 0 < Possibility[y-1]:
        Possibility[x-1] -=1
        Possibility[y-1] -=1

#출력부
for i in Result:
    print(i,end='')



