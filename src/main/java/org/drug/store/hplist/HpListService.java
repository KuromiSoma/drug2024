package org.drug.store.hplist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.drug.store.mapper.HpListMapper;

@Transactional
@Service
public class HpListService {

	@Autowired
	HpListMapper hpListMapper;

	public List<HpList> getHpList(){
		List<HpList> hpList = hpListMapper.selectAll();
		return hpList;
	}

}