def reverse(arr,n):
    li = 0
    ri = n - 1

    while(li < ri) :
        swap(arr, li, ri)
        li += 1
        ri -= 1
    
    return arr

def swap(arr, i, j) :
    temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp


def main():
    n=int(input())
    arr=[]*n
    for i in range(n):
        val=int(input())
        arr.append(val)
    arr = reverse(arr,n)
    for i in range(n):
        print(arr[i],end=" ")

main()