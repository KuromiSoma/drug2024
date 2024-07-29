package org.drug.store.drregister;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.drug.store.drlist.DrList;
import org.drug.store.hplist.HpList;
import org.drug.store.kalist.KaList;

@Controller
public class DrRegisterController {

	@Autowired
	private DrRegisterService drRegisterService;

	@RequestMapping(value="/drtoroku", method=RequestMethod.GET)
	String index(Model model) {
		DrRegisterForm drRegisterForm = new DrRegisterForm();
		model.addAttribute("drToroku", drRegisterForm);

		List<HpList> hpList=this.drRegisterService.getHpList();
		model.addAttribute("hpList", hpList);

		List<KaList> kaList=this.drRegisterService.getKaList();
		model.addAttribute("kaList", kaList);

		return "drug/store/drtoroku";
	}

	//登録処理
	@RequestMapping(value="/drtoroku", method = RequestMethod.POST)
	String toroku(Model model, DrRegisterForm drRegisterForm) {
		this.drRegisterService.insertToroku(drRegisterForm);

		List<DrList> list=this.drRegisterService.getDrList();
		model.addAttribute("list", list);

		return "/drlist";

	}
}