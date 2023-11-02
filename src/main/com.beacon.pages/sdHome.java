package com.beacon.pages;

public class sdHome {
    //URLs
    public static String SD_URL = "https://www.saucedemo.com/";

    //Fields
    public static String SD_USERNAME_FIELD = "//input[@id='user-name']";
    public static String SD_PWD_FIELD = "//input[@id='password']";

    //Users
    public static String SD_VALID_USER = "standard_user";
    public static String SD_INVALID_USER = "Nanashi Mumei";
    public static String SD_LOCKED_USER = "locked_out_user";

    //Passwords
    public static String SD_VALID_PWD = "secret_sauce";

    //Buttons
    public static String SD_LOGIN_BUTTON = "//input[@id='login-button']";

    //Logos
    public static String SD_SWAG_LOGO = "//div[@class='app_logo' and text()='Swag Labs']";

    //Message
    public static String SD_INVALID_ERROR = "//h3[@data-test='error' and text()='Epic sadface: Username and password do not match any user in this service']";
    public static String SD_LOCKED_ERROR = "//h3[@data-test='error' and text()='Epic sadface: Sorry, this user has been locked out.']";
}
