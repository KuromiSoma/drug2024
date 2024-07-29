package org.drug.store.drlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.drug.store.drlist.DrList;

@Controller
public class DrListController {

	@Autowired
	private DrListService drListService;

	@RequestMapping(path="/drlist", method = RequestMethod.GET)
	public String index(Model model) {
		List<DrList> list = this.drListService.getDrList();
		model.addAttribute("list", list);
		return "drug/store/drlist";
	}

}