def displayArrayReverse(arr, idx) :
    if idx == len(arr) :
        return
    
    displayArrayReverse(arr, idx + 1)
    print(arr[idx])

def main() :
    n = int(input())
    arr = []
    
    for i in range(n) :
        arr.append(int(input()))
    
    displayArrayReverse(arr, 0)

main()