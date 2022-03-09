package models;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

import models.Animals;
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

        //Display animal form
        get("endangered-animal/add",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            return new ModelAndView(model,"endangered-animal.hbs");
        },new HandlebarsTemplateEngine());

        //add animal and save
        post("/sighting/animal",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            String animalName = request.queryParams("name");
            model.put("animal",animalName);
            Animals animal = new Animals(animalName);
            animal.save();
            return new ModelAndView(model,"sighting.hbs");
        },new HandlebarsTemplateEngine());

        //add endangered animal
        post("/sighting/endangered",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            String animalName = request.queryParams("name");
            String age = request.queryParams ("age");
            String health = request.queryParams("health");
            System.out.println(age);
            return new ModelAndView(model,"sighting.hbs");
        },new HandlebarsTemplateEngine());
    }


}









