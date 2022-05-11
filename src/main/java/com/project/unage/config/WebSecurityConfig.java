//package com.project.unage.config;
//
//import com.project.unage.service.MemberDetailService;
//import com.project.unage.service.MemberService;
//import com.project.unage.service.MemberServiceImpl;
//import lombok.AllArgsConstructor;
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@AllArgsConstructor
//@EnableWebSecurity  //spring security 활성화
//@Configuration
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private final MemberDetailService memberDetailService;  //유저정보 가져올 클래스
//
//    @Bean   // service에서 비밀번호 암호화하도록 Bean으로 등록
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        // static 디렉터리에 있는건 인증 무시 (= 항상 통과)
//        web.ignoring().antMatchers("/images/**", "/css/**", "/js/**");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()   //csrf토큰 사용X 이므로 get방식으로도 로그아웃 처리된다
//                .authorizeRequests() // 페이지 권한 설정
//                .antMatchers("/admin/**").hasRole("ADMIN") // ADMIN만 접근 가능
//                .antMatchers("/member/mypage").hasRole("MEMBER")
//                .antMatchers("/**").permitAll()
//                .and()
//                .formLogin() // 로그인 설정
//                .loginPage("/member/login") // 로그인 페이지 링크
//                .loginProcessingUrl("/member/login")
//                .defaultSuccessUrl("/") // 로그인 성공 후 리다이렉트 주소
//                .permitAll()
//                .and()
//                .logout() // 로그아웃 설정
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("/") // 로그아웃 성공시 리다이렉트 주소
//                .invalidateHttpSession(true) // 로그아웃시 저장해둔 세션 제거
//                .and()
//                .exceptionHandling().accessDeniedPage("/denied");    // 접근권한 없을때 로그인페이지로 이동
//        ;
//    }
//
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(MemberDetailService)
//                // 해당 서비스(memberService)에서는 MemberDetailsService를 implements해서
//                // loadUserByUsername() 구현해야함 (서비스 참고)
//                .passwordEncoder(passwordEncoder());
//    }
//}
