example_set = {"apple", "banana", "cherry"}
example_set.add("orange") # One Item
example_set.update(["mango, grape"]) # Multiple Items
print(example_set)
print(len(example_set))
example_set.remove("banana")
print(example_set)
example_set.remove("bananaa")
print(example_set)	
example_set.discard("cherry")
print(example_set)