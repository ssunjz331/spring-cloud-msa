//package com.example.userservicce.security;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.websocket.HandshakeResponse;
//import java.io.IOException;
//import java.util.ServiceLoader;
//
//public class AuthenticationFilter extends UsernamePasswordAuthenticationFilter {
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request,
//                                                HttpServletResponse response) throws AuthenticationException{
//        try {
//            RequestLogin creds = new ObjectMapper().readValue(request.getInputStream(), RequestLogin.class);
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }
//        return super.attemptAuthentication(request, response);
//    }
//
//    @Override
//    protected void successfultAuthentication(HttpServletRequest request,
//                                             HttpServletResponse response,
//                                             FilterChain chain,
//                                             Authentication authResult) throws IOException, ServletException{
//        super.successfulAuthentication(request, response,chain,authResult);
//    }
//}
