'''
의사코드

1. 클래스 정의(날짜,요일,날씨)
2. 객체를 넣을 리스트 선언
3. 입력값 n 받기
4. n번 입력받으면서 생성된 객체를 리스트에 하나씩 넣기
5. 가장 최근에 비온날을 구하기 위해 객체 기본값 초기화
6. 가장 최근에 비온날 구하기
    1. 객체의 날씨가 Rain이면 
        1.가장 최근에 비온날과 날짜 비교 후 더 최근인 날짜로 객체 변환
7. 최근에 비온날 객체의 요소들 출력
'''

class Weather:
    def __init__(self,date,day,weather):
        self.date=date
        self.day=day
        self.weather=weather

def main():
    #입력부
    weatherInformation=[]

    n=int(input())
    for _ in range(n):
        inputDate,inputDay,inputWeather= tuple(map(str,input().split()))     #튜플로 객체를 받아서
        weatherInformation.append(Weather(inputDate,inputDay,inputWeather))   #리스트에 객체 하나씩 추가

    #연산부
    recentDate=calculateRecentRainyday(n,weatherInformation)

    #출력부
    print(recentDate.date, recentDate.day, recentDate.weather)

def calculateRecentRainyday(n,weatherInformation):
    recentDate = Weather("9999-99-99", "", "")       #비교하기 위해서 최근에 비온날 객체 초기화
    for i in range(0,n):
        if weatherInformation[i].weather=="Rain":        #날씨가 비옴이면
            if recentDate.date>weatherInformation[i].date:       #최근에 비온날 객체의 날짜보다 최근이면
                recentDate=weatherInformation[i]        #최근에 비온날 객체 변환
    return recentDate

main()
