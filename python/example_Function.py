def my_firstpythonfun():
    print("Hello")
my_firstpythonfun()

Name = input("Pls enter your Name:")
def my_function(Name):
    print("Hi " + Name)
my_function(Name)

def mynewfunction(*pets):
    print("The youngest pet is " + pets[2])
mynewfunction("Timmy", "Archie", "Capton") 

def my_function11(State = "Kerala"):
  print("I am from " + State)
my_function11("Bangalore")
my_function11()