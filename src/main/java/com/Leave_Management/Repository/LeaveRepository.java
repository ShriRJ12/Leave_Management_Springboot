package com.Leave_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import com.Leave_Management.Entities.LeaveEn;


@Repository
public interface LeaveRepository extends JpaRepository<LeaveEn,Integer> {

}
