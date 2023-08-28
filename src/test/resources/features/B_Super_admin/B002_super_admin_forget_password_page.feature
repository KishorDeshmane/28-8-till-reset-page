@Super_admin_forget_password_page
Feature: Validate super admin forget password page functionality

  @Regression
  Scenario: Validate that elements are presence in super admin forget password page
    Given Verify that super admin into the forget password page as expected title "Shield"
    Then Verify that forget password title text should be displayed into the super admin forget password page
    Then Verify that forget password subtitle text should be displayed into the super admin forget password page
    Then Verify that email title text should be displayed into the super admin forget password page
    Then Verify that email user field should be placeholder value as expected "Enter your email address" into the super admin forget password page
    Then Verify that email user field should be clickable into the super admin forget password page
    Then Verify that request reset link should be clickable into the super admin forget password page
    Then Verify that request reset link button be able to mouse hover into the super admin forget password page
    Then Verify that did you remember your password text should be displayed below the request link into the super admin forget password page
    Then Verify that try to sign in link should be clickable into the super admin forget password page
    Then Verify that shield logo should be displayed into the super admin forget password page
    Then Verify that shield subtitle reset your password text should be displayed into the super admin forget password page
    Then Verify that shield subtitle header section text should be displayed into the super admin forget password page



 @Smoke
  Scenario: Validate that request reset link button functionality in super admin forget password log in page
    Given Verify that user is on the super admin log in forget password page as expected page title is "Shield"
    When super admin user enter only valid email and try to click on request set link in into app "ashish.upadhyay@iffort.com" from super admin forget password log in page
    Then Verify that super admin user should get the expected note link has been sent to your email address from super admin forget password log in page
    When user is in the mailtrap inbox page with required credentials of the log in user from super admin forget password log in page
    Then Verify that user should get the mail with subject title is "Reset your password - [Shield]" from super admin forget password log in page
    Then Verify that mail containing link text must be "Reset Password" from super admin forget password log in page
    Then Verify that reset password email link should navigates to the change password page "Shield" from super admin forget password log in page
		


  @Regressions
  Scenario: Validate that email user field in super admin forget password page
    Given Verify that user is on the super admin log in forget password page as expected page title is "Shield"
    When super admin user enter valid email and try to click on request reset link in into application "kd@iffort.co.uk" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter valid email and try to click on request reset link in into application "info@iffort.ifff.com" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter valid email and try to click on request reset link in into application "ashish-upadhyay@iffort.com" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter valid email and try to click on request reset link in into application "ashish+upadhyay@iffort.com" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "abcdefg" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "abcdefg@" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "abcdefg.co.in" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "abcdefg@co.123" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "abcdefg@co" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "abcdefg@@@co" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "@example.com" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "abcsdf@.com" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "abcsd f@co.com" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "Kabc.f@co.com" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "  abcdefg@co.in  " in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "abcdefg@co.in         " in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "          abcdefg@co.in" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "!#$%$#e@example.com" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "!#$%$#e@&^%$.com" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter invalid email and try to click on request reset link in into aplication "!#$%$#e@^%$#.&%^" in super admin forget password log in page
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter 190 characters into the email user field and try to click on request reset link in into the application
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter 100 characters into the email user field and try to click on request reset link in into the application
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page
    When super admin user enter 50 characters into the email user field and try to click on request reset link in into the application
    Then Verify that super admin user should get the expected red tick in email user field in super admin log in page

    