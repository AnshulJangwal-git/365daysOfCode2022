# Link - https://nados.io/question/pattern-4
n = int(input())
#write your code here
st = n 
sp = 0

for i in range(1, n + 1) :
    for j in range(1, sp + 1) :
        print(end = "\t")
    for j in range(1, st + 1) :
        print(end = "*\t")
    
    sp += 1
    st = st - 1 
    print() 