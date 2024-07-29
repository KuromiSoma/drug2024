package org.drug.store.mapper;

import java.util.List;
import org.drug.store.drlist.DrList;
import org.drug.store.drregister.DrRegister;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DrListMapper {

	List<DrList> selectAll();
	void insert_dr_master(@Param("rec") DrRegister rec);
	
}