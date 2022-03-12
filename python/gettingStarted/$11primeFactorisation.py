# Link - https://nados.io/question/prime-factorisation-of-a-number
def primeFac(n):
    # write your code here
    div = 2
    while(div * div <= n) :
        while(n % div == 0) :
            print(div, end = " ")
            n = n // div
        div += 1
    if(n != 1) :
        print(n)

def main():
    n = int(input())
    primeFac(n)

if __name__=="__main__":
    main()