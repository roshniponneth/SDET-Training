# Given lists
List1 = [10,12,14,15,19]
List2 = [13, 43, 24, 36, 12]

print("First List ", List1)
print("Second List ", List2)

# Declare a third list that will contain the result
thirdList = []

# Iterate through first list to get odd elements
for num in listOne:
    if (num % 2 != 0):
        thirdList.append(num)
        
# Iterate through first list to get even elements
for num in listTwo:
    if (num % 2 == 0):
        thirdList.append(num)

# Print result
print("result List is:")
print(thirdList)