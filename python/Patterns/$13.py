# import math
# Link - https://nados.io/question/pattern-13
n = int(input())

for i in range(n) :
    icj = 1
    for j in range(0, i + 1) :
        print(icj, end = "\t")

        icjp1 = icj * (i - j) // (j + 1) 
        icj = icjp1

    print()         