package me.kbh.querydslapplication.repository;

import me.kbh.querydslapplication.entity.Member;
import me.kbh.querydslapplication.repository.custom.CustomMemberRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long>, CustomMemberRepository {
}
