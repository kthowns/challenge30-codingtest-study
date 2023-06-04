'''
줄세우기
의사코드
1. 키, 몸무게, 번호를 입력받는다.
2. Student 객체에 입력하고 객체 리스트에 담는다.
3. 객체 리스트에서 정렬할때의 키, 몸무게, 번호 순으로 정렬을 실시한다.
   (키와 몸무게는 오름차순으로 번호는 내림차순으로 정렬한다.)
4. 리스트의 역순으로 출력한다. ( 키 큰 사람이 먼저 오기 위함)
'''

class Student:
    def __init__(self,Height, Weight, idx):
        self.Height = Height
        self.Weight = Weight
        self.idx = idx
    

n = int(input())
Students_list = []

#입력부
for idx in range(n):
    Height, Weight = map(int,input().split())
    Students_list.append(Student(Height, Weight, idx + 1))

#연산부
Students_list = sorted(Students_list, key = lambda Student : (Student.Height, Student.Weight, -Student.idx))

#출력부
for student in reversed(Students_list):
    print("{0} {1} {2}".format(student.Height, student.Weight, student.idx))
    
