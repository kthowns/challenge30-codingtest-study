'''
의사코드

1. 입력받기
2. 선택정렬 구현
    1. 기준점 끝에서부터 i값 잡기
        1. 기준점보다 적은 원소중 가장 큰수 찾기
    2. 기준점과 최대원소가 다르다면 
        1. swap
        2. 카운트 증가
    3. 카운트가 K라면
        1. 카운트 리턴
    4. 아무것도 안걸렸으면 -1 리턴

3. 연산해서 answer로 받기
4. -1인지 아닌지에따라 두가지 방법으로 출력
    1. -1일경우 그냥 출력
    2. 아닐경우 배열 array 출력(조건에 맞게 띄어서)
'''

N, K = map(int,input().split())
array=list(map(int,input().split()))

def selection_sort(arr,K):
    countk=0
    
    for i in range(len(arr)-1,0,-1):
        max_idx = i
        
        for j in range(i-1,-1,-1):
            if arr[j] > arr[max_idx]:
                max_idx = j
        
        if max_idx != i:
            arr[i], arr[max_idx] = arr[max_idx], arr[i]
            countk+=1
        
        if countk == K:
            return countk
    return -1


answer = selection_sort(array,K)

if answer==-1:
    print(answer)
else:
    for i in range(N):
        print(array[i], end=" ")

