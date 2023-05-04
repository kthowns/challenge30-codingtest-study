'''
재귀함수를 이용한 최댓값
의사코드
1. 리스트에 입력받는다.
2. 재귀함수를 통해서 max() 함수에 리스트의 모든 값이 인자로 들어가게 한다.
3. max() 함수의 반환값을 출력한다.
'''
def max_num(n):
    if n == 0:
        return lst[n]
    
    return max(max_num(n-1),lst[n-1])


n = int(input())
lst = list(map(int,input().split()))

print(max_num(n))