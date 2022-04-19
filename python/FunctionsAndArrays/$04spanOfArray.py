def getSpan(arr):
    # write your code here
    maxValue = arr[0]
    minValue = arr[0]

    for i in range(1, len(arr)) :
        if arr[i] > maxValue :
            maxValue = arr[i]

        if arr[i] < minValue :
            minValue = arr[i]
    
    span = maxValue - minValue
    return span


if __name__ == '__main__':
    num = int(input())
    
    arr=[0]*num
    for i in range(0,num):
        val=int(input())
        arr[i]=val
    
    solution = getSpan(arr)
    print(solution)