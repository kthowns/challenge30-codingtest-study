'''
비오는날

의사코드
1. 날짜, 요일, 날씨를 입력받아 Extractor를 통해서 나눈다.
2. Weather_Data에 모든 정보를 입력하고 객체 리스트에다가 저장한다.
3. 객체 리스트를 Year, Month, Day 순으로 정렬한다.
4. 리스트에 가장 먼저 있는 객체가 가장 근 시일내에 비가오는 날짜임으로 출력한다.

자기 후기
그래도 나름 객체 지향적으로 짜본다고 했는데 오히려 복잡해진것 같다.
'''
##########################################클래스##############################################

class Weather_Data:
    def __init__(self,Year, Month, Day, MonTue, Weather):
        self.setPrediction(Year, Month, Day, MonTue, Weather)

    def setPrediction(self,Year, Month, Day, MonTue, Weather):
        self.Year = Year
        self.Month = Month
        self.Day = Day
        self.MonTue = MonTue
        self.Weather = Weather
    
class Extractor:
    def __init__(self):
        return
    
    def Extractor(self,Input_arr):
        Year, Month, Day = Input_arr[0].split('-')
        MonTue = Input_arr[1]
        Weather = Input_arr[2]
        return Year, Month, Day, MonTue, Weather

#################################변수선언#####################################################

Rainy_Day =[]
object_arr = []
n = int(input())
Extractor = Extractor()

########################입력부###############################################################

for i in range(n):
    Input_arr = list(input().split(' '))
    Year, Month, Day, MonTue, Weather = Extractor.Extractor(Input_arr)
    object_arr.append(Weather_Data(Year, Month, Day, MonTue, Weather))

#########################연산부##############################################################

for Object in object_arr:
    if Object.Weather == "Rain":
        Rainy_Day.append(Object)
    
Rainy_Day = sorted(Rainy_Day, key=lambda Weather_Data: (Weather_Data.Year, Weather_Data.Month, Weather_Data.Day))
result = Rainy_Day[0]

#########################출력부##############################################################

print('{0}-{1}-{2} {3} {4}'.format(result.Year, result.Month, result.Day, result.MonTue, result.Weather))

