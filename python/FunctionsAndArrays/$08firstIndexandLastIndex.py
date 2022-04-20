n= int(input())

arr = []

for i in range(0, n):
    ele= int(input())
    arr.append(ele)
    
data= int(input())

# Write your code here.
li = -1
ri = -1

for i in range(n) :
    if arr[i] == data :
        li = i
        break 

for i in reversed(range(n - 1)) :
    if arr[i] == data :
        ri = i
        break

print(li) 
print(ri)