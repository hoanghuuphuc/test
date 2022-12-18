package com.pts.Service;

import com.pts.entity.Account;
import com.pts.entity.Authority;
import com.pts.entity.Role;

import java.util.List;

public interface AuthorityService {
    List<Role> findRolesByUsername(String username);
    List<Authority> findAuthoritiesOfAdministrators();
    List<Authority>findAll();

    Authority save(Account account);
    Authority create(Authority auth);

    void delete(Integer id);
}
