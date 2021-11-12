# Program Name: Capital Quiz
# Name: Ryan Siegel
# Date: 05/27/2021
# Details: This program will give a random country, the user will have to correctly quiz the capital along with the program keeping score of correct and incorrect answers.


import random # imports the random module to the script.
countryCapital = {} # declares countryCapital as a dic and makes it empty.

with open('countries_and_capitals.txt') as file: # opens the file and reads it, assigns it to the value file. The with command also auto closes the file once finished.
    for line in file: # does the below commands per line in the file.
        line = line.rstrip('\n').replace('\t', ',',  1).replace('\t', '') # removes the \n aka line breaks that were appearing at the end of each line. Also replaces one tab that is between the capital and the country with a ",". And removes any extra tabs.
        splitLine = line.split(',') # splits each line where a ',' is so that the county and capitals are sperate values.
        countryCapital[splitLine[0]] = ",".join(splitLine[1:]) # adds the split country and capital to the dic ountryCapital.

correct = 0 # assigns value as 0 to correct
incorrect = 0 # assigns value as 0 to incorrect
country = random.choice(list(countryCapital.keys()))  # grabs a random country from the dic and assigns it to country.
capital = countryCapital[country]  # grabs the capital of the randomly generated country and assigns it to capital.
answer = input("Welcome to the Capital Quiz!! Let's get started. Your country is " + country + ". What is its capital?: ") # posts country and asks user to input correct country.

while answer != 'quit': # loops until user inputs the word quit.
    if answer == capital: # executes if answer is correct
        correct += 1 # adds 1 to correct score
        print("You got it right, congrats!")
    else: # executes if answer is incorrect
        incorrect += 1 # adds 1 to incorrect score
        print("You got it wrong, sorry. The correct answer is " + capital + ".")

    country = random.choice(list(countryCapital.keys()))  # grabs a random country from the dic and assigns it to country.
    capital = countryCapital[country]  # grabs the capital of the randomly generated country and assigns it to capital.
    answer = input("Would you like to continue to play? If no, type quit. Otherwise, your country is " + country + ". What is its capital?: ") # posts country and asks user to input correct country but also gives option to exit quiz.

print("\nYour total correct answers is: " + str(correct) + ". Your total incorrect answers is: " + str(incorrect) + ". Thanks for playing!") # prints users score.