'''
G or H 2
이번 코드는 복잡해서 의사코드 없이 주석으로 하게습니다.
'''
#개수
N = int(input())

#위치와 알파벳을 입력받고 위치 순으로 정렬시킨 리스트
lst = []
for _ in range(N):
    num, alpha = input().split()
    num = int(num)
    lst.append([num, alpha])
lst = sorted(lst, key = lambda x : x[0])
#########################################

#G혹은 H가 연속으로 올때의 경우의 합
sum_Result = [] 
sum = 0

#G가 연속으로 올때의 카운트
for i in range(len(lst)):
    if lst[i][1] == 'G':
        sum +=1
    elif sum != 1 : #sum이 1이라는 것은 G가 한개 올때를 뜻함
        sum_Result.append(sum)
        sum = 0

#H가 연속으로 올때의 카운트
for i in range(len(lst)):
    if lst[i][1] == 'H':
        sum +=1
    elif sum != 1 : #sum이 1이라는 것은 h가 한개 올때를 뜻함
        sum_Result.append(sum)
        sum = 0

#연속적인 수열에서 G와 H의 개수가 같은 최대값을 구하는 연산
#j 부터 끝까지 G와 H의 개수가 같을 위치를 계산
G_cnt = 0
H_cnt = 0
Result_2 = []
for i in range(len(lst)):
    for j in range(i, len(lst)):
        if lst[j][1] == 'G':
            G_cnt += 1
        elif lst[j][1] == 'H':
            H_cnt += 1

        #G의 개수와 H의 개수가 같은 경우의 거리를 연산하여 리스트에 저장
        if G_cnt == H_cnt:
            Result_2.append(lst[j][0] - lst[i][0])
    
    #i+1 번째에서 탐색하기 위한 변수 초기화
    G_cnt = 0
    H_cnt = 0

#리스트가 비었을때 max 연산이 안되기 때문에 필요한 연산
if Result_2 :
    Result_2_max = max(Result_2)
else : 
    Result_2.append(0)

#리스트가 비었을때 max 연산이 안되기 때문에 필요한 연산
if sum_Result:
    sum_Result_max = max(Result_2)
else :
    sum_Result.append(0)



print(max(max(Result_2),max(sum_Result)))