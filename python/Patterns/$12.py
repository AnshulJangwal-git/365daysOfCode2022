# Link - https://nados.io/question/pattern-12
n = int(input())

# write your code here
a = 0
b = 1

for i in range(1, n + 1) :
    for j in range(1, i + 1) :
        print(a, end = "\t")
        c = a + b
        a = b
        b = c
    print()