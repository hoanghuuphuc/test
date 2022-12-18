package com.pts.DAO;

import com.pts.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountDAO extends JpaRepository<Account,String> {
    @Query("Select DISTINCT a.account from Authority a")
    public List<Account>getAdministrators();
    List<Account> findAll();
}
