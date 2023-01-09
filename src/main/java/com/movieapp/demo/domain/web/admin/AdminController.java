package com.movieapp.demo.domain.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <h1>@Controller AdminController</h1>
 * The program implements an AdminController
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author  Krzysztof Ksiazek
 * @author  Daniel Sikora
 * @author  Adrian Ciochon
 * @version 1.0
 * @since   2022-11-04
 */
@Controller
class AdminController {
    public static final String NOTIFICATION_ATTRIBUTE = "notification";

    /**
     * getAdminPanel method
     * @return String
     */
    @GetMapping("/admin")
    public String getAdminPanel() {
        return "admin/admin";
    }
}