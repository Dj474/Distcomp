package org.polozkov.controller.secured.login;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2.0/login")
public class LoginController {

    @PostMapping()
    public String login()

}
