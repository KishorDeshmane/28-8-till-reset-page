#@Admin_change_status_function
#Feature: Validate admin all user action options change status functionality
#
  #@Smoke
  #Scenario: Validate that elemetnts are presents from admin change status in action options pop up
    #Given Verify that admin user is on the users all users actions options change status page as expected page title "Shield"
    #When user click on the change status button from the admin dashboard all users actions option button
    #Then Verify that the pop up should be displayed in the admin dashbaord all users actions option button
    #Then Verify that the pop up title change status of the user should be displayed in admin dashbaord all users actions options button
    #Then Verify that the pop up cross button should be clickable in admin dashboard all users actions options button
    #Then Verify that the pop up switch button should be clickable in the admin dashboard all users actions options button
    #Then Verify that the pop up switch button side text should be displayed in the admin dashboard all users actions options button
    #Then Verify that the pop up switch button side text active or inactive is displayed in the admin dashboard all users actions button
    #Then Verify that the pop up submit mouse hover is possible in the admin dashboard all users actions button
    #Then Verify that the pop up cancel button mouse hover is possible in the admin dashboard all users actions options button
    #Then Verify that the pop up close button should be close the pop up in the admin dashboard all users users actions button
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that working of an cross button from admin change status in action options pop up
    #Given Verify that admin user is on the users all users actions options change status page as expected page title "Shield"
    #When user click on the change status button from the admin dashboard all users actions option button
    #Then Verify that the pop up cross button click as expected pop up is not displayed in admin dashboard all users actions options button
#
#
#
#
#
#
  # admin user test cases
#
#
#
#
#
  #@Smoke
  #Scenario: Validate that created a new user and change the status to active of the new user as admin
    #Given Verify that admin is on the admin dashboard users all users create user page as expected page title "Shield" for change status
    #Then Verify that admin enter the first name as "Kumars" in create user page for change status
    #Then Verify that admin enter the last name as  "Deshmukh" in create user page for change status
    #Then Verify that admin enter the email as "kumars.deshmukh@iffort.com" in create user page for change status
    #Then Verify that admin select the country code "UAE" in create user page for change status
    #Then Verify that admin enter the mobile number as "987654321" in create user page for change status
    #Then Verify that admin enter date of birth as "10/10/1925" in the create user page for change status
    #Then Verify that admin send the profile image as jpg in create user page for change status
    #Then Verify that admin select the gender as male from the radio button in create user page for change status
    #Then Verify that admin enter password as "Admin@1234" in the create user page for change status
    #Then Verify that admin enter comfirmed password as same as "Admin@1234" in the create user page for change status
    #Then Verify that admin select the assigned role as "Admin" in the create user page admin for change status
    #Then Verify that the admin submit the button should create a new user in the all users page for change status
    #Then Verify that admin search button is able to search the user with "kumars.deshmukh@iffort.com" name of user in all users page for change status
    #Then Verify that admin should be able change the status of the user in all user page for change status
#
  #@Smoke
  #Scenario: Validate that user is able to log in into the application with active status of the new user of admin
    #Given Verify that admin is on the admin log in page as expected page title is "Shield" with new created user
    #When Verify that after admin enter the admin "kumars.deshmukh@iffort.com" into the email user field with new created user
    #When Verify that after admin enter the admin "Admin@1234" into the password user field with new created user
    #Then Verify that after admin entering the valid admin credentials into the email and password user is able to click on the sign in button with new created user
    #Then Verify that admin is log in admin successfully with the expected page tilte "Shield" with new created user
#
  #@Smoke
  #Scenario: Validate that search the user and change status to inactive status of the new user of admin
    #Given Verify that admin user is on the users all users page as expected page title "Shield" for change status
    #Then Verify that admin search button is able to search the user with "kumars.deshmukh@iffort.com" name of user in all users page for change status
    #Then Verify that admin should be able change the status of the user in all user page for new user
#
  #@Smoke
  #Scenario: Validate that user is not able to log in into the application with inactive status of the new user of admin
    #Given Verify that admin is on the admin log in page as expected page title is "Shield" with new created user
    #When Verify that after admin enter the admin "kumars.deshmukh@iffort.com" into the email user field with new created user
    #When Verify that after admin enter the admin "Admin@1234" into the password user field with new created user
    #Then Verify that admin is not log in admin successfully with the expected page tilte "Shield" with new user
#
  #@Smoke
  #Scenario: Validate that admin user deleted the newly created user into application of admin
    #Given Verify that admin user is on the users all users page as expected page title "Shield" for change status
    #Then Verify that admin search button is able to search the user with "kumars.deshmukh@iffort.com" name of user in all users page
    #Then Verify that admin should be able to delete the user from the all users page
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
