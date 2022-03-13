# Link - https://nados.io/question/pattern-6
n = int(input())
st = n//2 + 1
sp = 1

for i in range(1, n + 1) :
    for j in range(1, st + 1) :
        print(end = "*\t")
    
    for j in range(1, sp + 1) :
        print(end = "\t")
    
    for j in range(1, st + 1) :
        print(end = "*\t")
    
    if(i <= n//2) :
        sp += 2
        st -= 1
    else :
        sp -= 2
        st += 1
    
    print(end = "\n")