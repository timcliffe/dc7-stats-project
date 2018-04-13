package org.launchcode.dc7statsproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TheFatController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("nation", nation.Dao.findAll());
        model.addAttribute("title", "My Country");

        return "index";
    }
}
