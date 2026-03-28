package com.mycompany.blogmanagement.util;

public class OAuthConstants {
    // Google API Credentials
    public static final String GOOGLE_CLIENT_ID = "YOUR_GOOGLE_CLIENT_ID_HERE";
    public static final String GOOGLE_CLIENT_SECRET = "YOUR_GOOGLE_CLIENT_SECRET_HERE";
    public static final String GOOGLE_REDIRECT_URI = "http://localhost:8080/BlogManagement/login/google/callback";
    public static final String GOOGLE_AUTH_URL = "https://accounts.google.com/o/oauth2/auth";
    public static final String GOOGLE_TOKEN_URL = "https://oauth2.googleapis.com/token";
    public static final String GOOGLE_USER_INFO_URL = "https://www.googleapis.com/oauth2/v1/userinfo?alt=json";

    // Facebook API Credentials
    public static final String FB_CLIENT_ID = "YOUR_FB_CLIENT_ID_HERE";
    public static final String FB_CLIENT_SECRET = "YOUR_FB_CLIENT_SECRET_HERE";
    public static final String FB_REDIRECT_URI = "http://localhost:8080/BlogManagement/login/facebook/callback";
    public static final String FB_AUTH_URL = "https://www.facebook.com/v17.0/dialog/oauth";
    public static final String FB_TOKEN_URL = "https://graph.facebook.com/v17.0/oauth/access_token";
    public static final String FB_USER_INFO_URL = "https://graph.facebook.com/me?fields=id,name,email";
}
