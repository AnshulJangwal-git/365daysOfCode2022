n = int(input())
sp1 = n - 1
sp2 = 0 

for i in range(1, n + 1) :
    
    for j in range(1, sp1 + 1) :
        print(end = "\t")
    
    print(end = "*\t")
    
    for j in range(1, sp2 + 1) :
        print(end = "\t")
    
    sp1 -= 1
    sp2 += 1
    print(end = "\n")