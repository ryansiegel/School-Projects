import pymysql

def createDB():
    connection = pymysql.connect(user='USERNAME', password='PASSWORD')  # open connection to mysql
    cursor = connection.cursor()
    try: #creates the bookstore database in mysql
        cursor.execute('CREATE DATABASE bookstore')
    except:
        connection.rollback()
        print('Failed to create db')
    connection.close() #closes connection

def createTables(connection, cursor):
    try: #creates table customers and adds columns
        cursor.execute("CREATE TABLE customers ( INT PRIMARY KEY AUTO_INCREMENT, name TEXT NOT NULL, address TEXT NOT NULL, age INT NOT NULL, income DECIMAL(65,2) NOT NULL, loginid TEXT NOT NULL, password TEXT NOT NULL)")
        connection.commit()
    except:
        connection.rollback()
        print('Failed to create table customers')

    try: #creates table books and adds columns
        cursor.execute("CREATE TABLE books (isbn BIGINT PRIMARY KEY, title TEXT NOT NULL, author TEXT NOT NULL, qtyinstock INT NOT NULL, price DECIMAL(65,2) NOT NULL, cost DECIMAL(65,2) NOT NULL, year INT NOT NULL, publisherid INT NOT NULL)")
        connection.commit()
    except:
        connection.rollback()
        print('Failed to create table books')

    try: #creates table publishers and adds columns
        cursor.execute("CREATE TABLE publishers (publisherid INT PRIMARY KEY AUTO_INCREMENT, name TEXT NOT NULL, address TEXT NOT NULL, discount INT NOT NULL)")
        connection.commit()
    except:
        connection.rollback()
        print('Failed to create table publishers')

    try: #creates table orders and adds columns
        cursor.execute("CREATE TABLE custumerorders (custid INT PRIMARY KEY, cardnum BIGINT NOT NULL, cardmonth INT NOT NULL, cardyear INT NOT NULL, orderdate TEXT NOT NULL, shipdate TEXT NOT NULL)")
        connection.commit()
    except:
        connection.rollback()
        print('Failed to create table orders')

    try: #creates table orderlist and adds columns
        cursor.execute("CREATE TABLE orderlist (ordernum INT PRIMARY KEY, isbn BIGINT NOT NULL, quantity INT NOT NULL)")
        connection.commit()
    except:
        connection.rollback()
        print('Failed to create table orderlist')

    try: #creates table stockresupply and adds columns
        cursor.execute("CREATE TABLE stockresupply (isbn BIGINT PRIMARY KEY, quantity INT NOT NULL)")
        connection.commit()
    except:
        connection.rollback()
        print('Failed to create table stockresupply')
    return

