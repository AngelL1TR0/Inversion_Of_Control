package org.iesfm.components;

import org.iesfm.entity.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MemberStorage {

    private Map<String, Member> members = new HashMap<>();

    public void addMember(Member member){
        members.put(member.getNif(), member);
    }
    public void deleteMember(String nif){
        members.remove(nif);
    }
    public List<Member> listMembers(){
        return members.values()
                .stream()
                .collect(Collectors.toList());
    }
}
