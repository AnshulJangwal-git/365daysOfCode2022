# Link - https://nados.io/question/print-fibonacci-numbers-till-n
n = int(input())
a = 0 
b = 1

for i in range(n) :
    print(a)
    c = a + b
    a = b
    b = c