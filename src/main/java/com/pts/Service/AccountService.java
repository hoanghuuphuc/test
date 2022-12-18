package com.pts.Service;

import com.pts.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    List<Account>getAdministrators();
}
