package org.drug.store.ptuketukeregister;

import java.util.List;

import org.drug.store.common.PtGenderEnum;
import org.drug.store.ptuserlist.PtUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PtUketukeRegisterController {

	@Autowired
	private PtUketukeRegisterService ptUketukeRegisterService;

	@RequestMapping(path = "/ptuketuke", method = RequestMethod.GET)
	String index(Model model) {
		PtUketukeRegisterForm ptUketukeRegisterForm = new PtUketukeRegisterForm();
		model.addAttribute("uketuke",ptUketukeRegisterForm);
		model.addAttribute("ptGenderEnums",PtGenderEnum.values());
	    return "drug/store/ptuketuke";
	}

	@RequestMapping(path = "/ptuketuke", method = RequestMethod.POST)
	String uketuke(Model model, PtUketukeRegisterForm ptUketukeRegisterForm) {
		//登録
		this.ptUketukeRegisterService.insertUketuke(ptUketukeRegisterForm);

		//再検索
		List<PtUser> list = this.ptUketukeRegisterService.getUserList();
	    model.addAttribute("list", list);

	    return "drug/store/ptuserlist";
	}

}