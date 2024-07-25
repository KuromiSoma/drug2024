package org.drug.store.ptuserlist;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.drug.store.ptuserlist.PtUser;
import org.drug.store.mapper.PtUserMapper;

@Service
@Transactional
public class PtUserListService {

	@Autowired
	PtUserMapper ptUserMapper;

	public List<PtUser> getUserList() {
		List<PtUser> userList = ptUserMapper.selectAll();
		return userList;
	}
}