#@Super_admin_option_change_password_page
#Feature: Validate super admin all user action options change password functionality
#
#
  #@Smoke
  #Scenario: Validate that elements are presents in Super admin all users action options change password page
    #Given Verify that super admin user is on the users all users actions options change password page as expected page title "Shield"
    #Then Verify that page header change password title text is displayed from super admin dashboard options change password page
    #Then Verify that page breadcrum list should be displayed from the super admin dashboard options change password page
    #Then Verify that page breadcrum dashborad button should be clickable from the super admin dashboard options change password page
    #Then Verify that page breadcrum change password text is displayed from the super admin dashboard options change password page
    #Then Verify that page current password title text above userfield should be displayed from the super admin options change password page
    #Then Verify that page current password user field should be clickable from the super admin options change password page
    #Then Verify that page current password user field placeholder value should be "Enter your current password" from the super admin options change password page
    #Then Verify that page submit button should be displayed from the super admin options change password page
    #Then Verify that page submit button should be clickable from the super admin options change password page
    #Then Verify that page cancel button should be displayed from the super admin options change password page
    #Then Verify that page cancel button should be clickable from the super admin options change password page
    #Then Verify that page submit button should be able to mouse hover from super admin options change password page
    #Then Verify that page cancel button should be able to mouse hover from super admin options change password page
    #Then Verify that page new password title text is displayed in the change password second page from super admin options change password page
    #Then Verify that page new password userfield should be clickable in the change password second page from super admin options change password page
    #Then Verify that page new password userfield placeholder value should be "Enter your new password" in the change password second page from super admin options change password page
    #Then Verify that page comfirm password title text is displayed in the change password second page from super admin options change password page
    #Then Verify that page comfirm password userfield should be clickable in the change password second page from super admin options change password page
    #Then Verify that page comfirm password userfield placeholder value should be "Confirm your password" in the change password second page from super admin options change password page
    #Then Verify that page submit button should be displayed from the super admin options change password second page
    #Then Verify that page submit button should be clickable from the super admin options change password second page
    #Then Verify that page cancel button should be displayed from the super admin options change password second page
    #Then Verify that page cancel button should be clickable from the super admin options change password second page
    #Then Verify that page submit button should be able to mouse hover from super admin options change password secon page
    #Then Verify that page cancel button should be able to mouse hover from super admin options change password second page
#
#
#
#
  #@Smoke
  #Scenario: Validate that the working of an breadcrumb from Super admin user action option change password functionality
    #Given Verify that super_admin user is on the users all users actions options change password page as expected page title "Shield"
    #Then Verify that super_admin breadcrum dashboard button should navigated to the dashboard page from the users options change password page
#
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that the working of an breadcrumb from Super admin user action option change password functionality
    #Given Verify that super_admin user is on the users all users actions options change password page as expected page title "Shield"
    #Then Verify that super_admin second page breadcrum dashboard button should navigated to the dashboard page from the users options change password page
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that the working of an breadcrumb from Super admin user action option change password functionality
    #Given Verify that super_admin user is on the users all users actions options change password page as expected page title "Shield"
    #Then Verify that super_admin cancel button should navigated to the dashboard page from the users options change password page
#
#
#
#
  #@Smoke
  #Scenario: Validate that the working of an breadcrumb from Super admin user action option change password functionality
    #Given Verify that super_admin user is on the users all users actions options change password page as expected page title "Shield"
    #When super_admin enter the valid password into the userfield and clcik on submit button from options change password page
    #Then Verify that super_admin second page cancel button should navigated to the dashboard page from the users options change password page
#
#
#
#
  #@Smoke
  #Scenario: Validate that working of an current password user field in Super admin all users action options change password page
    #Given Verify that super_admin user is on the users all users actions options change password page as expected page title "Shield"
    #When super_admin enter the invalid password into the cureent password from all users actions options change password page
    #Then Verify that super_admin should not be able to displayed the new password user field from all users actions options change password page
#
#
#
#
  #@Smoke
  #Scenario: Validate that comfirm password and new password user field working in Super admin all users action options change password page
    #Given Verify that super_admin user is on the users all users actions options change password page as expected page title "Shield"
    #When super_admin enter the valid password into the userfield and clcik on submit button from options change password page
    #When super_admin current enter new password "Admin@123" and click on submit button from options change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from options change password page
    #When super_admin current enter new password "Admin @123" and click on submit button from options change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from options change password page
    #When super_admin current enter new password "aDmin@123" and click on submit button from options change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from options change password page
    #When super_admin current enter new password "aDmin-@123" and click on submit button from options change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from options change password page
    #When super_admin current enter password "@aDmin-123" and click on submit button from options change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from options change password page
    #When super_admin current enter password "1@aDmin-123" and click on submit button from options change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from options change password page
    #When super_admin current enter password "**aDmin-123" and click on submit button from options change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from options change password page
    #When super_admin current enter password "**aDmin$123" and click on submit button from options change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from options change password page
    #When super_admin current enter password "**amiN$/*98" and click on submit button from options change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from options change password page
    #When super_admin current enter password "**a::iN$/*98" and click on submit button from options change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from options change password page
    #When super_admin current enter password "+Afgr#54" and click on submit button from options change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from options change password page
    #When super_admin current enter password "     " and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "abcd" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "ABCD" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "1234567890" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "qwertyuiop" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "$%^&$%$%#^^$$" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "@#$%^&*" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "ASDFGFDSAS" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "123456qwere" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "#$$%ASDSAS" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "asdfghQWERRT" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "12345@#$%^%$" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "123" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "               " and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "AD@@%%^^&&  in@@112233" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "Av&${}{}{}[][][]1234567" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
    #When super_admin current enter password "AD@@%%^^&&in@@112233@?" and click on submit button from options change password page
    #Then Verify that super_admin should get the red tick with note below the password user field from options change password page
#
#
  #
  #Own user super admin change password
  #@Smoke
  #Scenario: Validate that comfirm password user field working in Super admin all users action options change password page
    #Given Verify that super_admin user is on the users all users actions options change password page as expected page title "Shield"
    #When super_admin enter the valid password into the userfield and clcik on submit button from options change password page
    #When super_admin current enter new password "Admin@123" and click on submit button from options change password page
    #Then Verify that super_admin should not get any red tick with note below the password user field from options change password page
    #When super_admin is enter the password as "Admin@123" in change password from options change password page
    #When super_admin is enter the comfirm password as "admiN@123" and click on submit button in options change password page
    #Then Verify that super_admin should get any red tick and note below the comfirm password user field in options change password page
#
#
#
#
#
      #Need to check it on the another super admin user / admin user /partner etc
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
    