'''
의사코드

1. 입력받기
2. 경우의 수마다 합의 차를 구해 비교
'''
developers=list(map(int,input().split()))


def get_diff(i, j,k):
    sum1 = developers[i] + developers[j] +developers[k]
    sum2 = sum(developers) - sum1
    return abs(sum1 - sum2)


min_diff = 10000000
for i in range(0, 6):
    for j in range(i + 1, 6):
        for k in range(j + 1, 6):
            min_diff = min(min_diff, get_diff(i, j, k))

print(min_diff)
