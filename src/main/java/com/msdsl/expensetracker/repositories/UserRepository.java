package com.msdsl.expensetracker.repositories;

import com.msdsl.expensetracker.domain.User;
import com.msdsl.expensetracker.exceptions.EtAuthException;

public interface UserRepository {
	Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
