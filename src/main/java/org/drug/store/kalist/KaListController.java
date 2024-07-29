package org.drug.store.kalist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KaListController {

	@Autowired
	private KaListService kaListService;

	@RequestMapping(path="/kalist", method=RequestMethod.GET)
		public String index(Model model) {
		List<KaList> list=this.kaListService.getKaList();
		model.addAttribute("list", list);
		return "drug/store/kalist";
	}

}