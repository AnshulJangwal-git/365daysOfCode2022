# Link - https://nados.io/question/pattern-2
n = int(input())
#write your code here
for i in range(n, 0, -1) :
    for j in range(1, i + 1) :
        print("*", end = "\t")
    print(end = "\n")