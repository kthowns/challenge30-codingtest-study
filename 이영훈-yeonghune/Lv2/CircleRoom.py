n = int(input())

distance = [i for i in range(n)]
lst = [int(input()) for i in range(n)]
Result = []

for _ in range(n):
    sum = 0
    for i in range(n):
        sum += distance[i] * lst[i]
        
    Result.append(sum)
    lst.append(lst.pop(0))
        
print(min(Result))