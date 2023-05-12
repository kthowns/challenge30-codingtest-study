'''
의사코드

1. 클래스 정의
2. n입력받기
3. 객체를 저장할 리스트 선언
4. 객체정보를 입력받아 생성후 리스트에 추가
5. 정력
6. 출력
'''
class Student:
    def __init__(self,tall,weight,number):
        self.tall=tall
        self.weight=weight
        self.number=number

#입력부
n=int(input())

students=[]
for i in range(1,n+1):
    tall,weight=tuple(map(int,input().split()))
    number=i
    students.append(Student(tall,weight,number))

#연산부
students.sort(key=lambda x: (-x.tall,-x.weight ))  #키 내림차순후 동일하다면 몸무게 내림차순 정렬

#출력부
for student in students: # 정렬 이후의 결과 출력
    print(student.tall, student.weight, student.number)
