package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
//@RequestMapping
public class SkillsController {
    @RequestMapping(value = "")
    public String skillsTracker() {
        String html = "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>";
        return html;
    }

    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String userFavsForm(){
        String html = "<form method='post' action = '/formSubmitted'>" +
                "Name:<br>" +
                "<input type='text' name='name'>" +
                "<br>My favorite language:<br>" +
                "<select name ='language'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select>" +
                "<br>My second favorite language:<br>" +
                "<select name ='language2'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select>" +
                "<br>My third favorite language:<br>" +
                "<select name ='language3'>" +
                "<option value = 'Java'> Java </option>" +
                "<option value = 'JavaScript'> JavaScript </option>" +
                "<option value = 'Python'> Python </option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "<form>";

        return html;
    }

    @RequestMapping(value= "formSubmitted", method = RequestMethod.POST)
    public String namePage(@RequestParam  String name, @RequestParam String language, @RequestParam String language2, @RequestParam String language3) {

        String html = "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>";

        return html;
    }

}
