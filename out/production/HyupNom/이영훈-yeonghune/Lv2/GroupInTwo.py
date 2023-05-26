'''
2개씩 그룹 짓기
의사코드
1. 입력 받은 배열을 정렬한다.
2. 배열의 최댓값과 최소값, 그다음 최대값과 최소값을 짝 짛어서 Result배열에 입력한다.
3. Result 배열의 최댓값을 출력한다.

추측
최댓값이 가장 작아지는 경우는 배열의 가장 큰 값과 가장 작은 값의 합일 거라 생각했다.
하지만 2 3 5 5 처럼 5가 겹치는 경우가 있을 수 있다.
그래서, 배열에 모든 값을 다 더해주고 다시 한번 최댓값 연산을 통해 출력한다.
'''
N = int(input())
Input_arr = list(map(int, input().split())) 

Sorted_arr = sorted(Input_arr)
Result = []

for i in range(N):
    Result.append(Sorted_arr[-i-1]+Sorted_arr[i])

print(max(Result))