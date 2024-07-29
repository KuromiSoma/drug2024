package org.drug.store.karegister;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.drug.store.mapper.KaListMapper;
import org.drug.store.kalist.KaList;

@Service
@Transactional
public class KaRegisterService {

	@Autowired
	KaListMapper kaListMapper;

	public List<KaList> getKaList(){
	List<KaList> list=kaListMapper.selectAll();
	return list;
	}

	public void insertToroku(KaRegisterForm toroku) {
		KaRegister kaToroku = new KaRegister();

		kaToroku.setKaName(toroku.getKaName());

		kaListMapper.insert_ka_master(kaToroku);

	}

}