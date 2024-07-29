package org.drug.store.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import org.drug.store.kalist.KaList;
import org.drug.store.karegister.KaRegister;

@Mapper
public interface KaListMapper {

	List<KaList> selectAll();
	
	void insert_ka_master(@Param("rec") KaRegister rec);
	
}