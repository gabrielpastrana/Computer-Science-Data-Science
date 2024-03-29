import random

def get_computer_choice():
    choice_num = random.randint(1, 3)
    
    if choice_num == 1:
        return "rock"
    elif choice_num == 2:
        return "paper"
    else:
        return "scissors"

def determine_winner(user_choice, computer_choice):
    if user_choice == computer_choice:
        return "It's a tie! Both players chose {}.".format(user_choice)
    elif (user_choice == "rock" and computer_choice == "scissors") or \
         (user_choice == "scissors" and computer_choice == "paper") or \
         (user_choice == "paper" and computer_choice == "rock"):
        return "You win! {} beats {}.".format(user_choice, computer_choice)
    else:
        return "Computer wins! {} beats {}.".format(computer_choice, user_choice)

def main():
    user_choice = input("Enter your choice (rock, paper, or scissors): ").lower()
    
    while user_choice not in ["rock", "paper", "scissors"]:
        print("Invalid choice. Please enter 'rock', 'paper', or 'scissors'.")
        user_choice = input("Enter your choice: ").lower()
    
    computer_choice = get_computer_choice()
    
    print("Computer chooses:", computer_choice)
    
    print(determine_winner(user_choice, computer_choice))

if __name__ == "__main__":
    main()
