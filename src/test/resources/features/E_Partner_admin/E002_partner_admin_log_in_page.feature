#@Partner_log_in_page
#Feature: Validate partner log in and otp page
#
  #@Smoke
  #Scenario: Validate that elements are present in the partner log in page
    #Given Verify that user is on the partner log in page as expected page title is "Shield"
 #		Then Verify that sign in to your account title text should be displayed in partner log in page
 #		Then Verify that sign in to manage your business text should be displayed in partner log in page
 #		Then Verify that left side shield title text should be displayed in partner log in page
 #		Then Verify that left side shield logo should be displayed in partner log in page
 #		Then Verify that left side sign in to your account text should be displayed in partner log in page
 #		Then Verify that left side sign in to manage your business text should be displayed in partner log in page
 #		Then Verify that sign in using email button should be displayed in partner log in page
 #		Then Verify that sign in using email button should be clickable in partner log in page
 #		Then Verify that sign in using email button should be able mouse hover in partner log in page
 #		Then Verify that sign in using email selected having email title text should be displayed in partner log in page
 #		Then Verify that sign in using email selected having email asterisk should be displayed in partner log in page
 #		Then Verify that sign in using email selected having email userfield should be displayed in partner log in page
 #		Then Verify that sign in using email selected having email userfield should be clickable in partner log in page
 #		Then Verify that sign in using email selected having email userfield placeholder value should be "Enter your email address" in partner log in page
 #		Then Verify that sign in using email selected having get otp button should be displayed in partner log in page
 #		Then Verify that sign in using email selected having get otp button should be clickable in partner log in page
 #		Then Verify that sign in using email selected having get otp button should be able mouse hover in partner log in page
 #		Then Verify that sign in using mobile button should be displayed in partner log in page
 #		Then Verify that sign in using mobile button should be clickable in partner log in page
 #		Then Verify that sign in using mobile button should be able mouse hover in partner log in page
 #		Then Verify that sign in using mobile selected having mobile number title text should be displayed in partner log in page
 #		Then Verify that sign in using mobile selected having mobile number asterisk should be displayed in partner log in page
 #		Then Verify that sign in using mobile dropdown should be displayed in partner log in page
 #		Then Verify that sign in using mobile dropdown user field should be clickable in partner log in page
 #		Then Verify that sign in using mobile dropdown list should be clickable in partner log in page
 #		Then Verify that sign in using mobile selected having mobile number userfield should be displayed in partner log in page
 #		Then Verify that sign in using mobile selected having mobile number userfield should be clickable in partner log in page
 #		Then Verify that sign in using mobile selected having mobile number userfield placeholder value should be "Enter your mobile number" in partner log in page
 #		Then Verify that sign in using mobile selected having get otp button should be displayed in partner log in page
 #		Then Verify that sign in using mobile selected having get otp button should be clickable in partner log in page
 #		Then Verify that sign in using mobile selected having get otp button should be able mouse hover in partner log in page
 #		
 #	@Smoke
  #Scenario: Validate that working of an email userfield from partner log in page
    #Given Verify that user is on the partner log in page as expected page title is "Shield"
 #		#Valid
 #		When user enter the credential into the email user field "kd@iffort.co.uk" and click on the get otp button
 #		Then Verify that user should get the green tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "info@iffort.ifff.com" and click on the get otp button
 #		Then Verify that user should get the green tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "ashish-upadhyay@iffort.com" and click on the get otp button
 #		Then Verify that user should get the green tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "ashish+upadhyay@iffort.com" and click on the get otp button
 #		Then Verify that user should get the green tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field 255 char and click on the get otp button
 #		Then Verify that user should get the green tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field 200 char and click on the get otp button
 #		Then Verify that user should get the green tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field 100 char and click on the get otp button
 #		Then Verify that user should get the green tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field 50 char and click on the get otp button
 #		Then Verify that user should get the green tick in the email user field from the partner log in page
 #		
 #		#Invalid
 #		When user enter the credential into the email user field "123456" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "abcdefg@" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "abcdefg.co.in" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "abcdefg@co.123" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "abcdefg@co" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "abcdefg@@@co" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "@example.com" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "abcsdf@.com" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "abcsd f@co.com" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "kis.de😀@gmial.com" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "Kabc.f@co.com" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "  abcdefg@co.in  " and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "abcdefg@co.in         " and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "          abcdefg@co.in" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "hello@example.みんな" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "!#$%$#e@example.com" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "!#$%$#e@&^%$.com" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field "!#$%$#e@^%$#.&%^" and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		When user enter the credential into the email user field 255 plus char and click on the get otp button
 #		Then Verify that user should get the red tick in the email user field from the partner log in page
 #		
 #		
 #		
 #		
 #		
 #	 	@Smoke
  #Scenario: Validate that working of an mobile number userfield from partner log in page
    #Given Verify that user is on the partner log in page as expected page title is "Shield"
 #		#Valid
 #		When user enter the mobile number into the mobile number user field "1234567890" and click on the get otp button
 #		Then Verify that user should get the green tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "9876543210" and click on the get otp button
 #		Then Verify that user should get the green tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "666666333" and click on the get otp button
 #		Then Verify that user should get the green tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "15551234567" and click on the get otp button
 #		Then Verify that user should get the green tick in the mobile number user field from the partner log in page
 #		
 #		
 #		#Invalid
 #		When user enter the mobile number into the mobile number user field " " and click on the get otp button
 #		Then Verify that user should get the red tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "123" and click on the get otp button
 #		Then Verify that user should get the red tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "012345678901234" and click on the get otp button
 #		Then Verify that user should get the red tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "abcdefghij" and click on the get otp button
 #		Then Verify that user should get the red tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "123456789@" and click on the get otp button
 #		Then Verify that user should get the red tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field " 9876543210  " and click on the get otp button
 #		Then Verify that user should get the red tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "   9876543210" and click on the get otp button
 #		Then Verify that user should get the red tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "9876543210       " and click on the get otp button
 #		Then Verify that user should get the red tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "$%#$%#" and click on the get otp button
 #		Then Verify that user should get the red tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "123$%#!@$45" and click on the get otp button
 #		Then Verify that user should get the red tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "123***45" and click on the get otp button
 #		Then Verify that user should get the red tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "123,,.sd45" and click on the get otp button
 #		Then Verify that user should get the red tick in the mobile number user field from the partner log in page
 #		When user enter the mobile number into the mobile number user field "123sakod45" and click on the get otp button
 #		Then Verify that user should get the red tick in the mobile number user field from the partner log in page
 #		
 #		
 #		
 #	@Smoke
  #Scenario: Validate that registered user should get the mail user should not be able to log in with inactive status from register as partner page
    #Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
