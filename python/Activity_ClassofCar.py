class Car:
    'This class represents a car'

    def __init__(self, company, model,  color):
        self.company = company
        self.model = model
        self.color = color

    def accelerate(self):
        print(self.company + "" + self.model + self.color )
    def stop(self):  
        print(self.company + "" + self.model + self.color )

car1 = Car("Toyota", "2015",  "White")
car2 = Car("Maruti", "2013",  "Red")
car3 = Car("Suzuki", "2017", "Black")

car2.accelerate()
car2.stop()