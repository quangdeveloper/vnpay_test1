package vn.vnpay.jdbcoracle.dao.impl;

import org.springframework.stereotype.Component;
import vn.vnpay.jdbcoracle.dao.QrTerminalDAO;
import java.sql.SQLException;

import java.util.Map;

@Component
public class QrTerminalDAOImpl extends BaseDAO implements QrTerminalDAO {

    @Override
    public Map getList(Map inParams) throws SQLException, CloneNotSupportedException {

        return this.getClone().callFunction(PK_TEST + "GET_LIST", inParams);
    }

}