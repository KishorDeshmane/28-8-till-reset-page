#@partner_registration_page
#Feature: partner registestration page
#
  #@Smoke
  #Scenario: Validate that elements are present in the register as partner page
    #Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
    #Then Verify that register as partner user page title text is displayed in the partner registration page
#		Then Verify that register to manage your business subtitle text is displayed in the partner registration page
#		Then Verify that first name above the user field should be displayed in the partner registration page
#		Then Verify that first name asterisk should be displayed in the registration page
#		Then Verify that first name user field should be displayed in the partner registration page
#		Then Verify that first name user field should be clickable in the partner registration page
#		Then Verify that first name user field placeholder value should be "Enter your first name" in partner registration page
#		Then Verify that last name above the user field should be displayed in the partner registration page
#		Then Verify that last name asterisk should be displayed in the registration page
#		Then Verify that last name user field should be displayed in the partner registration page
#		Then Verify that last name user field should be clickable in the partner registration page
#		Then Verify that last name user field placeholder value should be "Enter your last name" in partner registration page
#		Then Verify that email above the user field should be displayed in the partner registration page
#		Then Verify that email asterisk should be displayed in the registration page
#		Then Verify that email user field should be displayed in the partner registration page
#		Then Verify that email user field should be clickable in the partner registration page
#		Then Verify that email user field placeholder value should be "Enter your email address" in partner registration page
#		Then Verify that mobile number above the user field should be displayed in the partner registration page
#		Then Verify that mobile number asterisk should be displayed in the partner registration page
#		Then Verify that mobile number dropdown should be clickable in the partner registration page
#		Then Verify that mobile number dropdown list should be clickable in the partner registration page
#		Then Verify that mobile number user field should be displayed in the partner registration page
#		Then Verify that mobile number user field should be clickable in the partner registration page
#		Then Verify that mobile number user field placeholder value should be "Enter your mobile number" in partner registration page
#		Then Verify that password above the user field should be displayed in the partner registration page
#		Then Verify that password asterisk should be displayed in the registration page
#		Then Verify that password user field should be displayed in the partner registration page
#		Then Verify that password user field should be clickable in the partner registration page
#		Then Verify that password user field placeholder value should be "Enter your password" in partner registration page
#		Then Verify that comfirm password above the user field should be displayed in the partner registration page
#		Then Verify that comfirm password asterisk should be displayed in the registration page
#		Then Verify that comfirm password user field should be displayed in the partner registration page
#		Then Verify that comfirm password user field should be clickable in the partner registration page
#		Then Verify that comfirm password user field placeholder value should be "Confirm your password" in partner registration page
#		Then Verify that register button should be displayed in the register as partner page
#		Then Verify that register button should be clickable in the register as parter page
#		Then Verify that register button should be able to mouse hover in register as partner page
#		Then Verify that left side shield text should be displayed in the register as partner page
#		Then Verify that left side shield logo should be displayed in the register as partner page
#		Then Verify that left side register as partner text should displayed in the register as partner page
#		Then Verify that left side register to manage text should displayed in the register as partner page
#		
#		
#		
#		
  #@Smoke
  #Scenario: Validate that working of an first name user field in the register as partner page
    #Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
#		#Valid
#		When user enter the text into the first name user field as "Abcdefgh" and click on register button in register as partner page
#		Then Verify that user should get the green tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "abc" and click on register button in register as partner page
#		Then Verify that user should get the green tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "ElizabethElizabethElizabethElizabethElizabethEli" and click on register button in register as partner page
#		Then Verify that user should get the green tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "ElizabethElizabethElizabethEl" and click on register button in register as partner page
#		Then Verify that user should get the green tick in the first name user field from register as partner page
#		#Invalid
#		When user enter the text into the first name user field as "abc bcde" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "Jonathan-Smith" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "abc@bcde" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "%^&*()" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "a" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "ab" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "12345" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "123" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as " h j k o d " and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "   hjkod   " and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "   hjkod" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "hjkod      " and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "      hjk     oddc      " and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "@oddc" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "0ddc@" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "oddc7891" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "7898oddc" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		When user enter the text into the first name user field as "JohnSmithAndersonJohnsonWilliamsBrownDavisMillerWilsonMooreTaylorAnderson" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the first name user field from register as partner page
#		
#		
#		
#		
#	@Smoke
  #Scenario: Validate that working of an last name user field in the register as partner page
    #Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
