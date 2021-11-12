# Program Name: English to French Translator
# Name: Ryan Siegel
# Date: 06/13/2021
# Details: This program will create a list from the file provided which includes an english word with its french translation.
#It will also list all of those items in the list, translate them, add new words, and write back the updated list to the file.


import wx

class MyGUI(wx.Panel):
    def __init__(self, parent):
        self.englishFrench = readFile()  # runs readFile and assigns the result to englishFrench
        wx.Panel.__init__(self, parent)
        #fields to create
        #buttons
        self.listLabel = wx.StaticText(self, wx.ID_ANY, 'Current Dictionary:', (10, 15))
        self.listDictionaryButton = wx.Button(self, 1, 'List Dictionary', (260, 10))
        self.translateButton = wx.Button(self, 2, 'Translate', (10, 180))
        self.updateButton = wx.Button(self, wx.ID_ANY, 'Update', (10, 180))
        self.addWordButton = wx.Button(self, wx.ID_ANY, 'Add Word', (190, 180))
        self.exitButton = wx.Button(self, wx.ID_ANY, 'Exit', (280, 180))
        #events
        self.exitButton.Bind(wx.EVT_BUTTON, self.exitApp)  # event for Exit
        self.addWordButton.Bind(wx.EVT_BUTTON, self.addWord)  # event for Add Word
        self.updateButton.Bind(wx.EVT_BUTTON, self.doUpdate)  # event for Update
        self.translateButton.Bind(wx.EVT_BUTTON, self.doTranslate)  # event for Translate
        self.listDictionaryButton.Bind(wx.EVT_BUTTON, self.listDictionary)  # event for List Dictionary
        #textfields
        self.textField = wx.TextCtrl(self, wx.ID_ANY, '', (10,40), (345,70), style = wx.TE_MULTILINE)
        self.englishTransField = wx.TextCtrl(self, wx.ID_ANY, '', (10, 140), (115, 20))
        self.frenchField = wx.TextCtrl(self, wx.ID_ANY, '', (180, 30), (115, 20))
        self.englishField = wx.TextCtrl(self, wx.ID_ANY, '', (10, 30), (115, 20))
        #labels
        self.englishTransLabel = wx.StaticText(self, wx.ID_ANY, 'English Word to Translate:', (10, 120))
        self.frenchTrans = wx.StaticText(self, wx.ID_ANY, 'French Translation:', (180, 120))
        self.frenchTransResult1 = wx.StaticText(self, wx.ID_ANY, '', (180, 135))
        self.frenchTransResult2 = wx.StaticText(self, wx.ID_ANY, '', (180, 150))
        self.frenchLabel = wx.StaticText(self, wx.ID_ANY, 'French Word to Add:', (180, 10))
        self.englishLabel = wx.StaticText(self, wx.ID_ANY, 'English Word to Add:', (10, 10))
        #start main view
        self.fieldsMain()

    def fieldsMain(self):
        #hides fields
        self.updateButton.Hide()
        self.frenchLabel.Hide()
        self.frenchField.Hide()
        self.englishLabel.Hide()
        self.englishField.Hide()
        #show fields
        self.frenchTransResult1.Show()
        self.frenchTransResult2.Show()
        self.frenchTrans.Show()
        self.englishTransLabel.Show()
        self.englishTransField.Show()
        self.listDictionaryButton.Show()
        self.listLabel.Show()
        self.textField.Show()
        self.translateButton.Show()
        self.addWordButton.Show()

    def listDictionary(self, event):
        englishFrench = self.englishFrench #brings the englishFrench list over to this method and assigns it to englishFrench
        numInList = len(englishFrench) #counts how many rows are in the list
        currentCount = 0
        for row in englishFrench: # runs through each item in the list and prints it in field1
            currentCount += 1 #adds 1 to the current row number
            row = str(row)[1:-1]
            row = row.replace("'", "")
            if row != '': #ignores empty rows in list
                if currentCount != numInList: #if not last line of list, add a new line
                    self.textField.AppendText(row + '\n')
                else: #if last line of list, don't add a new line
                    self.textField.AppendText(row)

    def doTranslate(self, event):
        englishFrench = self.englishFrench  # brings the englishFrench list over to this method and assigns it to englishFrench
        englishText = self.englishTransField.GetLineText(0).capitalize()  # Grabs the text from the englishField box and capitalizes first letter
        currentCount = 0
        self.frenchTransResult1.SetLabelText('') #clears current text in French results 1 & 2
        self.frenchTransResult2.SetLabelText('')
        for row in englishFrench: # runs through each item in the list
            if englishText in row: # compares if the word that was written is found in the list then populates the french translation in the frenchField
                row = str(row)[1:-1]
                row = row.replace("'", "").replace(englishText, "").replace(",", "")
                frenchText = row.lstrip()
                labelOne = self.frenchTransResult1.GetLabel()
                if labelOne == '': #checks if the first label is blank
                    self.frenchTransResult1.SetLabelText(frenchText)
                else:
                    self.frenchTransResult2.SetLabelText(frenchText)

    def addWord(self, event):
        #fields to show
        self.frenchLabel.Show()
        self.frenchField.Show()
        self.englishLabel.Show()
        self.englishField.Show()
        self.updateButton.Show()
        #fields to hide
        self.frenchTransResult1.Hide()
        self.frenchTransResult2.Hide()
        self.frenchTrans.Hide()
        self.englishTransLabel.Hide()
        self.englishTransField.Hide()
        self.listDictionaryButton.Hide()
        self.listLabel.Hide()
        self.textField.Hide()
        self.translateButton.Hide()
        self.addWordButton.Hide()

    def doUpdate(self, event):
        englishWord = self.englishField.GetValue().capitalize() #grabs value in english textbox
        frenchWord = self.frenchField.GetValue() #grabs value in french textbox
        englishFrench = self.englishFrench #brings the englishFrench list over to this method and assigns it to englishFrench
        englishFrench.append([englishWord, frenchWord])  # adds each line to the list as a 2D list.
        numInList = len(englishFrench) #counts how many items are in the list
        currentCount = 0
        #writes updated list to file
        with open('english_to_french.txt', "w") as file:
            for item in englishFrench:
                currentCount += 1  # adds 1 to the current row number
                item = str(item)[1:-1]
                item = item.replace("'", "")
                if currentCount != numInList:
                    file.write(str(item + "\n"))
                else:
                    file.write(str(item))
        #clears values in fields
        self.textField.SetValue('')
        self.englishTransField.SetValue('')
        self.frenchTransResult1.SetLabelText('')
        self.frenchTransResult2.SetLabelText('')
        #starts main menu again
        self.fieldsMain()

    def exitApp(self, event):
        englishWord = self.englishField.GetValue().capitalize()  # grabs value in english textbox
        frenchWord = self.frenchField.GetValue()  # grabs value in french textbox
        englishFrench = self.englishFrench  # brings the englishFrench list over to this method and assigns it to englishFrench
        englishFrench.append([englishWord, frenchWord])  # adds each line to the list as a 2D list.
        numInList = len(englishFrench)  # counts how many items are in the list
        currentCount = 0
        # writes updated list to file
        with open('english_to_french.txt', "w") as file:
            for item in englishFrench:
                currentCount += 1  # adds 1 to the current row number
                item = str(item)[1:-1]
                item = item.replace("'", "")
                if currentCount != numInList:
                    file.write(str(item + "\n"))
                else:
                    file.write(str(item))
        exit()


def readFile():
    englishFrench = [] #define englishFrench as a list
    with open('english_to_french.txt') as file: # opens the file and reads it, assigns it to the value file. The with command also auto closes the file once finished.
        for line in file: # does the below commands per line in the file.
            if line != "\n": #if line is empty, skips over that line
                line = line.rstrip('\n').replace('\t', ',',  1).replace('\t', '') # removes the \n aka line breaks that were appearing at the end of each line. Also replaces one tab that is between the capital and the country with a ",". And removes any extra tabs.
                splitLine1 = line.split(',') # splits each line where a ',' is so that the county and capitals are sperate values.
                englishFrench.append(splitLine1) #adds each line to the list as a 2D list.
    return englishFrench

def main():
    #starts the app
    app = wx.App(False)
    frame = wx.Frame(None)
    panel = MyGUI(frame)
    frame.Show()
    app.MainLoop()

main()