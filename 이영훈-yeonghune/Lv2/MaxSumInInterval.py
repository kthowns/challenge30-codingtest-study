'''
구간 중 최대 합
의사코드
1. n, k를 입력받는다.
2. lst에 전체를 입력한다.
3. n-(k-1) 번 만큼 반복한다.(1*k 격자가 n을 초과하지 않도록)
4. 내부 for 문에서 lst의 k개의 원소들을 추출하여 sum에 더한다.
5. 구해진 sum이 Result 보다 크면 Result에 sum을 추가한다(최댓값)

발견한 사실!!!!!!
if sum > Result:
if Result < sum: 
은 둘다 같은것을 의미하나 속도와 메모리는 다음과 같다.
sum > Result 속도 91 메모리 39
Result < sum 속도 75 메모리 33
아마 어셈블리 언어에서 slt 라는 명령어가 존재하는데
if a < b를 의미한다. 하지만 if b > a를 만들어주려면
기존에 존재하는 명령어들로 조합해서 사용되기 때문에
어셈블리 수준에서 더 많은 명령어를 사용해서 그렇다고 추측된다.
'''

n, k = map(int, input().split())
lst = list(map(int, input().split()))
Result = 0
for i in range(n-(k-1)):
    sum=0
    for j in range(i,i+k):
        sum +=lst[j]
    if Result < sum :
        Result = sum
print(Result)