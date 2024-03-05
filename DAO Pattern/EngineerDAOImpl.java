package com.journaldev.spring.jdbc.dao;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.journaldev.spring.jdbc.model.Engineer;

public class EngineerDAOImpl implements EngineerDAO {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Engineer engineer) {
        
    }

    @Override
    public Engineer getById(int id) {
        
    }

    @Override
    public void update(Engineer engineer) {
        
    }

    @Override
    public void deleteById(int id) {
        
    }

    @Override
    public List<Engineer> getAll() {
    }

    @Override
    public List<Engineer> getByWorkingHours(int workingHours) {
        String sql = "SELECT * FROM Engineer WHERE working_hours = ?";
        List<Engineer> engineers = jdbcTemplate.query(sql, new Object[] { workingHours }, new BeanPropertyRowMapper<>(Engineer.class));
        return engineers;
    }
}
