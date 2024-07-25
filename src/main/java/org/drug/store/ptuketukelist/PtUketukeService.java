package org.drug.store.ptuketukelist;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.drug.store.ptuketukelist.PtUketuke;
import org.drug.store.mapper.PtUketukeMapper;

@Service
@Transactional
public class PtUketukeService {

	@Autowired
	PtUketukeMapper ptUketukeMapper;

	public List<PtUketuke> getUketukeList() {
		List<PtUketuke> uketukeList = ptUketukeMapper.selectAll();
		return uketukeList;
	}
}