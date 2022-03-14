n = int(input())

for i in range(1, n + 1) :
    for j in range(1, n + 1) :
        
        if(i == 1) :
            if(j <= n //2 + 1 or j == n) :
                print(end = "*\t")
            else :
                print("\t", end = "")
                
        elif(i <= n // 2) :
            if(j == n //2 + 1 or j == n) :
                print(end = "*\t")
            else :
                print(end = "\t")
                
        elif(i == n // 2 + 1) :
            print(end = "*\t")    
            
        elif(i < n) :
            if(j == 1 or j == n //2 + 1) :
                print(end = "*\t")
            else :
                print(end = "\t")
        
        else :
            if(j == 1 or j >= n //2 + 1) :
                print(end = "*\t")
            else :
                print(end = "\t")
    print()
            