#		When user enter first name into the user field as "partner" into the partner registration page
#		When user enter last name into the user field as "tester" into the partner registration page
#		When user enter email into the user field as "partner.tester11@mail.com" into the partner registration page
#		When user enter mobile number into the user field as "758689600" into the partner registration page
#		When user enter password into the user field as "Admin@123" into the partner registration page
#		When user enter confirm password into the user field as "Admin@123" into the partner registration page
#		When user click the register button from partner registration page
#		Then Verify that user is on the partner log in page
#		#Mailtrap active user
#		Then user should get the partner created successfully and a verification mail has been sent to you pop up to the user in partner log in page
#		When user navigate to the mailtrap inbox with valid credentials
#		Then Verify that user should get the mail for verfication of your email address
#		Then Verify that Verify email address link should open in new tab as expected email verify successfully pop up should be displayed in partner log in page
#		Then Verify that user is on the partner log in page as expected sign in button should be displayed from partner log in page
#		
    #
#		
#		
#		
 #		
 #		
 #		
 #	@Smoke
  #Scenario: Validate that user should not navigated to the otp page with inactive status of the user from partner log in page
 #		Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
#		When user enter first name into the user field as "partner" into the partner registration page
#		When user enter last name into the user field as "tester" into the partner registration page
#		When user enter email into the user field as "partner.tester03@mail.com" into the partner registration page
#		When user enter mobile number into the user field as "758689652" into the partner registration page
#		When user enter password into the user field as "Admin@123" into the partner registration page
#		When user enter confirm password into the user field as "Admin@123" into the partner registration page
#		When user click the register button from partner registration page
#		Then Verify that user is on the partner log in page
 #		When user enter the credential into the email user field "partner.tester03@mail.com" and click on the get otp button
 #		Then Verify that user is on the same page due to inactive status of the user from the partner log in page
 #		
 #		
 #		
 #		
 #		
 #	@Smoke
  #Scenario: Validate that elements are presents in the get otp page from partner log in page
    #Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
#		When user enter first name into the user field as "partner" into the partner registration page
#		When user enter last name into the user field as "tester" into the partner registration page
#		When user enter email into the user field as "partner.tester03@mail.com" into the partner registration page
#		When user enter mobile number into the user field as "758689652" into the partner registration page
#		When user enter password into the user field as "Admin@123" into the partner registration page
#		When user enter confirm password into the user field as "Admin@123" into the partner registration page
#		When user click the register button from partner registration page
#		Then Verify that user is on the partner log in page
#		#User is active via belows steps
  #  Given Verify that admin is on the users all users page as expected page title "Shield" 
