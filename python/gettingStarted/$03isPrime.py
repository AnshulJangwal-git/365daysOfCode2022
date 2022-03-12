# Link - https://nados.io/question/is-a-number-prime
t = int(input())
for i in range(t) : 
    count = 0 
    n = int(input())
    div = 2 
    while(div * div <= n) :
        if(n % div == 0) :
            count += 1
        div += 1 
    
    
    if(count == 0) :
        print("prime")
    else :
        print("not prime")