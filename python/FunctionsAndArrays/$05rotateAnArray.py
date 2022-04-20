def rotate(arr,n,k):
    n = len(arr)

    k = k % n
    if k < 0 :
        k = k + n
    
    reverse(arr, 0, len(arr) - k - 1)
    reverse(arr, len(arr) - k, len(arr) - 1) 
    reverse(arr, 0, len(arr) - 1) 

    return arr

def reverse(arr, i, j) :
    li = i
    ri = j

    while(li < ri) :
        swap(arr, li, ri)
        li += 1
        ri -= 1

def swap(arr, i, j) :
    temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
    
def main():
    n=int(input())
    arr=[]
    for i in range(n):
        val=int(input())
        arr.append(val)
    k=int(input())
    arr = rotate(arr,n,k)
    for i in range(n):
        print(arr[i],end=" ")


main()