package com.yuta.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yuta.springboot.MsgData;

@Repository
public interface MsgDataRepository extends JpaRepository<MsgData, Long> {

}
