package com.demo.dao;

import org.grails.web.json.JSONArray;
import org.grails.web.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HomeDao extends BaseDAO implements IHome{

    BaseDAO baseDAO;

    @Autowired
    protected JdbcTemplate mainDataSourceTemplate;

    @Override
    public String findName() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM relation;");

        JSONArray json_array = new JSONArray();

        RowMapper<String> mapper = new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                System.out.println(rs.getString("name"));
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("name", rs.getString("name"));
                json_array.add(jsonObject);
                return null;
            }
        };

        mainDataSourceTemplate.query(sql.toString(), mapper);
        JSONObject root_json = new JSONObject();
        root_json.put("data", json_array);
        return String.valueOf(root_json);
    }

    public String fetchURL(String url) {
        return baseDAO.getURL(url);
    }


}
