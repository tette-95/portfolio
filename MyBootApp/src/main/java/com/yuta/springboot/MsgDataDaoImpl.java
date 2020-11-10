package com.yuta.springboot;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

@SuppressWarnings("rawtypes")
@Repository
public class MsgDataDaoImpl implements MsgDataDao<MsgDataDao> {

	private EntityManager entityManager;

	public  MsgDataDaoImpl() {
		super();
	}
	public MsgDataDaoImpl(EntityManager manager) {
		entityManager = manager;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MsgData> getAll() {
		// TODO Auto-generated method stub
		return entityManager
				.createQuery("from MsgData")
				.getResultList();
	}

	@Override
	public MsgData findById(Long id) {
		// TODO Auto-generated method stub
		return (MsgData)entityManager
				.createQuery("from MsgData where id = " + id).getSingleResult();
	}

}
