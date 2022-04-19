list = ["banana", "apple", "cheery", "grapes", "orange"]
print(list) 

# pop() - remove element from the last..
print(list.pop())

# len() - gives the present length of the list.
print(len(list))

# Input from the user
list2 = []
for x in range(4) :
    elem = int(input())
    list2.append(elem)  
    # append() - add from the last in the list always..

print(list2)

list2.remove(3)
print(list2)