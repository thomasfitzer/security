/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Thomas
 */

@Controller
public class ContentController {

    @GetMapping("/content")
    public String displayContentPage() {
        return "content";
    }    
}
