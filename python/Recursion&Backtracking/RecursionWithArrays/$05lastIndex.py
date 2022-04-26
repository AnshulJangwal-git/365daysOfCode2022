import sys
sys.setrecursionlimit (10000)

def Lastindex(arr, idx, x, n):
    if(idx == -1) :
        return -1
        
    if(arr[idx] == x) :
        return idx
    else :
        return Lastindex(arr, idx - 1, x, n)
    

def main() :
    n = int(input())
    arr = [] 
    for i in range(n) :
        arr.append(int(input()))
    x = int(input())
    
    ans = Lastindex(arr, n - 1, x, n)
    print(ans)

main()