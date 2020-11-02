fruitshop = {	
    "apple": 100,	
    "banana": 50,	
    "orange": 80
  	}
isFruitAvailable = input ("Which fruit ?").lower()
if (isFruitAvailable in fruitshop):
        print("Yes, this is available")
else:	
    print("No, this is not available")