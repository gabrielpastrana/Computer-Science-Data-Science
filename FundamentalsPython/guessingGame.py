import random

def guess_number_game():
    random_number = random.randint(1, 100)
    
    num_guesses = 0
    guessed_correctly = False
    
    while not guessed_correctly:
        user_guess = int(input("Guess the number between 1 and 100: "))
        
        num_guesses += 1
        
        if user_guess == random_number:
            print("Congratulations! You guessed the number {} correctly in {} guesses.".format(random_number, num_guesses))
            guessed_correctly = True
        elif user_guess < random_number:
            print("Too low, try again.")
        else:
            print("Too high, try again.")

guess_number_game()