n = int(input());
b = int(input());
def DecToAny(n,b):
    # Write your code here
    rv = 0
    p = 1 

    while(n > 0) :
        dig = n % b
        rv += dig * p
        p = p * 10 
        n = n // b

    return rv

if __name__ == "__main__":
    res = DecToAny(n,b)
    print(res)