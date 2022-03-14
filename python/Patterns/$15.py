def pattern15(n):
    st = 1
    sp = n//2
    val = 1

    for i in range(1, n + 1) :
        for j in range(1, sp + 1) :
            print(end = "\t")

        cval = val

        for j in range(1, st + 1) :
            print(cval, "\t", end = "")
            
            if(j <= st//2) :
                cval += 1
            else :
                cval -= 1
        
        if(i <= n//2) :
            sp -= 1
            st += 2
            val += 1
        else :
            sp += 1
            st -= 2
            val -= 1
        print()
               
n = int(input())
pattern15(n)


# code not working 