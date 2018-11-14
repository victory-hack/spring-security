package com.javasampleapproach.springsecurity.authenticationhandler.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
 
@Controller
public class WebController {
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
  
    @RequestMapping(value={"/","home"})
        public String home(){
            return "home";
        }
  
    @RequestMapping(value="/user")
    public String user(){
        return "user";
    }
 
    @RequestMapping(value="/admin")
    public String admin(){
        return "admin";
    }
  
    @RequestMapping(value="/login")
    public String login(){
        return "login";
    }
  
    @RequestMapping(value="/403")
    public String Error403(){
        return "403";
    }
    
    /**
     * Each time the "{@code /}" URL is called, increment the hit counter
     * and indicate that the "{@code index.html}" page should be returned.
     *
     * @param httpSession The current session
     * @return The view to render, in MVC terms.
     */
    @RequestMapping(value = "/session")
    public String index(HttpSession httpSession) {

        Integer hits = (Integer) httpSession.getAttribute("hits");

        LOGGER.info("index() called, hits was '{}', session id '{}'", hits, httpSession.getId());

        if (hits == null) {
            hits = 0;
        }

        httpSession.setAttribute("hits", ++hits);

        return "index";
    }
}
