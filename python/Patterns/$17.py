n = int(input())
sp = n//2
st = 1

for i in range(1, n + 1) :
    for j in range(1, sp + 1) :
        if(i != n//2 + 1) :
            print("\t", end = "")
        elif(i == n//2 + 1) :
            print(end = "*\t")
    
    for j in range(1, st + 1) :
        print("*\t", end = "")
        
    if(i <= n//2) :
        st += 1
    else :
        st -= 1
        
    print()