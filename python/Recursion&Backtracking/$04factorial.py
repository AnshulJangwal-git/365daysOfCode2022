def factorial(n):
    if n == 0 :
        return 1
    
    fn1 = factorial(n - 1)
    fn = n * fn1
    return fn
    
num = int(input())
print(factorial(num))