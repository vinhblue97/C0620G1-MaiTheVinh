package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ConvertService;

@Controller
public class MainController {
    @Autowired
    private ConvertService convertService ;

    @GetMapping("/")
    private String homePage(Model model) {
        String type_1 = "0";
        String type_2 = "0";
        model.addAttribute("type_1", type_1);
        model.addAttribute("type_2", type_2);
        return "home_page";
    }

    @PostMapping("/convert")
    private String convertCurrency(@RequestParam String type_1, @RequestParam String currency,
                                   @RequestParam String type_2, ModelMap modelMap) {
        String finalResult = convertService.convert(Double.parseDouble(currency), type_1, type_2);
        modelMap.put("currency", currency);
        modelMap.put("type_1", type_1);
        modelMap.put("type_2", type_2);
        modelMap.put("result", finalResult);
        return "home_page";
    }

}
