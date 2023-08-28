#@Super_admin_change_status_function
#Feature: Validate super admin all user action options change status functionality
#
  #@Smoke
  #Scenario: Validate that elemetnts are presents from Super admin change status in action options pop up
    #Given Verify that super admin user is on the users all users actions options change status page as expected page title "Shield"
    #When user click on the change status button from the super admin change status pop up
    #Then Verify that the pop up should be displayed in the super admin change status pop up
    #Then Verify that the pop up title change status of the user should be displayed in super admin change status pop up
    #Then Verify that the pop up cross button should be clickable in super admin change status pop up
    #Then Verify that the pop up switch button should be clickable in the super admin change status pop up
    #Then Verify that the pop up switch button side text should be displayed in the super admin change status pop up
    #Then Verify that the pop up switch button side text active or inactive is displayed in the super admin change status pop up
    #Then Verify that the pop up submit mouse hover is possible in the super admin change status pop up
    #Then Verify that the pop up cancel button mouse hover is possible in the super admin change status pop up
    #Then Verify that the pop up close button should be close the pop up in the super admin change status pop up

#
#
#
#
  #@Smoke
  #Scenario: Validate that working of an cross button from Super admin change status in action options pop up
    #Given Verify that super_admin user is on the users all users actions options change status page as expected page title "Shield"
    #When user click on the change status button from the super_admin dashboard all users actions option button
    #Then Verify that the pop up cross button click as expected pop up is not displayed in super_admin dashboard all users actions options button
#
#
#
#
  #Super admin user test cases
  #
  #
  #
  #
  #
  #
  #@Smoke
  #Scenario: Validate that created a new user and change the status to active of the new user as super admin
    #Given Verify that super_admin is on the super_admin dashboard users all users create user page as expected page title "Shield" for change status
    #Then Verify that super_admin enter the first name as "Kumar" in create user page for change status
    #Then Verify that super_admin enter the last name as  "Deshmane" in create user page for change status
    #Then Verify that super_admin enter the email as "kumar.deshmane@iffort.com" in create user page for change status
    #Then Verify that super_admin select the country code "UAE" in create user page for change status
    #Then Verify that super_admin enter the mobile number as "987654321" in create user page for change status
    #Then Verify that super_admin enter date of birth as "10/10/1925" in the create user page for change status
    #Then Verify that super_admin send the profile image as jpg in create user page for change status
    #Then Verify that super_admin select the gender as male from the radio button in create user page for change status
    #Then Verify that super_admin enter password as "Admin@1234" in the create user page for change status
    #Then Verify that super_admin enter comfirmed password as same as "Admin@1234" in the create user page for change status
    #Then Verify that super_admin select the assigned role as "Super Admin" in the create user page super admin for change status
    #Then Verify that the super_admin submit the button should create a new user in the all users page for change status
    #Then Verify that super_admin search button is able to search the user with "kumar.deshmane@iffort.com" name of user in all users page
    #Then Verify that super_admin should be able change the status of the user in all user page
#
  #@Smoke
  #Scenario: Validate that user is able to log in into the application with active status of the new user of super admin
    #Given Verify that super_admin is on the super_admin log in page as expected page title is "Shield" with new created user
    #When Verify that after super_admin enter the super_admin "kumar.deshmane@iffort.com" into the email user field with new created user
    #When Verify that after super_admin enter the super_admin "Admin@1234" into the password user field with new created user
    #Then Verify that after super_admin entering the valid super_admin credentials into the email and password user is able to click on the sign in button with new created user
    #Then Verify that super_admin is log in super_admin successfully with the expected page tilte "Shield" with new created user
#
  #@Smoke
  #Scenario: Validate that search the user and change status to inactive status of the new user of super admin
    #Given Verify that super_admin user is on the users all users page as expected page title "Shield" for change status
    #Then Verify that super_admin search button is able to search the user with "kumar.deshmane@iffort.com" name of user in all users page
    #Then Verify that super_admin should be able change the status of the user in all user page for new user
