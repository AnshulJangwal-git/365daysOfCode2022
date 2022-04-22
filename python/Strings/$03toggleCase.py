def togglecase(st):
    ans = ""
    for i in range(0, len(st)) :
        ch = st[i] 
        if(ch >= 'a' and ch <= 'z') :
            # if lowercase
            uch = (chr)(ord('A') + ord(ch) - ord('a'))
            ans += uch
        else :
            lch = (chr)(ord('a') + ord(ch) - ord('A'))
            ans += lch
    return ans 
            

if __name__ == '__main__':
    st = input()
    str = togglecase(st)
    print(str)