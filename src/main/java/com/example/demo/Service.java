package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private Dao dao;

    public String create(String field1, double field2) {

        return dao.create(field1,field2);
    }

    public String read(String filed1) {
        return dao.read(filed1);
    }

    public String update(String field1) {
        return dao.update(field1);
    }

    public String delete(String field1) {
        return dao.delete(field1);
    }


}
