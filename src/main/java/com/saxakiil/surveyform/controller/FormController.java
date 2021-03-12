package com.saxakiil.surveyform.controller;

import com.saxakiil.surveyform.model.Form;
import com.saxakiil.surveyform.service.QuestionCardService;
import com.saxakiil.surveyform.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/forms")
public class FormController {

    private final QuestionCardService questionCardService;
    private final FormService formService;

    @Autowired
    public FormController(QuestionCardService questionCardService, FormService formService) {
        this.questionCardService = questionCardService;
        this.formService = formService;
    }

    @GetMapping("/getFormById")
    public Form getForms(@RequestParam String id) {
        return formService.findById(id);
    }

    @GetMapping("/getForms")
    public List<Form> getForm() {
        return formService.findAll();
    }

    @PostMapping("/updateForm")
    public void updateForm(@RequestParam String id, @RequestParam Form newForm) {
        formService.updateById(id,newForm);
    }

    @DeleteMapping("/deleteForm")
    public void deleteForm(@RequestParam String id) {
        formService.deleteById(id);
    }
}
