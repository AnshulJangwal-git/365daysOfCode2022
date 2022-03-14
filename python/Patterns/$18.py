n = int(input())
st = n
sp = 0

for i in range(1, n + 1) :
    for j in range(1, sp + 1) :
        print(end = "\t")
    
    for j in range(1, st + 1) :
        if(i > 1 and i <= n//2 and j > 1 and j < st) :
            print(end = "\t")
        else :
            print(end = "*\t")
    
    if(i <= n//2) :
        sp += 1
        st -= 2
    else :
        sp -= 1
        st += 2
    print()