package org.launchcode.controllers;

import org.launchcode.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController extends TechJobsController{

    @RequestMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", ListController.columnChoices);
        return "search";
    }


    @RequestMapping(value = "/results")
    public String results(Model model, @RequestParam String searchTerm, @RequestParam String searchType) {

        if (searchType.equals("all")){
            ArrayList<HashMap<String, String>> jobs = JobData.findByValue(searchTerm);
          //  if(!jobs.isEmpty()) {
                model.addAttribute("jobs", jobs);
                model.addAttribute("searchType", searchType);
           // }
            model.addAttribute("columns", ListController.columnChoices);
            return "search";
        }
        else{
            ArrayList<HashMap<String, String>> jobs = JobData.findByColumnAndValue(searchType,searchTerm);
           // if(!jobs.isEmpty()) {
                model.addAttribute("jobs", jobs);
                model.addAttribute("searchType", searchType);
           // }
            model.addAttribute("columns", ListController.columnChoices);
            return "search";
        }
    }
}

