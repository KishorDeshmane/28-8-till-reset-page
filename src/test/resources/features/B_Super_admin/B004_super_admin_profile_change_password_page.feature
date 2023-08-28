#@Super_admin_profile_change_password_page
#Feature: Validate super_admin change password page functionality
#
  #@Smoke
  #Scenario: Validate that elements are present in the change password from super admin user profile page
    #Given Verify that user is on the super admin dashboard change password page as expected page title "Shield"
    #Then Verify that page header change password title text is displayed from super admin dashboard change password page
    #Then Verify that page breadcrum list should be displayed from the super admin dashboard change password page
    #Then Verify that page breadcrum dashborad button should be clickable from the super admin dashboard change password page
    #Then Verify that page breadcrum change password text is displayed from the super admin dashboard change password page
    #Then Verify that page current password title text above userfield should be displayed from the super admin change password page
    #Then Verify that page current password user field should be clickable from the super admin change password page
    #Then Verify that page current password user field placeholder value should be "Enter your current password" from the super admin change password page
    #Then Verify that page submit button should be displayed from the super admin change password page
    #Then Verify that page submit button should be clickable from the super admin change password page
    #Then Verify that page cancel button should be displayed from the super admin change password page
    #Then Verify that page cancel button should be clickable from the super admin change password page
    #Then Verify that page submit button should be able to mouse hover from super admin change password page
    #Then Verify that page cancel button should be able to mouse hover from super admin change password page
    #Then Verify that page new password title text is displayed in the change password second page from super admin change password page
    #Then Verify that page new password userfield should be clickable in the change password second page from super admin change password page
    #Then Verify that page new password userfield placeholder value should be "Enter your new password" in the change password second page from super admin change password page
    #Then Verify that page comfirm password title text is displayed in the change password second page from super admin change password page
    #Then Verify that page comfirm password userfield should be clickable in the change password second page from super admin change password page
    #Then Verify that page comfirm password userfield placeholder value should be "Confirm your password" in the change password second page from super admin change password page
    #Then Verify that page submit button should be displayed from the super admin change password second page
    #Then Verify that page submit button should be clickable from the super admin change password second page
    #Then Verify that page cancel button should be displayed from the super admin change password second page
    #Then Verify that page cancel button should be clickable from the super admin change password second page
    #Then Verify that page submit button should be able to mouse hover from super admin change password secon page
    #Then Verify that page cancel button should be able to mouse hover from super admin change password second page
    #
    #
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that working of an change password from Super admin user profile page
    #Given Verify that user is on the super_admin dashboard change password page as expected page title "Shield"
    #When user enter the valid password into the password userfield into the super_admin dashboard user profile change password page
    #Then open the new password field and comfirm password userfield should be displayed in the super_admin dashbaord user profile change password page
    #When user enter the new password as "ADmin@123" and same for the comfirm password into the userfields from super_admin user profile change password page
    #Then Verify that user is on the super_admin log in page as expected sign in button is displayed in super_admin log in page
    #Then Verify that user is not able to log in with thoes old credentials into the super_admin dashboard log in page
    #Then Verify that user is able to log in with thoes changed credentials "ADmin@123" into the super_admin dashboard log in page
    #Then Verify that user set the old password "ADmin@123" in to the super_admin user profile change password page
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that working of an change password current field with valid or invalid credentials from Super admin user profile page
    #Given Verify that user is on the super_admin dashboard change password page as expected page title "Shield"
    #When super_admin enter the valid password into the userfield and clcik on submit button from change password page
    #When super_admin current enter new password "Admin@123" and click on submit button from change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from change password page
    #When super_admin current enter new password "Admin @123" and click on submit button from change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from change password page
    #When super_admin current enter new password "aDmin@123" and click on submit button from change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from change password page
    #When super_admin current enter new password "aDmin-@123" and click on submit button from change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from change password page
    #When super_admin current enter password "@aDmin-123" and click on submit button from change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from change password page
    #When super_admin current enter password "1@aDmin-123" and click on submit button from change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from change password page
    #When super_admin current enter password "**aDmin-123" and click on submit button from change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from change password page
    #When super_admin current enter password "**aDmin$123" and click on submit button from change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from change password page
    #When super_admin current enter password "**amiN$/*98" and click on submit button from change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from change password page
    #When super_admin current enter password "**a::iN$/*98" and click on submit button from change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from change password page
    #When super_admin current enter password "+Afgr#54" and click on submit button from change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from change password page
    #When super_admin current enter password "     " and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "abcd" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "ABCD" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "1234567890" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "qwertyuiop" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "$%^&$%$%#^^$$" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "@#$%^&*" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "ASDFGFDSAS" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "123456qwere" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "#$$%ASDSAS" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "asdfghQWERRT" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "12345@#$%^%$" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "123" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "               " and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "AD@@%%^^&&  in@@112233" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "Av&${}{}{}[][][]1234567" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
    #When super_admin current enter password "AD@@%%^^&&in@@112233@?" and click on submit button from change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from change password page
#
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that working of an change password comfirm field with valid or invalid credentials from Super admin user profile page
    #Given Verify that user is on the super_admin dashboard change password page as expected page title "Shield"
    #Then user enter the invalid password into the password userfield into the super_admin dashboard user profile change password page "shbfh"
    #When user enter the valid password into the password userfield into the super_admin dashboard user profile change password page
    #When super_admin is enter the password as "Admin@123" in change password
    #When super_admin is enter the comfirm password as "admiN@123" and click on submit button in change password
    #Then Verify that super_admin should get any red tick and note below the comfirm password user field in change password
    #OLD password set
    #When super_admin is enter the password as "Admin@123" in change password
    #When super_admin is enter the comfirm password as "Admin@123" and click on submit button in change password
    #Then Verify that super_admin log in page have sign in button is displayed the comfirm password user field in change password
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
  #Scenario: Validate that working of an cancel button change password first page from Super admin user profile page
    #Given Verify that user is on the super_admin dashboard change password page as expected page title "Shield"
    #Then Verify that cancel button should navigated to the dashboard page in change password from super_admin user profile page
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that working of an cancel button change password first page from Super admin user profile page
    #Given Verify that user is on the super_admin dashboard change password page as expected page title "Shield"
    #When super_admin is on the second page of comfirm password
    #Then Verify that cancel button should navigated to the dashboard page in change password from super_admin user profile page
