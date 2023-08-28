#@Admin_profile_change_password_page
#Feature: Validate admin user profile change password page functionality
#
#
  #@Smoke
  #Scenario: Validate that elements are present in the change password from admin user profile page
    #Given Verify that user is on the admin dashboard change password page as expected page title "Shield"
    #Then Verify that page header change password title text is displayed from admin dashboard change password page
    #Then Verify that page breadcrum list should be displayed from the admin dashboard change password page
    #Then Verify that page breadcrum dashborad button should be clickable from the admin dashboard change password page
    #Then Verify that page breadcrum change password text is displayed from the admin dashboard change password page
    #Then Verify that page current password title text above userfield should be displayed from the admin change password page
    #Then Verify that page current password user field should be clickable from the admin change password page
    #Then Verify that page current password user field placeholder value should be "Enter your current password" from the admin change password page
    #Then Verify that page submit button should be displayed from the admin change password page
    #Then Verify that page submit button should be clickable from the admin change password page
    #Then Verify that page cancel button should be displayed from the admin change password page
    #Then Verify that page cancel button should be clickable from the admin change password page
    #Then Verify that page submit button should be able to mouse hover from admin change password page
    #Then Verify that page cancel button should be able to mouse hover from admin change password page
    #Then Verify that page new password title text is displayed in the change password second page from admin change password page
    #Then Verify that page new password userfield should be clickable in the change password second page from admin change password page
    #Then Verify that page new password userfield placeholder value should be "Enter your new password" in the change password second page from admin change password page
    #Then Verify that page comfirm password title text is displayed in the change password second page from admin change password page
    #Then Verify that page comfirm password userfield should be clickable in the change password second page from admin change password page
    #Then Verify that page comfirm password userfield placeholder value should be "Confirm your password" in the change password second page from admin change password page
    #Then Verify that page submit button should be displayed from the admin change password second page
    #Then Verify that page submit button should be clickable from the admin change password second page
    #Then Verify that page cancel button should be displayed from the admin change password second page
    #Then Verify that page cancel button should be clickable from the admin change password second page
    #Then Verify that page submit button should be able to mouse hover from admin change password secon page
    #Then Verify that page cancel button should be able to mouse hover from admin change password second page
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that working of an change password from admin user profile page
    #Given Verify that user is on the admin dashboard change password page as expected page title "Shield"
    #When user enter the valid password into the password userfield into the admin dashboard user profile change password page
    #Then open the new password field and comfirm password userfield should be displayed in the admin dashbaord user profile change password page
    #When user enter the new password as "ADmin@123" and same for the comfirm password into the userfields from admin user profile change password page
    #Then Verify that user is on the admin log in page as expected sign in button is displayed in admin log in page
    #Then Verify that user is not able to log in with thoes old credentials into the admin dashboard log in page
    #Then Verify that user is able to log in with thoes changed credentials "ADmin@123" into the admin dashboard log in page
    #Then Verify that user set the old password "ADmin@123" in to the admin user profile change password page
#
#
#
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that working of an change password current field with valid or invalid credentials from admin user profile page
    #Given Verify that user is on the admin dashboard change password page as expected page title "Shield"
    #When admin enter the valid password into the userfield and clcik on submit button from change password page
    #When admin current enter new password "Admin@123" and click on submit button from change password page
    #Then Verify that admin should not get any red tick with note below the password user field from change password page
    #When admin current enter new password "Admin @123" and click on submit button from change password page
    #Then Verify that admin should not get any red tick with note below the password user field from change password page
    #When admin current enter new password "aDmin@123" and click on submit button from change password page
    #Then Verify that admin should not get any red tick with note below the password user field from change password page
    #When admin current enter new password "aDmin-@123" and click on submit button from change password page
    #Then Verify that admin should not get any red tick with note below the password user field from change password page
    #When admin current enter password "@aDmin-123" and click on submit button from change password page
    #Then Verify that admin should not get any red tick with note below the password user field from change password page
    #When admin current enter password "1@aDmin-123" and click on submit button from change password page
    #Then Verify that admin should not get any red tick with note below the password user field from change password page
    #When admin current enter password "**aDmin-123" and click on submit button from change password page
    #Then Verify that admin should not get any red tick with note below the password user field from change password page
    #When admin current enter password "**aDmin$123" and click on submit button from change password page
    #Then Verify that admin should not get any red tick with note below the password user field from change password page
    #When admin current enter password "**amiN$/*98" and click on submit button from change password page
    #Then Verify that admin should not get any red tick with note below the password user field from change password page
    #When admin current enter password "**a::iN$/*98" and click on submit button from change password page
    #Then Verify that admin should not get any red tick with note below the password user field from change password page
    #When admin current enter password "+Afgr#54" and click on submit button from change password page
    #Then Verify that admin should not get any red tick with note below the password user field from change password page
    #When admin current enter password "     " and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "abcd" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "ABCD" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "1234567890" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "qwertyuiop" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "$%^&$%$%#^^$$" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "@#$%^&*" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "ASDFGFDSAS" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "123456qwere" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "#$$%ASDSAS" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "asdfghQWERRT" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "12345@#$%^%$" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "123" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "               " and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "AD@@%%^^&&  in@@112233" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "Av&${}{}{}[][][]1234567" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
    #When admin current enter password "AD@@%%^^&&in@@112233@?" and click on submit button from change password page
    #Then Verify that admin should get the red tick with note below the password user field from change password page
#
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that working of an change password comfirm field with valid or invalid credentials from admin user profile page
    #Given Verify that user is on the admin dashboard change password page as expected page title "Shield"
    #Then user enter the invalid password into the password userfield into the admin dashboard user profile change password page "shbfh"
    #When user enter the valid password into the password userfield into the admin dashboard user profile change password page
    #When admin is enter the password as "Admin@123" in change password
    #When admin is enter the comfirm password as "admiN@123" and click on submit button in change password
    #Then Verify that admin should get any red tick and note below the comfirm password user field in change password
    #OLD password set
    #When admin is enter the password as "Admin@123" in change password
    #When admin is enter the comfirm password as "Admin@123" and click on submit button in change password
    #Then Verify that admin log in page have sign in button is displayed the comfirm password user field in change password
#
#
#
#
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that working of an cancel button change password first page from admin user profile page
    #Given Verify that user is on the admin dashboard change password page as expected page title "Shield"
    #Then Verify that cancel button should navigated to the dashboard page in change password from admin user profile page
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that working of an cancel button change password first page from admin user profile page
    #Given Verify that user is on the admin dashboard change password page as expected page title "Shield"
    #When admin is on the second page of comfirm password
    #Then Verify that cancel button should navigated to the dashboard page in change password from admin user profile page
