package com.pts.ServiceImpl;

import com.pts.DAO.AccountDAO;
import com.pts.DAO.AuthorityDao;
import com.pts.Service.AuthorityService;
import com.pts.entity.Account;
import com.pts.entity.Authority;
import com.pts.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    AuthorityDao authDao;
    @Autowired
    AccountDAO daoA;


    @Override
    public List<Role> findRolesByUsername(String username) {
        return authDao.findRolesByUsername(username);
    }

    @Override
    public List<Authority> findAuthoritiesOfAdministrators() {
        List<Account>accounts=daoA.getAdministrators();
        return authDao.findAuthoritiesOfAdministrators(accounts);
    }

    @Override
    public List<Authority> findAll() {
        return authDao.findAll();
    }

    @Override
    public Authority save(Account account) {
        Authority auth= new Authority();
        Role role = new Role();
        auth.setAccount(account);
        role.setTps_Id("USER");
        auth.setRole(role);
        return authDao.save(auth);
    }

    @Override
    public Authority create(Authority auth) {
        return authDao.save(auth);
    }

    @Override
    public void delete(Integer id) {
        authDao.deleteById(id);
    }
}

