# contApp
Basic contability evidence app
Website for primary accounting 

Brief description of the system:
The goal is to create a website that allows users to see their firms balance (entries from & payments to suppliers) – optional income/payment balance from sales.

Main functions of the system:
User registration and login
Creating firm(admin)  
Registering invoices (admin)- Supplier name, invoice nr, invoice value, scadency – data, Comments
Getting automatic messages for invoices with exceeded scadency terms after firm selected

Possibility of searching for:  - invoices by supplier; (paid and not paid)
                                                  -Invoices with exceeded scadency terms;
                                                   - Invoices not paid yet;
                                                  - total payments per custom period;

Roles
User:                                        - invoices by supplier; (paid and not paid)
                                                  -invoices with exceeded scadency terms;
                                                   - Invoices not paid yet;
                                                  - total payments per custom period;

Admin:  - User+ CRUD firms

                                                   

General guidelines
Website dev using Spring, JPA, Thymeleaf, Spring security

Functionality:
Home page:
-Log in, Sign up (“..... number of users are using this program for ….. number of firms”)
User registration: 
-login(email) – check correct email
-passw- 8-30 char;
-display name – no whitespace, max 20 chars;
-a given email should register just once;
Roles: admin  - can add, delete, update;
????? role user?????  Only add;

User login:
After logging in the user should be redirected to a page where he can see the firms he is allowed and his role; 
Display: logged in as: “  “

Adding
Adding firm : name, id, invoice scadence
Adding invoice: invoice nr, 
entry nr(id), 
value, 
Boolean isPaid;
 type of payment(bank or cash), 
payment nr
payment date;
adding should also display user and time of modifications
events sorted from nearest to most distant

Event search engine
-	events by user;
-	entries by supplier




