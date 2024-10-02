'''
HackerRank - Project Euler #1: Multiples of 3 and 5

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below N.

Input Format: 
    First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.
'''

#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    t = int(input().strip())

    t_max = int(math.pow(10, 5))
    n_max = int(math.pow(10, 9))
    
    if 1 <= t <= t_max :
        for t_itr in range(t):
            n = int(input().strip())
            if 1 <= n <= n_max :
                # number of multiples of 3, 5, and 15 below n
                m_3 = (n - 1) // 3
                m_5 = (n - 1) // 5
                m_15 = (n - 1) // 15
                # sum of each multiples of 3, 5, and 15 
                sum_3 = 3 * m_3 * (m_3 + 1) // 2
                sum_5 = 5 * m_5 * (m_5 + 1) // 2
                sum_15 = 15 * m_15 * (m_15 + 1) // 2
                
                total_sum = sum_3 + sum_5 - sum_15
            print(total_sum)


    ## previous attempts, more run time    
    '''
    if 1 <= t <= t_max :
        for t_itr in range(t):
            n = int(input().strip())
            if 1 <= n <= n_max :
                sum = 0
                for i in range (n) :
                    if i % 3 == 0 or i % 5 == 0 :
                        sum += i
                print(sum)
    '''
    '''     
    if 1 <= t <= t_max :
        for t_itr in range(t):
            n = int(input().strip())
            if 1 <= n <= n_max :
                sum = 0
                for i in range (3, n, 3) :
                        sum += i
                for j in range (5, n, 5) :
                    if j%3 != 0:
                        sum += j
                print(sum)
    '''

