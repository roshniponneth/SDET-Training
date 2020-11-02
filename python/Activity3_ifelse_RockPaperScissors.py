# Get the users names
user1 = input("What is Player 1's name? ")
user2 = input("What is Player 2's name? ")

# Get the users choices
user1_answer = input(user1 + ", do you want to choose rock, paper or scissors? ").lower()
user2_answer = input(user2 + ", do you want to choose rock, paper or scissors? ").lower()

# Run the algorithm to see who wins
if (user1_answer ==  user2_answer):
     print("It is a tie")
elif user1_answer == 'rock':
    if user2_answer == 'paper':
            print("rock wins")
    else:
            print("scissors wins")
elif user1_answer == 'paper':
    if user2_answer == 'scissors':
            print("paper wins")
    else:
            print("rock wins")
elif user1_answer == 'rock':
    if user2_answer == 'scissors':
            print("rock wins")
    else:
            print("paper wins")
else:
    print("User entered invalid input")
    