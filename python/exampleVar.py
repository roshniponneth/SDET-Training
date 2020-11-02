a = "Hello, World!"
#print(a.upper()) # Output: "hello, world!"
#print(a.lower()) # Output: "hello, world!"
#print(a.split("l")) # returns ['Hello', ' World!'] 
# print(len(a))

#txt = "The rain in Spain stays mainly in the plain"
#x = "in" in txt
#y = "ain" not in txt
#print(x) # True
#print(y) # False
#a = "Hello"
#b = " World"
#c = a + b
#print(c) # "Hello World"

#age = 36
#txt = "My name is John, and I am {}"
#print(txt.format(age))
# Output: My name is John, and I am 36
quantity = 6
itemno = 2.4
price = 49.95
myorder = "I want to pay {2} dollars for {0} pieces of item {1}."
print(myorder.format(quantity, itemno, price))

print(quantity//itemno)
# Output: I want to pay 49.95 dollars for 3 pieces of item 567.

username = input("Enter username:")
print("Username:" +username)