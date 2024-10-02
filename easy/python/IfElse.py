'''
HackerRank problem

Task: Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird

Input Format: A single line containing a positive integer, n.

Constraints: 1 <= n <= 100

Output Format: Print Weird if the number is weird. Otherwise, print Not Weird.

https://www.hackerrank.com/challenges/py-if-else/problem?isFullScreen=true
'''

#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input().strip())
    if 1 <= n <= 100 :
        if n%2 == 1 :
            print("Weird")
        else :
            if 2 <= n <= 5 :
                print("Not Weird")
            elif  6 <= n <= 20 :
                print("Weird")
            elif n > 20 :
                print("Not Weird")
                