#@Executive_log_in_page
#Feature: Validate executive log in page functionality
#
#
  #@Regression
  #Scenario: Validate that elements are present in executive log in page
    #Given Verify that user is on the log in as executive page as expected page title "Shield"
    #Then Verify that title text Signin to Your Account is displayed in executive log in page
    #Then verify that subtitle Signin to manage, your bussiness is displayed in executive log in page
    #Then Verify that email field title Email is displayed in executive log in page
    #Then Verify that email place holder value should be "Enter your email address" in executive log in page
    #Then Verify that email user field be clickable in executive log in page
    #Then Verify that password field title Password should displayed in executive log in page
    #Then Verify that password placeholder value should be "Enter your password" in executive log in page
    #Then Verify that password user field be clickable in executive log in page
    #Then Verify that sign in button should be displayed in executive log in page
    #Then Verify that sign in button should be clickable in executive log in page
    #Then Verify that forget password link should be displayed in executive log in page
    #Then Verify that forget password link should be clickable in executive log in page
    #Then Verify that logo of shield should be displayed in executive log in page
    #Then Verify that title text sign in to your account is displayed in executive log in page
    #Then Verify that subtitle Signin to Your Account should be displayed in executive log in page
#
  #@Regression
  #Scenario: Validate that email user field in executive log in page
    #Given Verify that user is on the executive log in page as expected page title is "Shield"
    #When executive user enter only valid email and try to sign in into app "ashish.upadhyay@iffort.com" in executive log in page
    #Then Verify that executive user should get the expected green tick in email user field in executive log in page
    #When executive user enter only valid email and try to sign in into application "kd@iffort.co.uk" in executive log in page
    #Then Verify that executive user should get the expected green tick in email user field in executive log in page
    #When executive user enter only valid email and try to sign in into application "info@iffort.ifff.com" in executive log in page
    #Then Verify that executive user should get the expected green tick in email user field in executive log in page
    #When executive user enter only valid email and try to sign in into application "ashish-upadhyay@iffort.com" in executive log in page
    #Then Verify that executive user should get the expected green tick in email user field in executive log in page
    #When executive user enter only valid email and try to sign in into application "ashish+upadhyay@iffort.com" in executive log in page
    #Then Verify that executive user should get the expected green tick in email user field in executive log in page
    #When executive user enter only invalid space email and try to sign in into aplication "  abcdefg@co.in  " in executive log in page
    #Then Verify that executive user should get the expected green tick in email user field in executive log in page
    #When executive user enter only invalid space email and try to sign in into aplication "abcdefg@co.in         " in executive log in page
    #Then Verify that executive user should get the expected green tick in email user field in executive log in page
    #When executive user enter only invalid space email and try to sign in into aplication "          abcdefg@co.in" in executive log in page
    #Then Verify that executive user should get the expected green tick in email user field in executive log in page
    #When executive user enter 190 characters into the email user field and try to sign in into the application
    #Then Verify that executive user should get the expected green tick in email user field in executive log in page
    #When executive user enter 100 characters into the email user field and try to sign in into the application
    #Then Verify that executive user should get the expected green tick in email user field in executive log in page
    #When executive user enter 50 characters into the email user field and try to sign in into the application
    #Then Verify that executive user should get the expected green tick in email user field in executive log in page
    #When executive user enter only invalid email and try to sign in into aplication "abcdefg" in executive log in page
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter only invalid email and try to sign in into aplication "abcdefg@" in executive log in page
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter only invalid email and try to sign in into aplication "abcdefg.co.in" in executive log in page
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter only invalid email and try to sign in into aplication "abcdefg@co.123" in executive log in page
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter only invalid email and try to sign in into aplication "abcdefg@co" in executive log in page
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter only invalid email and try to sign in into aplication "abcdefg@@@co" in executive log in page
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter only invalid email and try to sign in into aplication "@example.com" in executive log in page
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter only invalid email and try to sign in into aplication "abcsdf@.com" in executive log in page
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter only invalid email and try to sign in into aplication "abcsd f@co.com" in executive log in page
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter only invalid email and try to sign in into aplication "Kabc.f@co.com" in executive log in page
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter only invalid email and try to sign in into aplication "!#$%$#e@example.com" in executive log in page
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter only invalid email and try to sign in into aplication "!#$%$#e@&^%$.com" in executive log in page
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter only invalid email and try to sign in into aplication "!#$%$#e@^%$#.&%^" in executive log in page
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
#
#
#
  #@Regression
  #Scenario: Validate password user field in executive log in page
    #Given Verify that user is on the executive log in page as expected page title is "Shield"
    #When executive user enter only valid password and try to sign in into appli "execuTive@123" in executive log in page
    #Then verify that executive user should get the expected green tick in password user field in executive log in page
    #When executive user enter only valid password and try to sign in into app "Executive@123" in executive log in page
    #Then verify that executive user should get the expected green tick in password user field in executive log in page
    #When executive user enter only valid password and try to sign in into app "exEcutive-@123" in executive log in page
    #Then verify that executive user should get the expected green tick in password user field in executive log in page
    #When executive user enter only valid password and try to sign in into app "R@executive-123" in executive log in page
    #Then verify that executive user should get the expected green tick in password user field in executive log in page
    #When executive user enter only valid password and try to sign in into app "1@executIve-123" in executive log in page
    #Then verify that executive user should get the expected green tick in password user field in executive log in page
    #When executive user enter only valid password and try to sign in into app "**Executive-123" in executive log in page
    #Then verify that executive user should get the expected green tick in password user field in executive log in page
    #When executive user enter only valid password and try to sign in into app "**Executive$123" in executive log in page
    #Then verify that executive user should get the expected green tick in password user field in executive log in page
    #When executive user enter only valid password and try to sign in into app "**amiN$/*98" in executive log in page
    #Then verify that executive user should get the expected green tick in password user field in executive log in page
    #When executive user enter only valid password and try to sign in into app "**a::iN$/*98" in executive log in page
    #Then verify that executive user should get the expected green tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "AD@@%%^^&&in@@112233" in executive log in page
    #Then verify that executive user should get the expected green tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "Av$1234567" in executive log in page
    #Then verify that executive user should get the expected green tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "AD@@%%^^&&in@@112233" in executive log in page
    #Then verify that executive user should get the expected green tick in password user field in executive log in page
    #When executive user enter only valid password and try to sign in into app "executive @123" in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only valid password and try to sign in into app "     " in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only valid password and try to sign in into app "abcd" in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only valid password and try to sign in into app "ABCD" in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "1234567890" in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "qwertyuiop" in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "$%^&$%$%#^^$$" in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "@#$%^&*" in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "ASDFGFDSAS" in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "123456qwere" in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "#$$%ASDSAS" in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "asdfghQWERRT" in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "12345@#$%^%$" in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "123" in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter only invalid value into the password user field "               " in executive log in page
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
#
  #@Regression
  #Scenario: Validate that sign in button functionality in executive user log in page
    #Given Verify that user is on the executive log in page as expected page title is "Shield"
    #Invalid email and invalid password
    #When executive user enter invalid email "abcdefghijk" and invalid password "123" into the userfields and click on sign in into appli
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter invalid email "123456789" and invalid password "123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter invalid email "QWERTYUNHJ" and invalid password "123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter invalid email "!@#$%%^" and invalid password "123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #Invalid email and valid password
    #When executive user enter invalid email "abcdefg@" and valid password "executive@123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter invalid email "abcdefg.co.in" and valid password "executive@123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter invalid email "abcdefg@co.123" and valid password "executive@123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter invalid email "abcdefg@co" and valid password "executive@123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter invalid email "abcdefg@@@co" and valid password "executive@123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter invalid email "@example.com" and valid password "executive@123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter invalid email "abcsdf@.com" and valid password "executive@123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter invalid email "abcsd f@co.com" and valid password "executive@123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #both valid but not exists!
    #When executive user enter invalid email "executive.d@co.in" and valid password "Executive@123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter invalid email "executive.d@co.in" and valid password "Pdmin@+123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #When executive user enter invalid email "adexecutive.dc@co.in" and valid password "Pdmin@+123" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected red tick in email user field in executive log in page
    #valid email invalid password
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "dmin@p123" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "Qmin$$$12345" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected note contaiing invalid credentials is displayed
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "**a::iN$/*98" into the userfields and click on sign in into applicaion
    #Then Verify that executive user should get the expected note contaiing invalid credentials is displayed
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "abcd" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "ABCD" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "ASDFGFDSAS" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "1234567890" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "qwertyuiop" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "$%^&$%$%#^^$$" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "@#$%^&*" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "ASDFGFDSAS" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "123456qwere" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "#$$%ASDSAS" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "asdfghQWERRT" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "12345@#$%^%$" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "123" into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
    #When executive user enter valid email "ashish.upadhyay@iffort.com" and invalid password "               " into the userfields and click on sign in into applicaion
    #Then verify that executive user should get the expected red tick in password user field in executive log in page
