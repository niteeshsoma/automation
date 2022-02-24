Feature: Application Login

Scenario: Home page default login

Given User is on Netbanking login
When User login into application with username "jin" and password "1234"
Then Home page is landed
And Cards are displayed
      
