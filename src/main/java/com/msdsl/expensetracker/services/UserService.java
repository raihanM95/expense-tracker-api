package com.msdsl.expensetracker.services;

import com.msdsl.expensetracker.domain.User;
import com.msdsl.expensetracker.exceptions.EtAuthException;

public interface UserService {
	User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
