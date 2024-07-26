package org.drug.store.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.drug.store.ptuketukelist.PtUketuke;
import org.drug.store.ptuketukeregister.PtUketukeRegister;

@Mapper
public interface PtUketukeMapper  {
	List<PtUketuke> selectAll();

	void insert_pt_tran(PtUketukeRegister uketuke); 
}