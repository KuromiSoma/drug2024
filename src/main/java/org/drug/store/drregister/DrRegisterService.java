package org.drug.store.drregister;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.drug.store.drlist.DrList;
import org.drug.store.hplist.HpList;
import org.drug.store.kalist.KaList;
import org.drug.store.mapper.DrListMapper;
import org.drug.store.mapper.HpListMapper;
import org.drug.store.mapper.KaListMapper;

@Service
@Transactional
public class DrRegisterService {

	@Autowired
	private DrListMapper drListMapper;

	public List<DrList> getDrList(){
	List<DrList> list =drListMapper.selectAll();
	return list;
	}

	public void insertToroku(DrRegisterForm toroku) {
		DrRegister drToroku=new DrRegister();

		drToroku.setDrName(toroku.getDrName());
		drToroku.setHpNo(toroku.getHpNo());
		drToroku.setKaNo(toroku.getKaNo());

		drListMapper.insert_dr_master(drToroku);
	}

	@Autowired
	private HpListMapper hpListMapper;

	public List<HpList> getHpList(){
		List<HpList> list= hpListMapper.selectAll();
		return list;
	}

	@Autowired
	private KaListMapper kaListMapper;

	public List<KaList> getKaList(){
	List<KaList> list=kaListMapper.selectAll();
	return list;
	}

}