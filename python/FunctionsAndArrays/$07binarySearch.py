def binarySearch(arr, data) :
  arr.sort()
  lo = 0
  hi = len(arr) - 1

  while(lo <= hi) :
      mid = (lo + hi) // 2
      if arr[mid] == data :
          return mid
      elif arr[mid] < data :
          lo = mid + 1 
      elif arr[mid] > data :
          hi = mid - 1 
  
  return -1

n = int(input())
arr = []

for i in range(n) :
  val = int(input())
  arr.append(val) 

data = int(input())

idx = binarySearch(arr, data)
print(idx)
