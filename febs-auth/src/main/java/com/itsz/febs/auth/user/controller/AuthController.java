package com.itsz.febs.auth.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@RestController
public class AuthController {

    @Autowired
    private ConsumerTokenServices consumerTokenServices;


    @GetMapping("oauth/test")
    public String testOauth() {
        return "oauth";
    }

    @GetMapping("user")
    public Principal currentUser(Principal principal) {
        return principal;
    }

    @DeleteMapping("signout")
    public void signout(HttpServletRequest request)   {
        String authorization = request.getHeader("Authorization");
        String token = StringUtils.replace(authorization, "bearer ", "");
       consumerTokenServices.revokeToken(token);
    }
}
