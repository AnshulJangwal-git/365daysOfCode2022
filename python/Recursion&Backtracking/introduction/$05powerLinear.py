def powerLinear(x, n):
    if n == 0 :
        return 1
        
    pn1 = powerLinear(x, n - 1)
    pn = x * pn1 
    return pn
    
num = int(input())
power = int(input())
print(powerLinear(num, power))