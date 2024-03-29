Python 3.11.4 (tags/v3.11.4:d2340ef, Jun  7 2023, 05:45:37) [MSC v.1934 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
red = 'red'
blue = 'blue'
... yellow = 'yellow'
... color1 = input("Please enter the color you want to display: ")
... color2 = input("Please enter the second color you want to display: ")
SyntaxError: multiple statements found while compiling a single statement
>>> color1 = input("Please enter the color you want to display: ")
... color2 = input("Please enter the second color you want to display: ")
SyntaxError: multiple statements found while compiling a single statement
>>> if color1 == 'red' and color2 == 'blue' or color1 == 'blue' and color2 == 'red':
...     print('Purple')
... elif color1 == 'red' and color2 == 'yellow' or color1 == 'yellow' and color2 == 'red':
...     print('Orange')
... elif color1 == 'blue' and color2 == 'yellow' or color1 == 'yellow' and color2 == 'blue':
...     print('green')
... 
...     
Traceback (most recent call last):
  File "<pyshell#8>", line 1, in <module>
    if color1 == 'red' and color2 == 'blue' or color1 == 'blue' and color2 == 'red':
NameError: name 'color1' is not defined
>>> color1 = input("Please enter the color you want to display: ")
... color2 = input("Please enter the second color you want to display: ")
SyntaxError: multiple statements found while compiling a single statement
>>> color1 = input("Please enter the color you want to display: ")
... color2 = input("Please enter the second color you want to display: ")
... if color1 == 'red' and color2 == 'blue' or color1 == 'blue' and color2 == 'red':
...     print('Purple')
... elif color1 == 'red' and color2 == 'yellow' or color1 == 'yellow' and color2 == 'red':
...     print('Orange')
... elif color1 == 'blue' and color2 == 'yellow' or color1 == 'yellow' and color2 == 'blue':
...     print('green')
...     
SyntaxError: multiple statements found while compiling a single statement
>>> color1 = input("Please enter the color you want to display: ")
... color2 = input("Please enter the second color you want to display: ")
... if color1 == 'red' and color2 == 'blue' or color1 == 'blue' and color2 == 'red':
...     print('Purple')
... elif color1 == 'red' and color2 == 'yellow' or color1 == 'yellow' and color2 == 'red':
...     print('Orange')
... elif color1 == 'blue' and color2 == 'yellow' or color1 == 'yellow' and color2 == 'blue':
