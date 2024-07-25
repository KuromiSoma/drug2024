package org.drug.store.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.drug.store.ptuserlist.PtUser;

@Mapper
public interface PtUserMapper  {
	List<PtUser> selectAll();
}
