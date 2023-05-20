'''
의사코드

1. 입력받기
2. 입력받은 값 하나씩 분리해 리스트 넣기
3. 최댓값 찾기
        1. 앞에서 부터 0일시 1로 바꾸고 break
        2. 바뀐게 없으면 마지막 1 0으로 바꾸기
4. 자릿수마다 계산해 10진수 바꾸기
5. 출력
'''

def main():
    a=int(input())
    alist=inputa(a)
    alist=findMaxNumber(alist)
    result=changeDecimal(alist)
    print(result)

def inputa(a):    #비교를 위해 리스트에 정수한글자씩 넣기
    alist=[]
    for i  in str(a):
        alist.append(i)
    return alist

def findMaxNumber(alist): #최댓값으로 변환
    for i in range(0,len(alist)):
        if alist[i]=='0':     #가장 큰 0을 1로 교환
            alist[i]='1'
            break

        elif i==len(alist)-1:    #모두 1인경우 하나는 바꿔야 하므로 마지막 원소를 0으로 교환
            alist[-1]='0'

    return alist
    
def changeDecimal(alist):    #최댓값 십진수로 바꾸기
    result=0
    binary=1
    i=-1

    for _ in range(len(alist)):
        result += int(alist[i])*binary
        binary *= 2
        i-=1

    return result

main()
