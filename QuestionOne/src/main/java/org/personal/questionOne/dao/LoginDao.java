package org.personal.questionOne.dao;

import org.personal.questionOne.modal.Login;

import java.sql.SQLException;

public interface LoginDao {
    Login findOne(Login login);
}
