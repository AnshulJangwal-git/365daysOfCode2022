from math import sqrt

def isPrime(n) :
    for i in range(2, (int)(sqrt(n)) + 1) :
        if(n % i == 0) :
            return False
    
    return True
    
    
def solution(al):
    for i in range(len(al)-1, -1, -1) :
        if(isPrime(al[i])) :
            al.pop(i) 



n = int(input())
al = []
al = list(map(int, input().split()))
solution(al)
print(al)
