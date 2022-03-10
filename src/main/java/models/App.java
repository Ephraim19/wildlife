package models;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;
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

        //Add sightings
        post("/new/sighting",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();

            String animalId = request.queryParams("animal");
            String location = request.queryParams ("loc");
            String ranger = request.queryParams("name");
            Sightings sight = new Sightings(animalId,location,ranger);
            sight.save();
            return new ModelAndView(model,"success.hbs");
        },new HandlebarsTemplateEngine());

        //add endangered animals and save
        post("/sighting/endangered",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            String animalName = request.queryParams("name");
            String age = request.queryParams ("age");
            String health = request.queryParams("health");

            EndageredAnimals animal = new EndageredAnimals(animalName,age,health);
            animal.save();
            //get all endangered animals
            model.put("animals",Animals.all());
            System.out.println(EndageredAnimals.all());
            return new ModelAndView(model,"endangeredSightings.hbs");
        },new HandlebarsTemplateEngine());

        //add animal and save
        post("/sighting/animal",(request, response) -> {
            Map<String,Object> model=new HashMap<String, Object>();
            String animalName = request.queryParams("name");
            //model.put("animal",animalName);
            Animals animal = new Animals(animalName);
            animal.save();
            //get all animals
            model.put("animals",Animals.all());
            return new ModelAndView(model,"sighting.hbs");
        },new HandlebarsTemplateEngine());






    }


}









