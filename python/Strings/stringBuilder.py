from io import StringIO


myList = ['abc', 'xyz', 'def']
# 1 join method
str = ("").join(myList)
print(str)


# 2 concatenation method()
myString = ''
for word in myList :
    myString += word + " "

print(myString)

# 3 using String IO 
string = StringIO()
string.write("Hello ")
string.write("World!")

print(string.getvalue())

