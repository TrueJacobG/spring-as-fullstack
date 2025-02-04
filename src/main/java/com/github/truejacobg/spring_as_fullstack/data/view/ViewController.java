package com.github.truejacobg.spring_as_fullstack.data.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/view/data")
class ViewController {

    @RequestMapping("/htmx")
    String getHtmx() {
        return "data/htmx";
    }

    @RequestMapping("/alpinejs")
    String getAlpinJs() {
        return "data/alpinejs";
    }

    @RequestMapping
    String getData() {
        return "data/index";
    }

    @RequestMapping("/{id}")
    ModelAndView getDataById(@PathVariable String id) {
        var model = new ModelAndView("data/data");
        model.addObject(id);
        return model;
    }
}
