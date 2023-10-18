package me.kbh.querydslapplication.repository.custom;

import me.kbh.querydslapplication.dto.MemberSearchCondition;
import me.kbh.querydslapplication.dto.MemberTeamDto;

import java.util.List;

public interface CustomMemberRepository {

    List<MemberTeamDto> searchByBuilder(MemberSearchCondition memberSearchCondition);
    List<MemberTeamDto> searchByWhereParameter(MemberSearchCondition memberSearchCondition);

}
