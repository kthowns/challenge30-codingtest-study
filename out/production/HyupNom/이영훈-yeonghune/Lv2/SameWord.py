'''
순서를 바꾸었을 때 같은 단어인지 판별하기
의사코드
1. 문자열을 리스트로 변환해서 입력받는다.
2. 각 리스트를 정렬한다.
3. 정열한 원소가 전부 다 같으면 Yes, 아니면 No를 출력한다.

추측
각각의 문자열이 문자열의 구성원소로 만들어질 수 있다는것은
정렬하고 AND 연산을 했을때 True가 출력될 수 있을 것이라 판단했다.
'''
Input_arr1 = list(input())
Input_arr2 = list(input())

Input_arr1 = sorted(Input_arr1)
Input_arr2 = sorted(Input_arr2)

if(Input_arr1 == Input_arr2):
    print("Yes")
else:
    print("No")