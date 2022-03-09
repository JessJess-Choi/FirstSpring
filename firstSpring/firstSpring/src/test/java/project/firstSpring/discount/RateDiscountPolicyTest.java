package project.firstSpring.discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import project.firstSpring.member.Grade;
import project.firstSpring.member.Member;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10퍼센트 할인 적용")
    void 할인적용(){

        Member member = new Member(1L,"memberVIP", Grade.VIP);
  //      Member memberFail = new Member(1L,"memberBASIC", Grade.BASIC);

        int discount = discountPolicy.discount(member,10000);
    //    int discountFail = discountPolicy.discount(memberFail,10000);

        Assertions.assertThat(discount).isEqualTo(1000);
     //   Assertions.assertThat(discountFail).isNotEqualTo(1000);
    }

    @Test
    @DisplayName("일반인은 할인 적용 안함")
    void 할인미적용(){
        Member member = new Member(1L,"memberBASIC",Grade.BASIC);

        int discount = discountPolicy.discount(member,10000);

        Assertions.assertThat(0);
    }
}