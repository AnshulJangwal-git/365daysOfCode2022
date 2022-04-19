n = int(input())
d = int(input())

def freq(n, d):
    count = 0 
    while(n > 0) :
        dig = n % 10 
        if(dig == d) :
            count += 1
        n = n // 10
    
    return count

if __name__ == "__main__":
  print(freq(n, d))