package project.firstSpring.member;

public interface MemberService {

    void join(Member member);

    Member findMember(Long memberId);
}
