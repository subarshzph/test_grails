package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDAO {
    public String getURL(String URL) {
        return URL.substring(0, 4).replace("http","https");
    }
}
