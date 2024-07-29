package org.drug.store.karegister;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.drug.store.kalist.KaList;

@Controller
public class KaRegisterController {

	@Autowired
	private KaRegisterService kaRegisterService;

	@RequestMapping(value="/katoroku", method=RequestMethod.GET)
	String index(Model model) {
		KaRegisterForm kaRegisterForm= new KaRegisterForm();
		model.addAttribute("kaToroku", kaRegisterForm);

		return "drug/store/katoroku";
	}

	@RequestMapping(value="/katoroku", method=RequestMethod.POST)
	String toroku(Model model, KaRegisterForm kaRegisterForm) {
		//登録
		this.kaRegisterService.insertToroku(kaRegisterForm);
		//再検索して一覧表示
		List<KaList> list=this.kaRegisterService.getKaList();
		model.addAttribute("list", list);

		return "drug/store/kalist";
	}
}