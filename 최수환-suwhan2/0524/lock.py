'''
의사코드

1. 입력받기
2. 가능한 경우의 수를 찾기
    기본적으로 2이내로 가능하므로 5가지 케이스가 가능
    하지만 가장 끝에 있는 수는 3개
    끝에서 한칸 띄어져 있는 수는 4개의 케이스가 가능
    예외로 N이 3보다 작다면 N개의 케이스가 가능
3. 가능한 케이스로 변환후 경우의 수를 구하는 식에 적용

'''
N=int(input())
first, second, third =map(int,input().split())

def change_available_case(number, N):
    if number==1 or number==N: #제일 끝
        number=3
        if number>=N:
            number=N

    elif number==2 or number==N-1:   #끝에서 한칸 띄어진 수
        number=4
        if number>=N:
            number=N
    else:
        number=5
        if number>=N:
            number=N

    return number

#경우의 수로 변환
first_available_case = change_available_case(first,N)
second_available_case = change_available_case(second,N)
third_available_case = change_available_case(third,N)

#경우의 수로 모든 경우의 수 계산
def calculate_case(first_available_case,second_available_case,third_available_case,N):
    result = (first_available_case* N * N) + ((N-first_available_case) * second_available_case *N) + ((N-first_available_case) * (N-second_available_case) * third_available_case)
    return result

print(calculate_case(first_available_case,second_available_case,third_available_case,N))

