'''
의사코드

행렬로 풀어보기
1. 입력받기
2. 행렬 정의
3. 행령 초기화(연결된 부분  1로 변환)
4. 방문한적이 있는지 확인하기 위해 정점의 개수만큼의 크기를 갖는 배열을 만들기
5. dfs 구현
    1. 카운트 전역변수로 설정
    2. 순회하며 방문하지 않았다면
        1. 카운트증가
        2. 방문한 곳으로 True로 변환
        3. dfs(curr_v) 재귀
    3. 카운트 반환
6. 카운트 0으로 초기화
7. 1은 카운트 하면 안되므로 Ture로 설정
8. 연산
9. 출력
'''

def dfs(vertex):
    global count

    for curr_v in range(1, N+1):
        if graph[vertex][curr_v] and not visited[curr_v]:      
            count+=1
            visited[curr_v]=True
            dfs(curr_v) #재귀

    return count

#입력부--------------------------------------------------------
N, M = map(int,input().split())

graph = [[0]*(N+1) for _ in range(N+1)]      #그래프를 표현할 행렬 초기화

for i in range(M):           #행렬에 간선에 맞게 연결된 정점 표시
    n1, n2 = map(int,input().split())
    graph[n1][n2] = 1
    graph[n2][n1] = 1

visited = [False for _ in range(N+1)]     #방문한 적이 있는지 확인하기


#연산부----------------------------------------------------------------
count = 0
visited[1]=True   #첫 1은 세면 안되믜로 True
count = dfs(1)

#출력부----------------------------------------------------------
print(count)