#
  #@Smoke
  #Scenario: Validate that user is not able to log in into the application with inactive status of the new user of super admin
    #Given Verify that super_admin is on the super_admin log in page as expected page title is "Shield" with new created user
    #When Verify that after super_admin enter the super_admin "kumar.deshmane@iffort.com" into the email user field with new created user
    #When Verify that after super_admin enter the super_admin "Admin@1234" into the password user field with new created user
    #Then Verify that super_admin is not log in super_admin successfully with the expected page tilte "Shield" with new user
#
  #@Smoke
  #Scenario: Validate that super_admin user deleted the newly created user into application of super admin
    #Given Verify that super_admin user is on the users all users page as expected page title "Shield" for change status
    #Then Verify that super_admin search button is able to search the user with "kumar.deshmane@iffort.com" name of user in all users page
    #Then Verify that super_admin should be able to delete the user from the all users page
#
#
#
#
#
#
  # admin user test cases -Admin user keliye test case
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that created a new user and change the status to active of the new user as admin
    #Given Verify that super_admin is on the super_admin dashboard users all users create user page as expected page title "Shield" for change status
    #Then Verify that super_admin enter the first name as "Kumars" in create user page for change status
    #Then Verify that super_admin enter the last name as  "Deshmukh" in create user page for change status
    #Then Verify that super_admin enter the email as "kumars.deshmukh@iffort.com" in create user page for change status
    #Then Verify that super_admin select the country code "UAE" in create user page for change status
    #Then Verify that super_admin enter the mobile number as "987654321" in create user page for change status
    #Then Verify that super_admin enter date of birth as "10/10/1925" in the create user page for change status
    #Then Verify that super_admin send the profile image as jpg in create user page for change status
    #Then Verify that super_admin select the gender as male from the radio button in create user page for change status
    #Then Verify that super_admin enter password as "Admin@1234" in the create user page for change status
    #Then Verify that super_admin enter comfirmed password as same as "Admin@1234" in the create user page for change status
    #Then Verify that super_admin select the assigned role as "Admin" in the create user page admin for change status
    #Then Verify that the super_admin submit the button should create a new user in the all users page for change status
    #Then Verify that super_admin search button is able to search the user with "kumars.deshmukh@iffort.com" name of user in all users page
    #Then Verify that super_admin should be able change the status of the user in all user page
#
  #@Smoke
  #Scenario: Validate that user is able to log in into the application with active status of the new user of admin
    #Given Verify that super_admin is on the super_admin log in page as expected page title is "Shield" with new created user
    #When Verify that after super_admin enter the super_admin "kumars.deshmukh@iffort.com" into the email user field with new created user
    #When Verify that after super_admin enter the super_admin "Admin@1234" into the password user field with new created user
    #Then Verify that after super_admin entering the valid super_admin credentials into the email and password user is able to click on the sign in button with new created user
    #Then Verify that super_admin is log in super_admin successfully with the expected page tilte "Shield" with new created user
#
  #@Smoke
  #Scenario: Validate that search the user and change status to inactive status of the new user of admin
    #Given Verify that super_admin user is on the users all users page as expected page title "Shield" for change status
    #Then Verify that super_admin search button is able to search the user with "kumars.deshmukh@iffort.com" name of user in all users page
    #Then Verify that super_admin should be able change the status of the user in all user page for new user
#
  #@Smoke
  #Scenario: Validate that user is not able to log in into the application with inactive status of the new user of admin
    #Given Verify that super_admin is on the super_admin log in page as expected page title is "Shield" with new created user
    #When Verify that after super_admin enter the super_admin "kumars.deshmukh@iffort.com" into the email user field with new created user
    #When Verify that after super_admin enter the super_admin "Admin@1234" into the password user field with new created user
    #Then Verify that super_admin is not log in super_admin successfully with the expected page tilte "Shield" with new user
#
  #@Smoke
  #Scenario: Validate that super_admin user deleted the newly created user into application of admin
    #Given Verify that super_admin user is on the users all users page as expected page title "Shield" for change status
    #Then Verify that super_admin search button is able to search the user with "kumars.deshmukh@iffort.com" name of user in all users page
    #Then Verify that super_admin should be able to delete the user from the all users page
    #
    #
    #
    #
    #
    #
    #Email activation test cases pending
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