#	#  Then Verify that search button is able to search the user with "partner.tester03@mail.com" name of user in all users page
#		Then Verify that user should be able change the status of the user in all user page
#		#Sign out administrator
#	#	Then Verify than user is able to sign out button from the administrator profile dropdown page
    #Partner log in
 #		Given Verify that user is on the partner log in page as expected page title is "Shield"
 #		When user enter the credential into the email user field "partner.tester03@mail.com" and click on the get otp button
 #		
 #		When again click due to un authentication pop up
 #		
 #		Then Verify that sign in into your account title text is displayed from partner log in otp page
 #		Then Verify that sign in into manage your business text should be displayed from the partner log in otp page
 #		Then Verify that please enter six digit otp sent to your email mobile text above user field is displayed in partner log in otp page
 #		Then Verify that left side shield title text should be displayed in partner log in otp page
 #		Then Verfiy that left side shield logo should be displayed in partner log in otp page
 #		Then Verify that left side sign in into your account text is displayed in partner log in otp page
 #		Then Verify that left side sign in into manage your business text is displayed in partner log in otp page
 #		Then Verify that otp user fields counts should be 6 in partner log in otp page
 #		Then Verify that user field placeholder value should be "●" in partner log in otp page
 #		Then Verify that otp user fields should be clickable in partner log in otp page
 #		Then Verify that verify otp button should be displayed in partner log in otp page
 #		Then Verify that verify otp button should be clickable in partner log in otp page
 #		Then Verify that verify otp button should be able to mouse hover in log in otp page
 #		
 #		
 #		
 #		
 #		
 #		
 #		
 #	@Smoke
  #Scenario: Validate that working of an otp userfield in the get otp page from partner dashboard page
    #Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
#		When user enter first name into the user field as "partnerone" into the partner registration page
#		When user enter last name into the user field as "testeruser" into the partner registration page
#		When user enter email into the user field as "partner.tester04@mail.com" into the partner registration page
#		When user enter mobile number into the user field as "750689652" into the partner registration page
#		When user enter password into the user field as "Admin@123" into the partner registration page
#		When user enter confirm password into the user field as "Admin@123" into the partner registration page
#		When user click the register button from partner registration page
#		Then Verify that user is on the partner log in page
#		#User is active via belows steps
    #Given Verify that administrator user is on the users all users page as expected page title "Shield" 
#	  Then Verify that search button is able to search the user with "partner.tester04@mail.com" name of user in all users page
#		Then Verify that user should be able change the status of the user in all user page
#		#Sign out administrator
#		Then Verify than user is able to sign out button from the administrator profile dropdown page
    #Partner log in
 #		Given Verify that user is on the partner log in page as expected page title is "Shield"
 #		When user enter the credential into the email user field "partner.tester04@mail.com" and click on the get otp button
 #		When user navigate to new tab mailtrap inbox with valid credentials
 #		Then Copy the otp from the mail box and paste it into the otp user field from the partner log otp in page as expected title "Shield"
 #		
 #		
 #		
 #		
 #		
 #		
 #		
 #				
 #	@Smoke
  #Scenario: Validate that working of an invalid otp userfield in the get otp page from partner dashboard page
    #Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
#		When user enter first name into the user field as "partner" into the partner registration page
#		When user enter last name into the user field as "tester" into the partner registration page
#		When user enter email into the user field as "partner.tester03@mail.com" into the partner registration page
#		When user enter mobile number into the user field as "758689652" into the partner registration page
#		When user enter password into the user field as "Admin@123" into the partner registration page
#		When user enter confirm password into the user field as "Admin@123" into the partner registration page
#		When user click the register button from partner registration page
#		Then Verify that user is on the partner log in page
#		#User is active via belows steps
    #Given Verify that administrator user is on the users all users page as expected page title "Shield" 
#	  Then Verify that search button is able to search the user with "partner.tester03@mail.com" name of user in all users page
#		Then Verify that user should be able change the status of the user in all user page
#		#Sign out administrator
#		Then Verify than user is able to sign out button from the administrator profile dropdown page
    #Partner log in
 #		Given Verify that user is on the partner log in page as expected page title is "Shield"
 #		When user enter the credential into the email user field "partner.tester03@mail.com" and click on the get otp button
 #		Then Copy the wrong otp "968596" from the mail box and paste it into the otp user field from the partner log otp in page as expected title "Shield"
 #		
 #		
 #		
 #		
 #		
 #		
 #		
 #		
 #		
 #		
 #		