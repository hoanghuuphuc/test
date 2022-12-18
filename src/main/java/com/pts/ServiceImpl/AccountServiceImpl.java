package com.pts.ServiceImpl;

import com.pts.DAO.AccountDAO;
import com.pts.Service.AccountService;
import com.pts.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDAO adao;

    @Override
    public List<Account> findAll() {
        return adao.findAll();
    }

    @Override
    public List<Account> getAdministrators() {
        return adao.getAdministrators();
    }
}
