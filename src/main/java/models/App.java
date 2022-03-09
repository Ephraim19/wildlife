package models;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

public class App {
    public static void main(String[] args) {
        get("/",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            return new ModelAndView(model,"index.hbs");
        },new HandlebarsTemplateEngine());

        //add animal
        get("/animal/add",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            return new ModelAndView(model,"animal.hbs");
        },new HandlebarsTemplateEngine());

        //add animal
        get("endangered-animal/add",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            return new ModelAndView(model,"endangered-animal.hbs");
        },new HandlebarsTemplateEngine());

        //add sightings
        get("sighting",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            return new ModelAndView(model,"sighting.hbs");
        },new HandlebarsTemplateEngine());
    }


}









