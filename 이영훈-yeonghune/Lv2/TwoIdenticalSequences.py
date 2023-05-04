'''
두 개의 동일한 수열
의사코드
1. A 와 B의 리스트를 입력받는다.
2. A 원소 하나를 B의 모든 원소와 비교하고 같은 값이 있으면
3. flag를 True로 만들어서 2중 for문을 탈출한다.
4. repeat() 메소드의 결과가 True면 Yes, False면 No를 출력한다.

자기 리뷰
사실 하나의 함수에 넣거나 그냥 절차 지향적으로 짜도 되는데, 클래스공부도 할겸 클래스로 짜봤어요.
flag 쓰는건 약간 제가 좋아하는 기법인데, 이중 for문에서 내부 for문에서 조건에의해 탈출하고 싶을때
외부 for문 까지 같이 탈출할수 있게 하는 기법이에요. 하지만 쫌 더 깔끔하게 리팩토링 하는 방법이 필요할 것 같아요.

'''
class Comparison :
    #출력부
    def __init__(self, lst1, lst2):
        if self.repeat(lst1, lst2):
            print('Yes')
        else:
            print('No')

    #연산부
    def repeat (self ,lst1, lst2):
        for num_first_seq in lst1: 
            flag = False
            for num_second_seq in lst2:
                if num_first_seq == num_second_seq:
                    flag = True
            
            if flag == False:
                return False
        
        return True
            

    
n = int(input())

A = list(map(int,input().split()))
B = list(map(int,input().split()))

Comparison(A,B)