package vn.vnpay.jdbcoracle.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

public class BaseDAO extends JdbcTemplate {


    protected  final String PK_TEST = "PKG_QUANGNV.";

    public BaseDAO getClone() throws CloneNotSupportedException{
        return (BaseDAO) this.clone();
    }

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void setDataSource(){
        this.setDataSource(dataSource);
    }

}
