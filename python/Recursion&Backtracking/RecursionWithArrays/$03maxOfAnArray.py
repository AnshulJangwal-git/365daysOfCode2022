import sys
sys.setrecursionlimit (10000)

def maxOfArray(arr, idx, n):
    if idx == n - 1 :
        return arr[idx]
        
    misa = maxOfArray(arr, idx + 1, n)
    if arr[idx] > misa :
        return arr[idx]
    else :
        return misa


def main() :
    n = int(input())
    arr = []
    for i in range(n) :
        arr.append(int(input()))
    
    ans = maxOfArray(arr, 0, n)
    print(ans)

main()