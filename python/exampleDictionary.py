example_dict =	{
  "brand": "Toyota",
   "Model" : "Camry" ,
   "Year": 2019 ,
}
print(example_dict)
x = example_dict["brand"]
example_dict["Year"] =2018
y =example_dict["Year"] 
print(x)
print(y)
example_dict.popitem()
print(example_dict)
example_dict.pop("brand")
example_dict["color"] = "red"
print(example_dict)
for z in example_dict:
  print(z)

for z in example_dict:
  print(example_dict[z])
  	
for a in example_dict.values():
  print(a)

	
example_dict2 = dict(brand="Toyota",Model="Camry")
	
print(example_dict2)


