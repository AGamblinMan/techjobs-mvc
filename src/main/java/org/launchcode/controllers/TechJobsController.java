package org.launchcode.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

/**
 * Created by Adam on 3/23/2017.
 */

public class TechJobsController {
    private static HashMap<String, String> actionChoices = new HashMap<>();

    public TechJobsController(){
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");
    }
    @ModelAttribute("actions")
    public static HashMap<String, String> getActionChoices(){
        return actionChoices;
    }
}
