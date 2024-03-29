# function to print the grid (map) for the sudoku
def print_grid(grid):
    for row in grid:
        print(" ".join(map(str, row)))

# function to get Sudoku puzzle input from the user
def get_user_input():
    print("Enter the Sudoku puzzle row by row, using 0 to represent empty cells:")
    print("Example of row: 5 3 4 6 7 8 9 1 2")
    grid = []
    # loop to get each row of the sudoku
    for _ in range(9):
        row = list(map(int, input().split())) # conver input into a list
        grid.append(row) # add to the grid
    return grid

# function to solve sudoku
def solve_sudoku(grid):
    empty_cell = find_empty_cell(grid)
    if not empty_cell:
        return True  # Puzzle solved
    row, col = empty_cell

    for num in range(1, 10):
        if is_valid_move(grid, row, col, num):
            grid[row][col] = num
            if solve_sudoku(grid):
                return True
            grid[row][col] = 0  # Backtrack 
    return False  # No solution found

# function to find an empty cell 
def find_empty_cell(grid):
    if len(grid) != 9:
        raise ValueError("Invalid Sudoku grid: Number of rows must be 9")
    for i, row in enumerate(grid):
        if len(row) != 9:
            raise ValueError(f"Invalid Sudoku grid: Number of columns in row {i+1} must be 9")
    for i in range(9):
        for j in range(9):
            if grid[i][j] == 0:
                return (i, j)  # Return row, col
    return None

# check the rules to see if the move is correct
def is_valid_move(grid, row, col, num):
    return (not used_in_row(grid, row, num) and
            not used_in_col(grid, col, num) and
            not used_in_subgrid(grid, row - row % 3, col - col % 3, num))

# check if the number is used alredy
# row
def used_in_row(grid, row, num):
    return num in grid[row]

# column
def used_in_col(grid, col, num):
    return any(row[col] == num for row in grid)

# subgrid
def used_in_subgrid(grid, row_start, col_start, num):
    for i in range(3):
        for j in range(3):
            if grid[i + row_start][j + col_start] == num:
                return True
    return False

# main function
if __name__ == "__main__":
    sudoku_grid = get_user_input() # get the sudoku from the user

    print("\nSudoku puzzle:") # print the sudoku that the user input
    print_grid(sudoku_grid)

    # solve and print the solved sudoku
    if solve_sudoku(sudoku_grid):
        print("\nSolved Sudoku:")
        print_grid(sudoku_grid)
    else:
        print("\nNo solution exists.")
