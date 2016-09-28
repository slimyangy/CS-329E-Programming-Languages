'''
Class: Tab
Purpose: Tab has a method that can compute the tab amount for each person included tax
'''
class Tab(object):

    def __init__(self):
        self.amount = 0
        self.tipRate = 0.15
        self.numOfPeople = 0

    '''
    Method: tipCalc
    Arguments: takes two functions (func -> evaluate tips, func2 -> divides tab)
    Purpose: Divides the tab equally to a certain number of people including tip
    '''

    def tipCalc(self, func1, func2):

        '''
        Function: wrapper
        Arguments: takes three number parameters (amount of tab, tip rate, number of people)
        Purpose: Distribute arguments to specific functions and store the arguments in the object
        '''
        def wrapper(x, y, z):
            self.amount = x
            self.tipRate = y
            self.numOfPeople = z
            return func2(func1(self.amount, self.tipRate) + self.amount, self.numOfPeople)
        return wrapper

'''
Function: tip
Arguments: takes two float numbers (amount of tab, tip rate)
Purpose: Multiply tab amount with the rate
'''
def tip(amount, tipRate): return amount * tipRate

'''
Function: divTab
Arguments: takes one float number and one integer (amount of tab, number of people)
Purpose: Divide tab equally among a certain number of people
'''
def divTab(amount, numOfPeople): return amount / numOfPeople

# tipCalc(tip, divTab)(100, 0.10, 6) # First 2 params are for tipCalc and the last 3 params are for wrapper

#print Tab().tipCalc(tip, divTab)(100, 0.15, 6)

#(exec "import Aristotle; toReturn = Aristotle.Tab().tipCalc(Aristotle.tip, Aristotle.divTab)(100, 0.15, 6)")
