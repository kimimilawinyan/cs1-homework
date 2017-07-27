------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------
/**
 * Homework 6
 * Checkbook Register
 * Celeste Kimimila & Megan Niemitalo
 * version 3 - This can now open a checkbook, and add to it, as well as print a check. 
 * The known error through testing, and running the program is that it will only print one previously
 * existing check when you select option 2. The loops is broken.
 */

PROJECT TITLE: Checkbook Register
PURPOSE OF PROJECT: To have a checkbook that holds 10 checks, can be appended, and have the checks reprinted. 
This does not hold the running total, but it can.
VERSION or DATE: 1
HOW TO START THIS PROJECT: void main(String[]args) Main.main({})
AUTHORS: Celeste Kimimila
USER INSTRUCTIONS:

You have to either create or open your checkbook before you can quit the program.

case 1 allows for creation.
case 2 will open the checkreg.txt checkbook that’s been serialized previously.
case 3 will write a check to the checkreg.txt file
case 4 will print all the checks in your open checkbook, if the checkbook is not opened, or
has not been created..you will be prompted to create a checkbook.

case 5 will quit the program, only once a checkbook has been opened.

UNIT TESTING
The testing is for:
-check if get.Amt method is passing check amount value
-get.Amt is passing check amount value with a negative test
-testCheckListSize method correctly accounts for the number of check objects
    in checkbook


