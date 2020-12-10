package vn.vnpay.jdbcoracle.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import vn.vnpay.jdbcoracle.dao.QrTerminalDAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Component
public class QrTerminalDAOImpl extends BaseDAO implements QrTerminalDAO {
    @Override
    public Map getList() {
        return null;
    }

    //    @Override
//    public Map getList() throws SQLException, CloneNotSupportedException{
//
//        return this.getClone().ca(PK_TEST + "get_admin_list", inParams);
//    }
}