n = int(input())
# write ur code here
sp1 = n//2 
sp2 = -1

for i in range(1, n + 1) :
    for j in range(1, sp1 + 1) :
        print(end = "\t") 
    
    print(end = "*\t")
    
    for j in range(1, sp2 + 1) :
        print(end = "\t") 
        
    if(i > 1 and i < n) :
        print(end = "*\t")
    
    if(i <= n//2) :
        sp1 -=1
        sp2 += 2
    else :
        sp1 += 1
        sp2 -= 2
    
    print()
