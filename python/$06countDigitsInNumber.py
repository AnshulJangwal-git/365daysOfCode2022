#  Link - https://nados.io/question/count-digits-in-a-number
def count(n):
    # write your code here
    count = 0 
    while(n > 0) :
        n = n//10
        count += 1
    
    print(count)


def main():
    n = int(input())
    count(n)

if __name__=="__main__":
    main()