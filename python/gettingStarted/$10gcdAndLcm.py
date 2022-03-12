# Link - https://nados.io/question/gcd-and-lcm
n1 = int(input())
n2 = int(input())

t1 = n1
t2 = n2

while(n1 % n2 != 0) :
    rem = n1 % n2
    n1 = n2
    n2 = rem

gcd = n2
lcm = (t1 * t2 )// gcd
print(gcd)
print(lcm)