package org.drug.store.hpregister;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.drug.store.hplist.HpList;

@Controller
public class HpRegisterController {

	@Autowired
	private HpRegisterService hpRegisterService;

	@RequestMapping(path ="/hptoroku", method = RequestMethod.GET)
	String index(Model model) {
		HpRegisterForm hpRegisterForm = new HpRegisterForm();
		model.addAttribute("hpToroku", hpRegisterForm);
		return "drug/store/hptoroku";
	}

	@RequestMapping(path="/hptoroku", method = RequestMethod.POST)
	String toroku(Model model, HpRegisterForm hpRegisterForm) {
		//登録
		this.hpRegisterService.insertToroku(hpRegisterForm);
		//再検索
		List<HpList> list = this.hpRegisterService.getHpList();
		model.addAttribute("list", list);

		return "drug/store/hplist";
	}

}