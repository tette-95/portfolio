package com.yuta.springboot;

import java.util.List;

public interface MsgDataDao<T> {

	public List<MsgData> getAll();
	public MsgData findById(Long id);

}
