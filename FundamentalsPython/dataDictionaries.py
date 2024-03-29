import csv

# Read the CSV file and create a data dictionary
def read_tax_rates(filename):
    tax_rates = {}
    with open(filename, newline='') as csvfile:
        reader = csv.reader(csvfile)
        for row in reader:
            state, rate = row
            tax_rates[state] = float(rate)
    return tax_rates

# Calculate average tax rate
def calculate_average_tax(tax_rates):
    total_tax = sum(tax_rates.values())
    average_tax = total_tax / len(tax_rates)
    return average_tax

# Determine if the user wants to enter another state
def another_state():
    answer = input("Would you like to enter another state? (yes/no): ").lower()
    return answer == 'yes'

# Main program
if __name__ == "__main__":
    filename = "state_CSV.txt"
    tax_rates = read_tax_rates(filename)

    while True:
        # Prompt user to enter their state abbreviation
        state_abbr = input("Enter your 2-character state abbreviation: ").upper()
        
        if state_abbr in tax_rates:
            user_tax_rate = tax_rates[state_abbr]
            # Calculate average tax rate
            average_tax_rate = calculate_average_tax(tax_rates)
            
            # Compare user's tax rate with average
            if user_tax_rate > average_tax_rate:
                comparison = "higher"
            elif user_tax_rate < average_tax_rate:
                comparison = "lower"
            else:
                comparison = "equal to"
            
            # Count number of states with lower, same, and higher tax rates
            lower_count = sum(1 for rate in tax_rates.values() if rate < user_tax_rate)
            same_count = sum(1 for rate in tax_rates.values() if rate == user_tax_rate)
            higher_count = sum(1 for rate in tax_rates.values() if rate > user_tax_rate)

            # Display results to the user
            print(f"\nYour sales tax rate is: {user_tax_rate:.2f}%")
            print(f"The average sales tax for all states is: {average_tax_rate:.2f}%. Your rate is {abs(user_tax_rate - average_tax_rate):.2f}% {comparison} than the average.")
            print(f"There are {lower_count} states with a lower tax rate, {same_count} with the same rate, and {higher_count} with a higher rate.\n")

            if not another_state():
                break
        else:
            print("Invalid state abbreviation. Please enter a valid 2-character state abbreviation.")
