n = int(input())
m =[]
for i in range(n):
    a,b=map(int,input().split())
    m.append([a,b])

t=sorted(m, key=lambda x:x[1])
for i in t:
    print(i[0], end=" ")
