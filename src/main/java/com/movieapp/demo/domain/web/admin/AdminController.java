package com.movieapp.demo.domain.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class AdminController {

    @GetMapping("/admin")
    public String getAdminPanel() {
        return "admin/admin";
    }
}
