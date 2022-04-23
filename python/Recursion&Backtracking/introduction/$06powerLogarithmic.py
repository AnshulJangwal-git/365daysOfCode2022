import sys
sys.setrecursionlimit(1500)

def powerLog(x, n):
    if n == 0 :
        return 1
    
    pnb2 = powerLog(x, n//2)
    pn = 1
    
    if(n % 2 == 0) :
        pn = pnb2 * pnb2
    else :
        pn = pnb2 * pnb2 * x
    
    return pn

num = int(input())
power = int(input())
print(powerLog(num, power))