package project.firstSpring.discount;

import project.firstSpring.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);


}
