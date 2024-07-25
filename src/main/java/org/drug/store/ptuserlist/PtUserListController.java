package org.drug.store.ptuserlist;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.drug.store.ptuserlist.PtUser;

@Controller
public class PtUserListController {

	@Autowired
	private PtUserListService ptUserListService;

	@RequestMapping(path = "/ptuserlist", method = RequestMethod.GET)
	String index(Model model) {
		List<PtUser> list = this.ptUserListService.getUserList();
	    model.addAttribute("list", list);
	    return "drug/store/ptuserlist";
	}
}