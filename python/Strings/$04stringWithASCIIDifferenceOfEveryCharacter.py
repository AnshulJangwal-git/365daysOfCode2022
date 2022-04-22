def printstring(st):
    ans = ""
    ans += st[0]
    
    for i in range(1, len(st)) :
        curr = st[i]
        prev = st[i - 1]
        
        gap = (int)(ord(curr) - ord(prev))
        ans += str(gap)
        ans += curr
    
    print(ans)

st = input()
printstring(st)