#		#Valid
#		When user enter the text into the last name user field as "Abcdefgh" and click on register button in register as partner page
#		Then Verify that user should get the green tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "abc" and click on register button in register as partner page
#		Then Verify that user should get the green tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "ElizabethElizabethElizabethElizabethElizabethEli" and click on register button in register as partner page
#		Then Verify that user should get the green tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "ElizabethElizabethElizabethEl" and click on register button in register as partner page
#		Then Verify that user should get the green tick in the last name user field from register as partner page
#		#Invalid
#		When user enter the text into the last name user field as "abc bcde" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "Jonathan-Smith" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "abc@bcde" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "%^&*()" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "a" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "ab" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "12345" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "123" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as " h j k o d " and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "   hjkod   " and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "   hjkod" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "hjkod      " and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "      hjk     oddc      " and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "@oddc" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "0ddc@" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "oddc7891" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "7898oddc" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		When user enter the text into the last name user field as "JohnSmithAndersonJohnsonWilliamsBrownDavisMillerWilsonMooreTaylorAnderson" and click on register button in register as partner page
#		Then Verify that user should get the red tick in the last name user field from register as partner page
#		
#		
#	@Smoke
  #Scenario: Validate that working of an email user field in the register as partner page
    #Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
#		#Valid
#		When user enter the text into the email user field as "ashish.upadhyay@iffort.com" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the email user field from register as partner page
#		When user enter the text into the email user field as "kd@iffort.co.uk" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the email user field from register as partner page
#		When user enter the text into the email user field as "info@iffort.ifff.com" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the email user field from register as partner page
#		When user enter the text into the email user field as "ashish-upadhyay@iffort.com" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the email user field from register as partner page
#		When user enter the text into the email user field as "ashish+upadhyay@iffort.com" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the email user field from register as partner page
#		When user enter the text into the email user field 255 char and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the email user field from register as partner page
#		When user enter the text into the email user field 200 char and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the email user field from register as partner page
#		When user enter the text into the email user field 100 char and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the email user field from register as partner page
#		When user enter the text into the email user field 50 char and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the email user field from register as partner page
#		#Invalid
#		When user enter the text into the email user field as "123456" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "abcdefg@" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "abcdefg.co.in" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "abcdefg@co.123" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "abcdefg@co" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "abcdefg@@@co" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "@example.com" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "abcsdf@.com" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "abcsd f@co.com" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		#When user enter the text into the email user field as "kis.de😀@gmial.com" and click on the register button in register as partner page
#		#Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "Kabc.f@co.com" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "  abcdefg@co.in  " and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "abcdefg@co.in         " and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "          abcdefg@co.in" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "hello@example.みんな" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "!#$%$#e@example.com" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "!#$%$#e@&^%$.com" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field as "!#$%$#e@^%$#.&%^" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		When user enter the text into the email user field 255 plus char and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the email user field from register as partner page
#		
#		
#		
#	@Smoke
  #Scenario: Validate that working of an mobile number user field in the register as partner page
    #Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
#		#Valid
#		When user enter the text into the mobile number user field as "1234567890" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the mobile number user field from register as partner page
#		When user enter the text into the mobile number user field as "9876543210" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the mobile number user field from register as partner page
#		When user enter the text into the mobile number user field as "666666333" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the mobile number user field from register as partner page
#		When user enter the text into the mobile number user field as "15551234567" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the mobile number user field from register as partner page
#		#Invalid
#		When user enter the text into the mobile number user field as " " and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the mobile number user field from register as partner page
#		When user enter the text into the mobile number user field as "123" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the mobile number user field from register as partner page
#		When user enter the text into the mobile number user field as "012345678901234" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the mobile number user field from register as partner page
#		When user enter the text into the mobile number user field as "abcdefghij" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the mobile number user field from register as partner page
#		When user enter the text into the mobile number user field as "123456789@" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the mobile number user field from register as partner page
#		When user enter the text into the mobile number user field as " 9876543210  " and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the mobile number user field from register as partner page
#		When user enter the text into the mobile number user field as "   9876543210" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the mobile number user field from register as partner page
#		When user enter the text into the mobile number user field as "9876543210       " and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the mobile number user field from register as partner page
#		
#		
#		
#		
#	@Smoke
  #Scenario: Validate that working of an password user field in the register as partner page
    #Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
