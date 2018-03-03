package controls;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
    public String home( Model useModel) {
		useModel.addAttribute("test", "aaaaaa");
        return "index";
    }

}
