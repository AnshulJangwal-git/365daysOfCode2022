n = int(input())
#write your code here
sp = 2*n - 3
st1 = 1
st2 = 1

for i in range(1, n + 1) :
    val = 1
    for j in range(1, st1 + 1) :
        print(val, end = "\t")
        val += 1
    
    for j in range(1, sp + 1) :
        print(end = "\t")
    
    if(i == n) :
        val -= 1
        
    for j in range(1, st2 + 1) :
        val -= 1
        print(val, end = "\t")
    
    if(i == n - 1) :
        sp -= 2
        st1 += 1
        
    else :
        sp -= 2
        st1 += 1
        st2 += 1
    print()