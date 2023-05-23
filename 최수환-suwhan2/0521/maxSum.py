'''
의사코드

하나씩 다 더해보기

'''

n, k = map(int, input().split())
arr=list(map(int,input().split()))

maxSum = 0

for i in range(n - k + 1):
    sum_val = 0
    for j in range(i, i + k):
        sum_val+=arr[j]
        maxSum = max(maxSum, sum_val)


print(maxSum)

