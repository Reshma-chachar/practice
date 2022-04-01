Feature: Login functionality

Background: User will successfull open application

Given user open chrome browser with exe as "F:\\Application Suport\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe"
Given user enter url as "http://primusbank.qedgetech.com/"

Scenario: login functionality with valid username and password 
When use enter "Admin" as username 
When User enter "Admin" as password 
When user click on Login button 
 