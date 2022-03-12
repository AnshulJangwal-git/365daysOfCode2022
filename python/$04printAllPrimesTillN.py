low = int(input())
high = int(input())

for i in range(low, high + 1) :
    count = 0 
    div = 2
    
    while(div*div <= i) :
        if(i % div == 0) :
            count += 1
            break
        div += 1
    if(count == 0) :
        print(i)