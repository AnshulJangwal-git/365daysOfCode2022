# Link - https://nados.io/question/pattern-1
n = int(input())

for i in range(1, n + 1) :
    for j in range(1, i + 1) :
        print("*", end = "\t")
    print(end = "\n")
