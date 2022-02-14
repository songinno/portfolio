//package info.moviepedia.portfolio.member.repository;
//
//import info.moviepedia.portfolio.member.domain.Member;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class MemberMapperTest {
//    @Autowired
//    MemberMapper memberMapper;
//
//    @Test
//    void regTest() {
//        Member member = new Member();
//        member.setMemberEmail("son@naver.com");
//        member.setMemberName("손오공");
//        member.setMemberPassword("ssss123");
//
//        memberMapper.register(member);
//    }
//
//    @Test
//    void deleteTest() {
//        memberMapper.delete("son@naver.com");
//    }
//
//    @Test
//    void getOneTest() {
//        Member member = memberMapper.getOneMember("son@naver.com");
//
//        System.out.println("============================");
//        System.out.println(member);
//        System.out.println("============================");
//    }
//
//    @Test
//    void getListTest() {
//        List<Member> memberList = memberMapper.getMemberList();
//
//        for (Member member : memberList) {
//            System.out.println("member = " + member);
//        }
//    }
//}