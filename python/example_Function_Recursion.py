# Calculate the sum of numbers
# using recursion
  
num = int(input("Enter a number: "))
def sum(n):
    if (n<=1):
     return n
    else:
     return n+sum(n-1)

print("The sum is: ", sum(num))