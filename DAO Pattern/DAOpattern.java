package com.journaldev.spring.jdbc.dao;

import java.util.List;
import com.journaldev.spring.jdbc.model.Engineer;

public interface EngineerDAO {

    public void save(Engineer engineer);

    public Engineer getById(int id);

    public void update(Engineer engineer);

    public void deleteById(int id);

    public List<Engineer> getAll();

    public List<Engineer> getByWorkingHours(int workingHours);
}
