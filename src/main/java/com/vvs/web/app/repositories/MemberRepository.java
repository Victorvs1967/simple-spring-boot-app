package com.vvs.web.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vvs.web.app.entities.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {
	
    Member findByEmail(String email);
}
