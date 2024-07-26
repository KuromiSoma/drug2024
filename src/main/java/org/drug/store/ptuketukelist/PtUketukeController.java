package org.drug.store.ptuketukelist;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PtUketukeController {

	@Autowired
	private PtUketukeService ptuketukeService;

	@RequestMapping(path = "/ptuketukelist", method = RequestMethod.GET)
	String index(Model model) {
		List<PtUketuke> list = this.ptuketukeService.getUketukeList();
	    model.addAttribute("list", list);
	    return "drug/store/ptuketukelist";
	}

}