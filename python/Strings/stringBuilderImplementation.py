from io import StringIO

class StringBuilder :
    string = None

    def __init__(self) -> None:
        self.string = StringIO()
    
    def append(self, str) :
        self.string.write(str)
    
    def __str__(self) :
        return self.string.getvalue()
    

sb = StringBuilder()

sb.append("Hello ")
sb.append("World!")
print(sb)