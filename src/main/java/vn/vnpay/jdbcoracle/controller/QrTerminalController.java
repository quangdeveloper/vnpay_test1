package vn.vnpay.jdbcoracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.vnpay.jdbcoracle.dao.QrTerminalDAO;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("")
public class QrTerminalController {


    @Autowired
    private QrTerminalDAO qrTerminalDAO;

    @GetMapping("/qr-terminal")
    public ResponseEntity<Object> findAll() {

        Map map = new HashMap();
        map.put("pi_pageNo", 1);
        map.put("pi_pageSize", 10);

        try {
            return ResponseEntity.ok(qrTerminalDAO.getList(map).get("RS"));
        } catch (CloneNotSupportedException | SQLException exq) {
        }

        return ResponseEntity.ok(null);
    }

}
