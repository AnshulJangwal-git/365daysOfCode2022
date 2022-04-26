import sys
sys.setrecursionlimit(10000)

def firstIndex(arr,idx,x):
    if(idx == len(arr)) :
        return -1

    if(arr[idx] == x) :
        return idx
    else :
        fi = firstIndex(arr, idx + 1, x)
        return fi

def main() :
    n = int(input())
    arr = [] 
    for i in range(n) :
        arr.append(int(input())) 
    
    x = int(input())
    fi = firstIndex(arr, 0, x)
    print(fi) 

main() 