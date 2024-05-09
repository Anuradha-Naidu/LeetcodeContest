def fun(n):
    m=str(n)  //to convert int into string
    for i in range(len(m)-1):
        if m[i] == m[i+1]:
            return "Bad"
        
    return "Good"

print(fun(int(input())))
