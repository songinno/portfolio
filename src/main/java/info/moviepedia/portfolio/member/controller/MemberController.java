package info.moviepedia.portfolio.member.controller;

import info.moviepedia.portfolio.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

}
