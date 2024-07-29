package org.drug.store.hplist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HpListController {

	@Autowired
	private HpListService hpListService;

	@RequestMapping(path="/hplist", method = RequestMethod.GET)
		public String index(Model model) {
		List<HpList> list = this.hpListService.getHpList();
		model.addAttribute("list", list);
		return "drug/store/hplist";
	}

}