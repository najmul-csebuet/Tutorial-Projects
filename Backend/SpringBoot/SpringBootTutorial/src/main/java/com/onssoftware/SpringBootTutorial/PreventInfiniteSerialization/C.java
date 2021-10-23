package com.onssoftware.SpringBootTutorial.PreventInfiniteSerialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class C {
    public static void main(String[] args) throws JsonProcessingException {
        A a = new A();
        B b = new B(a);
        a.setB(b);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(a);
        System.out.println(s);
    }
}
