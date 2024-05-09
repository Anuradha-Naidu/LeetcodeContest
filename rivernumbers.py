def fun(a):
    n=len(a)
    result = 0
    for i in range(2**(n-1)):
        res = 0
        y = a[0]
        for j in range(n-1):
            if(i>>j) & 1:
                res += int(y)
                y = a[j+1]
            else: 
                y += a[j+1]
                
            if j == n-2:
                res += int(y)
    
        result += res
    
    if n == 1:
        return str(a)
    else:
        return str(result)

print(fun(input()))
