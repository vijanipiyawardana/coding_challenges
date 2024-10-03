'''
Given the names and grades for each student in a class of N students, 
store them in a nested list and print the name(s) of any student(s) having the second lowest grade.

Note: If there are multiple students with the second lowest grade, 
order their names alphabetically and print each name on a new line.
'''

if __name__ == '__main__':
    results_list = []
    scores_list = []
    names_list = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        if score not in scores_list:
            scores_list.append(score)
        results_list.append([name, score])
    scores_list.sort()
    second_lowest_score = scores_list[1]
    for result in results_list:
        if result[1] == second_lowest_score :
            names_list.append(result[0])
    
    names_list.sort()   
    for name in names_list :
        print(name)