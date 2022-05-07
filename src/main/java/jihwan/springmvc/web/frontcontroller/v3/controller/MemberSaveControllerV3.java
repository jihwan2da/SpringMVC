package jihwan.springmvc.web.frontcontroller.v3.controller;

import jihwan.springmvc.domain.member.Member;
import jihwan.springmvc.domain.member.MemberRepository;
import jihwan.springmvc.web.frontcontroller.ModelView;
import jihwan.springmvc.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {

        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member", member);
        return mv;

    }
}