def inputInfo (connection, cursor):
    rowItems = []
    #inserts data for customers
    with open('customerslist.txt') as file:
        for line in file:
            line = line.replace("', ", "',")
            rowItems = line.split("\'")
            for item in rowItems:
                if item == ",":
                    rowItems.remove(item)
            rowItems = list(filter(None, rowItems))
            insertIntoTable = "INSERT INTO customers (custid, name, address, age, income, loginid, password) VALUES (" + rowItems[0] + ", '" + rowItems[1] + "', '" + rowItems[2] + "', " + rowItems[3] + ", " + rowItems[4] + ", '" + rowItems[5] + "', '" + rowItems[6] + "')"
            try:
                cursor.execute(insertIntoTable)
                connection.commit()
            except:
                connection.rollback()
                print('Failed to insert data into customers')

    rowItems = []
    # inserts data for publishers
    with open('publisherslist.txt') as file:
        for line in file:
            line = line.replace("', ", "',")
            rowItems = line.split("\'")
            for item in rowItems:
                if item == ",":
                    rowItems.remove(item)
            rowItems = list(filter(None, rowItems))
            insertIntoTable = "INSERT INTO publishers (publisherid, name, address, discount) VALUES (" + rowItems[
                0] + ", '" + rowItems[1] + "', '" + rowItems[2] + "', " + rowItems[3] + ")"
            try:
                cursor.execute(insertIntoTable)
                connection.commit()
            except:
                connection.rollback()
                print('Failed to insert data into publishers')

    rowItems = []
    # inserts data for books
    with open('bookslist.txt') as file:
        for line in file:
            line = line.replace("', ", "',")
            rowItems = line.split("\'")
            for item in rowItems:
                if item == ",":
                    rowItems.remove(item)
            rowItems = list(filter(None, rowItems))
            insertIntoTable = "INSERT INTO books (isbn, title, author, qtyinstock, price, cost, year, publisherid) VALUES (" + rowItems[0] + " ,'" + rowItems[1] + "', '" + rowItems[2] + "', " + rowItems[3] + ", " + rowItems[4] + ", " + rowItems[5] + ", " + rowItems[6] + ", " + rowItems[7] + ")"
            try:
                cursor.execute(insertIntoTable)
                connection.commit()
            except:
                connection.rollback()
                print('Failed to insert data into books')

    rowItems = []
    # inserts data for books
    with open('orders.txt') as file:
        for line in file:
            line = line.replace("', ", "',")
            rowItems = line.split("\'")
            for item in rowItems:
                if item == ",":
                    rowItems.remove(item)
            rowItems = list(filter(None, rowItems))
            insertIntoTable = "INSERT INTO custumerorders (custid, cardnum, cardmonth, cardyear, orderdate, shipdate) VALUES (" + rowItems[0] + " ," + rowItems[1] + ", " + rowItems[2] + ", " + rowItems[3] + ", '" + rowItems[4] + "', '" + rowItems[5] + "')"
            try:
                cursor.execute(insertIntoTable)
                connection.commit()
            except:
                connection.rollback()
                print('Failed to insert data into orders')

    rowItems = []
    # inserts data for books
    with open('orderlist.txt') as file:
        for line in file:
            line = line.replace("', ", "',")
            rowItems = line.split("\'")
            for item in rowItems:
                if item == ",":
                    rowItems.remove(item)
            rowItems = list(filter(None, rowItems))
            insertIntoTable = "INSERT INTO orderlist (ordernum, isbn, quantity) VALUES (" + rowItems[0] + " ," + rowItems[1] + ", " + rowItems[2] + ")"
            try:
                cursor.execute(insertIntoTable)
                connection.commit()
            except:
                connection.rollback()
                print('Failed to insert data into orderlist')

    rowItems = []
    # inserts data for books
    with open('stockresupply.txt') as file:
        for line in file:
            line = line.replace("', ", "',")
            rowItems = line.split("\'")
            for item in rowItems:
                if item == ",":
                    rowItems.remove(item)
            rowItems = list(filter(None, rowItems))
            insertIntoTable = "INSERT INTO stockresupply (isbn, quantity) VALUES (" + rowItems[0] + " ," + rowItems[1] + ")"
            try:
                cursor.execute(insertIntoTable)
                connection.commit()
            except:
                connection.rollback()
                print('Failed to insert data into stockresupply')

#create db including db, tables, and info
createDB()
connection = pymysql.connect(user='USERNAME', password='PASSWORD', db='DATABASE') #reconnects so it can connect to the db
cursor = connection.cursor()
createTables(connection, cursor)
inputInfo(connection, cursor)