#
  #@Regression
  #Scenario: Validate that executive log in user should be able to log in into the application with valid credentials
    #Given Verify that user is on the executive log in page as expected page title is "Shield"
    #When Verify that after executive enter the valid executive credentials into the email user field in executive log in page
    #When Verify that after executive enter the valid executive credentials into the password user field in executive log in page
    #Then Verify that after entering the valid executive credentials into the email and password user is able to click on the sign in button
    #Then Verify that user is log in executive successfully with the expected page tilte "Shield"
#
  #@Regression
  #Scenario: Validate that partner executive should not be able to log in into the application with valid credentials through the executive log in page
    #Given Verify that user is on the executive log in page as expected page title is "Shield"
    #When partner executive enter valid email and valid password into the userfields and click on sign in into applicaion for executive log in page
    #Then verify that user should get the expected you are not allowed to access executive area in executive log in page
#
  #@Regression
  #Scenario: Validate that email user field cross options work as expected in executive log in page
  #Given Verify that user is on the executive log in page as expected page title is "Shield"
  #Then Verify that user is on the super_executive log in page and check email user field is empty
  #When executive user enter only valid email and try to sign in into app "XYZ" in executive log in page
  #Then Verify that executive user should get the expected red tick in email user field in executive log in page
  #@Regression
  #Scenario: Validate that password user field cross options work as expected in executive log in page
  #Given Verify that user is on the executive log in page as expected page title is "Shield"
  #Then Verify that user is on the executive log in page and check password user field is empty in executive log in page
  #When executive user enter only valid password and try to sign in into app "XY11111Z" in executive log in page
  #Then verify that executive user should get the expected red tick in password user field in executive log in page
 #
  #@Regression
  #Scenario: Validate that password eye button in executive log in page
    #Given Verify that user is on the executive log in page as expected page title is "Shield"
    #Then Verify that executive user get the eye button in the password userfield in executive log in page
