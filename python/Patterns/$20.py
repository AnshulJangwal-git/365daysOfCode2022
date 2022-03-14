n = int(input())

for i in range(1, n + 1) :
    for j in range(1, n + 1) :
        if (j == 1 or j == n) :
            print(end = "*\t")
        
        elif (i > n // 2 and (i == j or i + j == n + 1)) :
            print(end = "*\t")
        
        else :
            print(end = "\t")
    
    print() 