package org.iesfm.components;

import lombok.AllArgsConstructor;
import org.iesfm.entity.Member;

import java.util.HashMap;
import java.util.Map;
@AllArgsConstructor
public class MemberStorage {

    private Map<String, Member> members = new HashMap<>();

    public void addMember(Member member){
        members.put(member.getNif(), member);
    }
    public void deleteMember(String nif){
        members.remove(nif);
    }
    public void listMembers(){
        for (Map.Entry<String, Member> memberList : members.entrySet()){
            System.out.println(memberList);
        }
    }
}
