# Link - https://nados.io/question/pattern-11
n = int(input())
#write your code here
a = 1


for i in range(1, n + 1) :
    for j in range(1, i + 1) :
        print(a, end = "\t")
        a += 1
    print()