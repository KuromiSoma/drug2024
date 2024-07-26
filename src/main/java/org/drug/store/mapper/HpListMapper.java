package org.drug.store.mapper;


import java.util.List;
import org.drug.store.hplist.HpList;
import org.drug.store.hpregister.HpRegister;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HpListMapper {
	List<hplist> selectAll();
	void insert_hp_master(HpRegister toroku);
}
