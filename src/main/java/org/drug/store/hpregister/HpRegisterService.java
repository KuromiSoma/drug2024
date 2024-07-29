package org.drug.store.hpregister;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.drug.store.hplist.HpList;
import org.drug.store.mapper.HpListMapper;

@Service
@Transactional
public class HpRegisterService {

	@Autowired
	HpListMapper hpListMapper;

	public List<HpList> getHpList(){
		List<HpList> list =hpListMapper.selectAll();
		return list;
	}

	public void insertToroku(HpRegisterForm toroku) {
		HpRegister hpToroku = new HpRegister();

		hpToroku.setHpName(toroku.getHpName());
		hpToroku.setHpAddNo(toroku.getHpAddNo());
		hpToroku.setHpAddName1(toroku.getHpAddName1());
		hpToroku.setHpAddName1(toroku.getHpAddName2());
		hpToroku.setHpAddName1(toroku.getHpAddName2());
		hpToroku.setHpTel(toroku.getHpTel());
		hpToroku.setHpCd(toroku.getHpCd());

		hpListMapper.insert_hp_master(hpToroku);
	}
}