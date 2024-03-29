#Directions:
#Write a Python program that asks the user to enter a number 100 or greater and uses a loop to validate the entry. #Keep track of how many tries it takes the user to enter the correct input value.
#If the value entered is below 100:

#The user should be notified of the requirements and prompted to re-enter a number.

#If the value entered is 100 or above:

#Let the user know that their entry is valid.

#Allow only five tries to get the input correct. If the user has not entered a number 100 or greater after five tri#es, give them an error message and exit the program. If the number of tries is less than five, tell the user how m#any tries it took. If it is less than two tries, tell them they did a good job.
#First - Create your algorithm. Include this algorithm as a comment in your program.
#Use the algorithm to write your code. Test your program thoroughly with varying inputs to make sure that your loop #is working and your output to the user is correct.

#Submit your Python code (.py file) here.

tries = 0
while tries < 5:
    number = int(input("Please enter a number 100 or greater: "))
    tries += 1
    if number >= 100:
        print("Your entry is valid.")
        break
    else:
        print("The number entered is below 100. Please try again.")

if number < 100 and tries == 5:
    print("Error: You have exceeded the maximum number of attempts.")
elif tries < 2:
    print(f"Congratulations! It took you {tries} try to enter a valid number.")
else:
    print(f"It took you {tries} tries to enter a valid number.")