#		#Valid
#		When user enter the text into the password user field as "Admin@123" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the password user field from register as partner page
#		When user enter the text into the password user field as "Admin @123" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the password user field from register as partner page
#		When user enter the text into the password user field as "aDmin@123" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the password user field from register as partner page
#		When user enter the text into the password user field as "aDmin-@123" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the password user field from register as partner page
#		When user enter the text into the password user field as "@aDmin-123" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the password user field from register as partner page
#		When user enter the text into the password user field as "1@aDmin-123" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the password user field from register as partner page
#		When user enter the text into the password user field as "**aDmin-123" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the password user field from register as partner page
#		When user enter the text into the password user field as "**aDmin$123" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the password user field from register as partner page
#		When user enter the text into the password user field as "**amiN$/*98" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the password user field from register as partner page
#		When user enter the text into the password user field as "**a::iN$/*98" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the password user field from register as partner page
#		When user enter the text into the password user field as "+Afgr#54" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in the password user field from register as partner page
#		#invalid
#		When user enter the text into the password user field as "     " and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "abcd" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "ABCD" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "1234567890" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "qwertyuiop" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "$%^&$%$%#^^$$" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "@#$%^&*" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "ASDFGFDSAS" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "123456qwere" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "#$$%ASDSAS" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "asdfghQWERRT" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "12345@#$%^%$" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "123" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "               " and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "AD@@%%^^&&  in@@112233" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "Av&${}{}{}[][][]1234567" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		When user enter the text into the password user field as "AD@@%%^^&&in@@112233@?" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in the password user field from register as partner page
#		
#		
#		
#		
#	
#	@Smoke
  #Scenario: Validate that working of confirm password user field in the register as partner page
    #Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
#		#Valid
#		When user enter the text into confirm password and password user field as "Admin@123" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in confirm password user field from register as partner page
#		#Invalid
#		When user enter the text into confirm password and password user field as "admin@123" and click on the register button in register as partner page
#		Then Verify that user should get the green tick in confirm password user field from register as partner page
#		#With differ both
#		When user enter the text into password user field as "Admin@123" confirm password "admin@123" and click on the register button in register as partner page
#		Then Verify that user should get the red tick in confirm password user field from register as partner page
#		
#		
#		
#	@Smoke
  #Scenario: Validate that working of register button in the register as partner page
    #Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
#		When user enter first name into the user field as "partner" into the partner registration page
#		When user enter last name into the user field as "tester" into the partner registration page
#		When user enter email into the user field as "partner.tester0@mail.com" into the partner registration page
#		When user enter mobile number into the user field as "758689650" into the partner registration page
#		When user enter password into the user field as "Admin@123" into the partner registration page
#		When user enter confirm password into the user field as "Admin@123" into the partner registration page
#		When user click the register button from partner registration page
#		Then Verify that user is on the partner log in page
#		
#		
#		
#		
#	@Smoke
  #Scenario: Validate that working of register button user should get the mail to user from register as partner page
    #Given Verify that user is on the partner registration page from landing page as expected page title "Shield"
#		When user enter first name into the user field as "partner" into the partner registration page
#		When user enter last name into the user field as "tester" into the partner registration page
#		When user enter email into the user field as "partner.tester03@mail.com" into the partner registration page
#		When user enter mobile number into the user field as "758689650" into the partner registration page
#		When user enter password into the user field as "Admin@123" into the partner registration page
#		When user enter confirm password into the user field as "Admin@123" into the partner registration page
#		When user click the register button from partner registration page
#		Then Verify that user is on the partner log in page
#		Then user should get the partner created successfully and a verification mail has been sent to you pop up to the user in partner log in page
#		When user navigate to the mailtrap inbox with valid credentials
#		Then Verify that user should get the mail for verfication of your email address
#		Then Verify that Verify email address link should open in new tab as expected email verify successfully pop up should be displayed in partner log in page
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
#		
#		
#		