package vn.vnpay.jdbcoracle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.vnpay.jdbcoracle.dao.QrTerminalDAO;

@RestController
@RequestMapping("")
public class QrTerminalController {


    @Autowired
    private QrTerminalDAO qrTerminalDAO;

    @GetMapping("/qr-terminal")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(qrTerminalDAO.getList());
    }

}
