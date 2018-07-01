package com.example.demo.backend;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {



    public String create(String field1, double field2){
        return "insert in db " +field1+" and " + field2;
    }

    public String read(String field1){
        return "read in db " +field1;
    }

    public String update(String field1){
        return "update in db " +field1;
    }

    public String delete(String field1){
        return "delete in db " +field1;
    }
}
