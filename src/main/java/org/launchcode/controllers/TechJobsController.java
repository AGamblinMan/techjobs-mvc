package org.launchcode.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

/**
 * Created by Adam on 3/23/2017.
 */

public class TechJobsController {
    private static HashMap<String, String> actionChoices = new HashMap<>();
    private static HashMap<String, String> columnChoices = new HashMap<>();

    public TechJobsController(){
        columnChoices.put("core competency", "Skill");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("position type", "Position Type");
        columnChoices.put("all", "All");
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");
    }
    @ModelAttribute("actions")
    public static HashMap<String, String> getActionChoices(){
        return actionChoices;
    }
    @ModelAttribute("columns")
    public static HashMap<String, String> getColumnChoices(){
        return columnChoices;
    }
}
