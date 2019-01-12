package com.example.shahajalal.takemessagefromgmailimap;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;



public class PreferenceUtils {

	public static final String USERNAME = "user";
	public static final String PASSWORD = "password";
	public static final String NICKNAME = "nickname";
	public static final String SERVER_ADDRESS = "server_address";
	public static final String TOKEN = "token";

	public static final String EMAIL = "email";
	public static final String IMAGE = "image";
	public static final String AUTOTEXT = "autotext";

	public static final String AWS_SERVER_IP = "198.100.145.200";

	public static void setLoginUser(Context context, String user, String password, String nickname) {
//		String encryptedUser = AESEncryption.encrypt(context, user);
//		String encryptedPassword = AESEncryption.encrypt(context, password);
		getSharedPreferences(context).edit().putString(USERNAME, user).putString(PASSWORD, password)
				.putString(NICKNAME, nickname).commit();
	}


	public static void setatuoremember (Context context, String email){
		getSharedPreferences(context).edit().putString(AUTOTEXT, email).commit();
	}
	public static String getautoremember(Context context) {
		return getSharedPreferences(context).getString(AUTOTEXT, "");
	}

	public static void setTokenUser(Context context, String token){
		getSharedPreferences(context).edit().putString(TOKEN, token).commit();
	}
	public static void setEmail (Context context, String email){
		getSharedPreferences(context).edit().putString(EMAIL, email).commit();
	}
	public static void setImage (Context context, String image){
		getSharedPreferences(context).edit().putString(IMAGE, image).commit();
	}
	public static void setNickname (Context context, String image){
		getSharedPreferences(context).edit().putString(NICKNAME, image).commit();
	}
	public static void setLogIn(Context context){
		getSharedPreferences(context).edit().putBoolean("LOGIN", true).commit();
	}
	public static boolean getLogin(Context context) {
		boolean userLogin = getSharedPreferences(context).getBoolean("LOGIN", false);
		return userLogin;
	}


	public static void setLogOut(Context context){
		getSharedPreferences(context).edit().putBoolean("LOGIN", false).commit();
	}
	public static void setUserData(Context context, String data){
		getSharedPreferences(context).edit().putString("DATA", data).commit();
	}
	public static void setUserId(Context context, String userId){
		getSharedPreferences(context).edit().putString("USER_ID", userId).commit();
	}

	public static void setCompanyId(Context context, String userId){
		getSharedPreferences(context).edit().putString("FB_ID", userId).commit();
	}
	public static String getCompanyId(Context context) {
		return getSharedPreferences(context).getString("FB_ID", "");
	}



	public static void setUserEmailId(Context context, String userId){
		getSharedPreferences(context).edit().putString("USER_EMAIL_ID", userId).commit();
	}


	public static void setBaseUrl(Context context, String distance){
		getSharedPreferences(context).edit().putString("url", distance).commit();
	}



	public static void setPassword(Context context, String password){
		getSharedPreferences(context).edit().putString(PASSWORD, password).commit();
	}


	public static String getUser(Context context) {
		String encryptedUser = getSharedPreferences(context).getString(USERNAME, null);
		return encryptedUser != null ? encryptedUser : null;
	}

	public static String getEmail(Context context) {
		return getSharedPreferences(context).getString(EMAIL, "");
	}
	public static String getImage(Context context) {
		return getSharedPreferences(context).getString(IMAGE, "");
	}

	public static String getPassword(Context context) {
		String encryptedPassword = getSharedPreferences(context).getString(PASSWORD, null);
		return encryptedPassword != null ? encryptedPassword : "";
	}

	public static String getNickname(Context context) {
		return getSharedPreferences(context).getString(NICKNAME, "");
	}

	public static String getServerHost(Context context) {
		String serverHost = getSharedPreferences(context).getString(SERVER_ADDRESS, null);
		return serverHost == null ? AWS_SERVER_IP : serverHost;
	}

	public static String getToken(Context context) {
		String userToken = getSharedPreferences(context).getString(TOKEN, null);
		return userToken == null ? null : userToken;
	}





	public static String getUserData(Context context) {
		String  userData = getSharedPreferences(context).getString("DATA", "");
		return userData;
	}
	public static String getUserId(Context context) {
		String  user_id = getSharedPreferences(context).getString("USER_ID", "");
		return user_id;
	}

	public static String getUserEmailId(Context context) {
		String  user_id = getSharedPreferences(context).getString("USER_EMAIL_ID", "");
		return user_id;
	}


	public static void setUserType(Context context, String price){
		getSharedPreferences(context).edit().putString("USER_TYPE", price).commit();
	}
	public static String  getUserType(Context context) {
		String  price = getSharedPreferences(context).getString("USER_TYPE", "");
		return price;
	}


	public static void setFirst(Context context, String address1){
		getSharedPreferences(context).edit().putString("address1", address1).commit();
	}
	public static String  getFirst(Context context) {
		String  price = getSharedPreferences(context).getString("address1", "");
		return price;
	}




	public static void setDeviceToken(Context context, String address2){
		getSharedPreferences(context).edit().putString("device_token", address2).commit();
	}
	public static String  getDeviceToken(Context context) {
		String  price = getSharedPreferences(context).getString("device_token", "");
		return price;
	}


	public static void setVpnAddress(Context context, String city){
		getSharedPreferences(context).edit().putString("vpn_address", city).commit();
	}
	public static String  getVpnAddress(Context context) {
		String  price = getSharedPreferences(context).getString("vpn_address", "");
		return price;
	}


	public static void setState(Context context, String state){
		getSharedPreferences(context).edit().putString("state", state).commit();
	}
	public static String  getState(Context context) {
		String  price = getSharedPreferences(context).getString("state", "");
		return price;
	}

	public static void setDate(Context context, String pincode){
		getSharedPreferences(context).edit().putString("date", pincode).commit();
	}
	public static String  getDate(Context context) {
		String  price = getSharedPreferences(context).getString("date", "");
		return price;
	}

	/*public static String  getBaseUrl(Context context) {
		String  price = getSharedPreferences(context).getString("url", context.getResources().getString(R.string.custom_header));
		return price;
	}*/







	public static SharedPreferences getSharedPreferences(Context context) {
		return PreferenceManager.getDefaultSharedPreferences(context);
	}



	public static void setChecked(Context context, boolean flag){
		getSharedPreferences(context).edit().putBoolean("checked", flag).commit();
	}

	public static boolean getChecked(Context context){
		return getSharedPreferences(context).getBoolean("checked", false);
	}




}