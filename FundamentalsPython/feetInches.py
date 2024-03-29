def feet_to_inches(feet):
    return feet * 12  # 1 foot equals 12 inches

def main():
    feet = float(input("Enter the number of feet: "))
    
    inches = feet_to_inches(feet)
    
    print("The number of inches in {} feet is: {}".format(feet, inches))

if __name__ == "__main__":
    main()
