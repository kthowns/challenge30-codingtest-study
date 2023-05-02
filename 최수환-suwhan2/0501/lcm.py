#촤소 공배수는 최대공약수로 구할 수 있다 
'''
안된다.....
의사코드

1. 값받기
2. 받은 값중 최댓값 찾기
3. 최소공배수 구하기
    1. 최댓값에 나머지 값들 나눠보기
        1. 나누는 과정에서 나머지가 0이아닌 값이 나오면 최댓값 곱하기2 후에 빠져나오기
        2. 모드 나머지 0으로 나눠질 경우 될경우 출력
    2. 재귀
4. 함수 사용
'''
n=int(input())
list_a=[]*n
list_a=map(int,input().split())
number=max(list_a)

def lcm(list_a,n):
    
    for i in list_a:
        if n % i != 0:
            n*=2
            break
        print(n)

    lcm(list_a,n)
    
lcm(list_a,number)


