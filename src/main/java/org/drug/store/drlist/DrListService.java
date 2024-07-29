package org.drug.store.drlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.drug.store.mapper.DrListMapper;
import org.drug.store.drlist.DrList;

@Transactional
@Service
public class DrListService {

	@Autowired
	DrListMapper drListMapper;

	public List<DrList> getDrList(){
		List<DrList> drList = drListMapper.selectAll();
		return drList;
	}
}