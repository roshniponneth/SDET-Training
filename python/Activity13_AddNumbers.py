
def function_sum(numbers):
    sum = 0
    for number in numbers:
      sum +=number
    return sum

List_Numbers =[23,10,12,1]
result = function_sum(List_Numbers)
	
# Print result with message
	
print("The sum of all the elements is: " + str(result))