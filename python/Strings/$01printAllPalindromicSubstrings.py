def isPalindromic(ss) :
    lo = 0
    hi = len(ss) - 1
    
    while(lo < hi) :
        if(ss[lo] != ss[hi]) :
            return False
        
        lo += 1
        hi -= 1
    
    return True


def printallpalindrome(st):
    for i in range(0, len(st)) :
        for j in range(i + 1, len(st) + 1) :
            ss = st[i : j]
            if(isPalindromic(ss)) :
                print(ss)


st = str(input())
printallpalindrome(st)