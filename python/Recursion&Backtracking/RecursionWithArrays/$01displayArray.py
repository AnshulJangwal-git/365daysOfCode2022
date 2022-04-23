def displayArray(arr, idx, n):
    if idx == len(arr) :
        return
        
    print(arr[idx])
    displayArray(arr, idx + 1, n) 

def main():
    n = int(input())
    arr = [] 
    for i in range(n) :
        val = int(input())
        arr.append(val)
    
    displayArray(arr, 0, len(arr))

main()