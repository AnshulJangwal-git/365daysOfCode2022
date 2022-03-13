# Link - https://nados.io/question/pattern-3
n = int(input())
#write your code here
sp = n - 1
st = 1

for i in range(1, n + 1) :
    for j in range(1, sp + 1) :
        print(end = "\t")
    
    for j in range(1, st + 1) :
        print(end = "*\t")
    
    sp = sp - 1
    st += 1

    print(end = "\n")


