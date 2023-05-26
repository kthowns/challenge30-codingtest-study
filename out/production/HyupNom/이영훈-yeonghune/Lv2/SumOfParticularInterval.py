'''
특정 구간의 합
의사코드

1. n과 m을 입력받는다.
2. 수열을 seq 리스트에 저장한다.
3. m번동안 합을 진행할 시작 인덱스와 종료 인덱스를 받는다.
    3.1 firstnum과 lastnum 까지를 seq 리스트에서 슬라이싱하여 모두 더해준다.
    3.2 m번동안의 합들을 결과 출력할때 사용되는 output 리스트에 입력한다.
4. output 리스트를 출력한다.
'''

n, m = map(int,input().split())

seq = list(map(int,input().split()))
output =[]

for i in range(m):
    firstnum, lastnum = map(int,input().split())
    sum = 0
    for j in range(firstnum-1, lastnum):
        sum += seq[j]
    output.append(sum)

for i in output:
    print(i)

