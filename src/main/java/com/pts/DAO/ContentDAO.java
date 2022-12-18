package com.pts.DAO;

import com.pts.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContentDAO extends JpaRepository<Content,String> {

}
