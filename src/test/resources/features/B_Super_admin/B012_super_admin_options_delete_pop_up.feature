#@Super_admin_delete_user_function
#Feature: Validate super admin all user action options delete user functionality
#
#
  #@Smoke
  #Scenario: Validate that elements are presents in super admin all users action options delete pop up
    #Given Verify that super admin user is on the users all users actions options delete page as expected page title "Shield"
    #When super admin click on the delete button from the super admin dashboard all users actions options button
    #Then Verify that delete comfirmation pop displayed having are you sure text from super admin delete pop up
    #Then Verify that delete comfirmation pop up you want to delete this user text is displayed in the super admin delete pop up
    #Then Verify that delete comfirmation pop up yes delete it button is clickable in the super admin delete pop up
    #Then Verify that delete comfirmation pop up yes delete it button is displayed in the super admin delete pop up
    #Then Verify that delete comfirmation pop up cancel button is displayed in the super admin delete pop up
    #Then Verify that delete comfirmation pop up cancel button is clickable in the super admin delete pop up
    #Then Verify that delete comfirmation pop up name of the user is displayed in super admin delete pop up



#
#
  #@Smoke
  #Scenario: Validate that cancel button working in Super admin all users action options delete pop up
    #Given Verify that super_admin user is on the users all users actions options delete page as expected page title "Shield"
    #Then Verify that super_admin cancel button should cancel the pop an user is on all user page from optiion button
#
#
#
  #@Smoke
  #Scenario: Validate that Super admin user create a new user and delete the newly created user of super admin with inactive status
    #Given Verify that super_admin is on the super_admin dashboard users all users create user page as expected page title "Shield" for delete pop up
    #Then Verify that super_admin enter the first name as "Kumars" in create user page for delete pop up
    #Then Verify that super_admin enter the last name as  "Deshmanea" in create user page for delete pop up
    #Then Verify that super_admin enter the email as "kumar.deshmane@iff.com" in create user page for delete pop up
    #Then Verify that super_admin select the country code "UAE" in create user page for delete pop up
    #Then Verify that super_admin enter the mobile number as "987654329" in create user page for delete pop up
    #Then Verify that super_admin enter date of birth as "10/10/1924" in the create user page for delete pop up
    #Then Verify that super_admin send the profile image as jpg in create user page for delete pop up
    #Then Verify that super_admin select the gender as male from the radio button in create user page for delete pop up
    #Then Verify that super_admin enter password as "Admin@1234" in the create user page for delete pop up
    #Then Verify that super_admin enter comfirmed password as same as "Admin@1234" in the create user page for delete pop up
    #Then Verify that super_admin select the assigned role as "Super Admin" in the create user page super admin for delete pop up
    #Then Verify that the super_admin submit the button should create a new user in the all users page for delete pop up
    #Then Verify that super_admin search button is able to search the user with "kumar.deshmane@iff.com" name of user in all users page for delete pop up
    #Delete the new created user
    #Then Verify that super_admin should be able to delete the user from the all users page for delete pop up
    #Try to log in deleted user
    #Then Verify that super_admin user not found text pop up while log in with delete user in super_admin log in page is displayed for delete pop up email "kumar.deshmane@iff.com" and pass "Admin@1234"
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that Super admin user create a new user and delete the newly created user of admin with inactive status
    #Given Verify that super_admin is on the super_admin dashboard users all users create user page as expected page title "Shield" for delete pop up
    #Then Verify that super_admin enter the first name as "Kumars" in create user page for delete pop up
    #Then Verify that super_admin enter the last name as  "Deshmanea" in create user page for delete pop up
    #Then Verify that super_admin enter the email as "kumar.deshmane@iff.com" in create user page for delete pop up
    #Then Verify that super_admin select the country code "UAE" in create user page for delete pop up
    #Then Verify that super_admin enter the mobile number as "987654329" in create user page for delete pop up
    #Then Verify that super_admin enter date of birth as "10/10/1924" in the create user page for delete pop up
    #Then Verify that super_admin send the profile image as jpg in create user page for delete pop up
    #Then Verify that super_admin select the gender as male from the radio button in create user page for delete pop up
    #Then Verify that super_admin enter password as "Admin@1234" in the create user page for delete pop up
    #Then Verify that super_admin enter comfirmed password as same as "Admin@1234" in the create user page for delete pop up
    #Then Verify that super_admin select the assigned role as "Admin" in the create user page admin for delete pop up
    #Then Verify that the super_admin submit the button should create a new user in the all users page for delete pop up
    #Then Verify that super_admin search button is able to search the user with "kumar.deshmane@iff.com" name of user in all users page for delete pop up
    #Delete the new created user
    #Then Verify that super_admin should be able to delete the user from the all users page for delete pop up
    #Try to log in deleted user
    #Then Verify that super_admin user not found text pop up while log in with delete user in super_admin log in page is displayed for delete pop up email "kumar.deshmane@iff.com" and pass "Admin@1234"
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that Super admin user create a new user and delete the newly created user of super admin with active status
    #Given Verify that super_admin is on the super_admin dashboard users all users create user page as expected page title "Shield" for delete pop up
    #Then Verify that super_admin enter the first name as "Kumars" in create user page for delete pop up
    #Then Verify that super_admin enter the last name as  "Deshmanea" in create user page for delete pop up
    #Then Verify that super_admin enter the email as "kumar.deshmane@iff.com" in create user page for delete pop up
    #Then Verify that super_admin select the country code "UAE" in create user page for delete pop up
    #Then Verify that super_admin enter the mobile number as "987654329" in create user page for delete pop up
    #Then Verify that super_admin enter date of birth as "10/10/1924" in the create user page for delete pop up
    #Then Verify that super_admin send the profile image as jpg in create user page for delete pop up
    #Then Verify that super_admin select the gender as male from the radio button in create user page for delete pop up
    #Then Verify that super_admin enter password as "Admin@1234" in the create user page for delete pop up
    #Then Verify that super_admin enter comfirmed password as same as "Admin@1234" in the create user page for delete pop up
    #Then Verify that super_admin select the assigned role as "Super Admin" in the create user page super admin for delete pop up
    #Then Verify that the super_admin submit the button should create a new user in the all users page for delete pop up
    #Then Verify that super_admin search button is able to search the user with "kumar.deshmane@iff.com" name of user in all users page for delete pop up
    #Then Verify that super_admin should be able change the status of the user in all user page for delete pop up
    #Then Verify that super_admin should be able to delete the user from the all users page for delete pop up
    #Then Verify that super_admin user not found text pop up while log in with delete user in super_admin log in page is displayed for delete pop up email "kumar.deshmane@iff.com" and pass "Admin@1234"
