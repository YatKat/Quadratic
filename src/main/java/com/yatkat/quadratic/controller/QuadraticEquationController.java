package com.yatkat.quadratic.controller;

import com.yatkat.quadratic.dto.EquationModelDtoInput;
import com.yatkat.quadratic.dto.EquationModelDtoOutput;
import com.yatkat.quadratic.util.UtilDto;
import com.yatkat.quadratic.model.QuadraticEquationModel;
import com.yatkat.quadratic.service.ComputeEquation;
import com.yatkat.quadratic.service.IQuadraticEquationService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
@Log4j2
public class QuadraticEquationController {

    private IQuadraticEquationService service;

    @Autowired
    public QuadraticEquationController(IQuadraticEquationService service) {
        this.service = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getInfoPage() {
        return "info";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String getResult(@ModelAttribute("input") EquationModelDtoInput input, ModelMap map) {
        EquationModelDtoOutput output;
        if (input.getA() == 0) {
            return "wrongInput";
        }
        QuadraticEquationModel model = UtilDto.convertInputToModel(input);
        model = ComputeEquation.compute(model.getA(), model.getB(), model.getC());
        service.saveToDB(model);
        log.info("Info saved to DB");
        if (model.getRoot1() == null && model.getRoot2() == null) {
            return "noRoots";
        } else if (model.getRoot2() == null) {
            output = UtilDto.convertToOutput(model);
            map.put("output", output);
            return "oneRoot";
        } else {
            output = UtilDto.convertToOutput(model);
            map.put("output", output);
        }
        return "result";
    }
}
