package org.drug.store.kalist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.drug.store.mapper.KaListMapper;

@Service
@Transactional
public class KaListService {

	@Autowired
	KaListMapper kaListMapper;

	public List<KaList> getKaList(){
		List<KaList> kaList=kaListMapper.selectAll();
		return kaList;
	}

}