#
  #@Smoke
  #Scenario: Validate that Super admin user create a new user and delete the newly created user of admin with active status
    #Given Verify that super_admin is on the super_admin dashboard users all users create user page as expected page title "Shield" for delete pop up
    #Then Verify that super_admin enter the first name as "Kumars" in create user page for delete pop up
    #Then Verify that super_admin enter the last name as  "Deshmanea" in create user page for delete pop up
    #Then Verify that super_admin enter the email as "kumar.deshmane@iff.com" in create user page for delete pop up
    #Then Verify that super_admin select the country code "UAE" in create user page for delete pop up
    #Then Verify that super_admin enter the mobile number as "987654329" in create user page for delete pop up
    #Then Verify that super_admin enter date of birth as "10/10/1924" in the create user page for delete pop up
    #Then Verify that super_admin send the profile image as jpg in create user page for delete pop up
    #Then Verify that super_admin select the gender as male from the radio button in create user page for delete pop up
    #Then Verify that super_admin enter password as "Admin@1234" in the create user page for delete pop up
    #Then Verify that super_admin enter comfirmed password as same as "Admin@1234" in the create user page for delete pop up
    #Then Verify that super_admin select the assigned role as "Admin" in the create user page admin for delete pop up
    #Then Verify that the super_admin submit the button should create a new user in the all users page for delete pop up
    #Then Verify that super_admin search button is able to search the user with "kumar.deshmane@iff.com" name of user in all users page for delete pop up
    #Then Verify that super_admin should be able change the status of the user in all user page for delete pop up
    #Then Verify that super_admin should be able to delete the user from the all users page for delete pop up
    #Then Verify that super_admin user not found text pop up while log in with delete user in super_admin log in page is displayed for delete pop up email "kumar.deshmane@iff.com" and pass "Admin@1234"
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
    #
    #Parter is deleted with active and inactive is pending
    #
    #Deleted user should not log in
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
    