package com.dao;


import com.pojo.CreateAccount;
import com.pojo.SignIn;


public interface SignInDAO {

	public boolean signIn(SignIn si);
}
