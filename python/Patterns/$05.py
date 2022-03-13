n = int(input())

sp = n // 2
st = 1 

for i in range(1, n + 1) :
    for j in range(1, sp + 1) :
        print(end = "\t") 
    for j in range(1, st + 1) :
        print(end = "*\t")
    
    if(i <= n//2) :
        st += 2
        sp -= 1
    else :
        st -= 2
        sp += 1
    print(end = "\n")