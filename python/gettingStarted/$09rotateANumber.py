def rotate(n,k):
    # write your code here
    nod = 0 
    temp = n
    while(temp != 0) :
      temp = temp // 10
      nod += 1 

    k = k % nod 
    if(k < 0) :
      k = k + nod
    
    div = pow(10,k)
    mult = pow(10, nod - k)

    q = n // div
    rem = n % div
    rot = rem * mult + q
    print(rot)

def main():
    n = int(input())
    k = int(input())
    rotate(n,k)

if __name__=="__main__":
    main()