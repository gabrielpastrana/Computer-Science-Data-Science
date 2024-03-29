def create_acronym(phrase):
    words = phrase.split()
    
    acronym = ''
    
    for word in words:
        acronym += word[0].upper()  # Convert the first letter to uppercase
    
    return acronym

def main():
    user_input = input("Enter a phrase: ")
    
    result = create_acronym(user_input)
    
    print("The acronym for '{}' is: {}".format(user_input, result))

if __name__ == "__main__":
    main()
