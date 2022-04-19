def findElement(arr , data):
    idx = -1
    for i in range(0, len(arr)) :
        if data == arr[i] :
            idx = i
            break
    
    return idx


if __name__ == '__main__':
    num = int(input())
    arr = [0]*num
    
    for i in range(0 , num):
        val = int(input())
        arr[i] = val
    data = int(input())
    solution = findElement(arr , data)
    print(solution)