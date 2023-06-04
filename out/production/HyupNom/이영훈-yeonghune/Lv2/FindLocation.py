'''
정렬된 숫자 위치 알아내기
의사코드
1. 리스트를 입력받고, 정렬시킨 리스트를 만든다.
2. 인풋 리스트의 원소 하나 하나씩 정렬된 리스트의 원소와 대조하고
같으면 0을 정렬된 리스트에 입력하고 해당하는 인덱스 값을 Result 리스트에 저장하고 내부 반복문을 탈출한다.
3. 출력한다.

자기 리뷰
이렇게 풀라고 만든 문제가 아닌거 같은데, 이중 for문으로 풀어버렸다.
하지만 다른 사람들의 코드를 보니깐 파이썬은 대부분 이렇게 푼거 같다.
'''
n = int(input())
Result = []

#입력부
Input_arr = list(map(int, input().split()))
Sorted_arr = sorted(Input_arr)

#연산부
for Input_Num in Input_arr:
    for Num2 in range(n):
        if Input_Num == Sorted_arr[Num2]:
            Sorted_arr[Num2] = 0
            Result.append(Num2+1)
            break

#출력부
for Result_Number in Result:
    print("{0}".format(Result_Number), end=' ')