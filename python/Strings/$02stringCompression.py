def String_compression01(st):
    i = 0
    while(i < len(st)) :
        while(i < len(st) - 1 and st[i] == st[i + 1]) :
            i = i + 1
        
        print(st[i], end = "")
        i += 1
    print()
        
        
def String_compression02(st):
    i = 0
    count = 1
    
    while(i < len(st)) :
        while(i < len(st) - 1 and st[i] == st[i + 1]) :
            i = i + 1
            count += 1
        
        print(st[i], end = "")
        if(count > 1) :
            print(count, end = '')
            count = 1
        
        i += 1
    print()

st = input()
String_compression01(st)
String_compression02(st)
