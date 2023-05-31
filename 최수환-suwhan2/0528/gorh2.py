'''
의사코드

1. 위치와 알파벳을 가진 객체 정의
2. n입력받기, 객체를 저장할 리스트 만들기
3. 객체생성과 동시에 리스트에 추가
4. 객체의 위치 기준 오름차순 정렬
5. 완전탐색으로 최대사진크기 구하기
    1. i부터j까지 완전탐색
        1. G와H의 갯수 세기
    2. G가 0이거나 H가 0이거나 G와H의 갯수가 같으면 사진크기로 최댓값 비교
6. 최대사진크기 출력
'''

class People:
    def __init__(self,position,alphabet):
        self.position=position
        self.alphabet=alphabet

n=int(input())
array=[]

for i in range(n):          #객체생성해서 리스트에 넣기
    position,alphabet=input().split()
    position=int(position)
    array.append(People(position,alphabet))

array.sort(key=lambda x: x.position)

max_distance=0
for i in range(n):
    for j in range(i+1,n):
        countG=0
        countH=0
        for k in range(i,j+1):
            if array[k].alphabet=='G':
                countG+=1
            else:
                countH+=1
        if countG==0 or countH==0 or countG==countH:       
            distance = array[j].position-array[i].position
            max_distance=max(max_distance,distance)

print(max_distance)
