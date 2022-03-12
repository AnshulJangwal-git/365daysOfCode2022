# Link - https://nados.io/question/digits-of-a-number
n = int(input())
temp = n 
nod = 0 

while(temp > 0) :
    temp = temp // 10
    nod += 1

div = pow(10, nod - 1)

while(div > 0) :
    q = n // div 
    print(q)
    n = n % div
    div = div // 10