inputAnswer = int(input('Welcome to the Bookstore Database! What would you like to search, please enter a number from the options below.\n1. Book\n2. Customer\n3. Publisher\n4. Orders\n5. Order List\n6. Stock Resupply\nENTER CHOICE HERE: '))
#loops through question
while inputAnswer != 7:
    errorCode = 0
    if inputAnswer == 1: #if book was chosen
        searchInput = input('What is the ISBN number of the book?\t\tENTER NUMBER HERE: ')
        try:
            cursor.execute('SELECT * FROM books')
            data = cursor.fetchall()
            for row in data: #searches through rows and find searched for item
                row = str(row)
                rowItems = []
                rowItems = row.split(",")
                rowItems[0] = rowItems[0].replace("(", "")
                if searchInput == rowItems[0]:
                    print('RESULTS -- ISBN Number: ' + rowItems[0] + '\t\tTitle:' + rowItems[1].replace("'", "") + '\t\tAuthor:' + rowItems[2].replace("'", "") + '\t\tQty In Stock:' + rowItems[3] + '\t\tPrice: $' + rowItems[4].replace(" Decimal('", "").replace("')", "") + '\t\tCost: $' + rowItems[5].replace(" Decimal('", "").replace("')", "") + '\t\tYear:' + rowItems[6] + '\t\tPublisher ID:' + rowItems[7].replace(")", ""))
                    print('')
                    errorCode += 1
            if errorCode != 1:
                print('No ISBN number found.')
                print('')
        except:
            connection.rollback()
            print('Failed to collect data from books')
    elif inputAnswer == 2: #if customer was chosen
        searchInput = input('What is the customer ID?\t\tENTER NUMBER HERE: ')
        try:
            cursor.execute('SELECT * FROM customers')
            data = cursor.fetchall()
            for row in data:  # searches through rows and find searched for item
                row = str(row)
                rowItems = []
                rowItems = row.split(",")
                rowItems[0] = rowItems[0].replace("(", "")
                if searchInput == rowItems[0]:
                    print('RESULTS -- Customer ID: ' + rowItems[0] + '\t\tName:' + rowItems[1].replace("'", "") + '\t\tAddress:' + rowItems[2].replace("'", "") + ',' + rowItems[3] + ',' + rowItems[4].replace("'", "") + '\t\tAge:' + rowItems[5] + '\t\tIncome: $' + rowItems[6].replace(" Decimal('", "").replace("')", "") + '\t\tLogin ID:' + rowItems[7].replace("'", "") + '\t\tPassword:' + rowItems[8].replace(")", "").replace("'", ""))
                    print('')
                    errorCode += 1
            if errorCode != 1:
                print('No customer id found.')
                print('')
        except:
            connection.rollback()
            print('Failed to collect data from customers')
    elif inputAnswer == 3: #if publisher was chosen
        searchInput = input('What is the publisher ID?\nENTER NUMBER HERE: ')
        try:
            cursor.execute('SELECT * FROM publishers')
            data = cursor.fetchall()
            for row in data:  # searches through rows and find searched for item
                row = str(row)
                rowItems = []
                rowItems = row.split(",")
                rowItems[0] = rowItems[0].replace("(", "")
                if searchInput == rowItems[0]:
                    print('RESULTS -- Publisher ID: ' + rowItems[0] + '\t\tName:' + rowItems[1].replace("'", "") + '\t\tAddress:' + rowItems[2].replace("'", "") + ',' + rowItems[3] + ',' + rowItems[4] + ',' + rowItems[5].replace("'", "") + '\t\tDiscount:' + rowItems[6].replace(")", "").replace("'", ""))
                    print('')
                    errorCode += 1
            if errorCode != 1:
                print('No publisher id found.')
                print('')
        except:
            connection.rollback()
            print('Failed to collect data from customers')
    elif inputAnswer == 4:
        try: #if orders was chosen
            cursor.execute('SELECT * FROM custumerorders')
            data = cursor.fetchall()
            print('RESULTS --')
            for row in data: #searches through rows and find searched for item
                row = str(row)
                rowItems = []
                rowItems = row.split(",")
                rowItems[0] = rowItems[0].replace("(", "")
                print('Customer ID: ' + rowItems[0] + '\t\tCard Number:' + rowItems[1] + '\t\tCard Month:' + rowItems[2] + '\t\tCard Year:' + rowItems[3] + '\t\tOrder Date: ' + rowItems[4] + '\t\tShip Date: ' + rowItems[5].replace(")",""))
            print('')
        except:
            connection.rollback()
            print('Failed to collect data from orders')
    elif inputAnswer == 5:
        try: #if orderlist was chosen
            cursor.execute('SELECT * FROM orderlist')
            data = cursor.fetchall()
            print('RESULTS --')
            for row in data:  # searches through rows and find searched for item
                row = str(row)
                rowItems = []
                rowItems = row.split(",")
                rowItems[0] = rowItems[0].replace("(", "")
                print('Order Number: ' + rowItems[0] + '\t\tISBN Number:' + rowItems[1] + '\t\tQuantity:' + rowItems[2].replace(")", ""))
            print('')
        except:
            connection.rollback()
            print('Failed to collect data from orders')
    elif inputAnswer == 6:
        try: #if stock resupply was chosen
            cursor.execute('SELECT * FROM stockresupply')
            data = cursor.fetchall()
            print('RESULTS --')
            for row in data:  # searches through rows and find searched for item
                row = str(row)
                rowItems = []
                rowItems = row.split(",")
                rowItems[0] = rowItems[0].replace("(", "")
                print('ISBN Number: ' + rowItems[0] + '\t\tQuantity:' + rowItems[1].replace(")", ""))
            print('')
        except:
            connection.rollback()
            print('Failed to collect data from orders')
    else:
        print('That is not a vaild option')
        print('')
    inputAnswer = int(input('What would you like to search, please enter a number from the options below.\n1. Book\n2. Customer\n3. Publisher\n4. Orders\n5. Order List\n6. Stock Resupply\n7. Quit Program\nENTER CHOICE HERE: '))


connection.close() #closes connection