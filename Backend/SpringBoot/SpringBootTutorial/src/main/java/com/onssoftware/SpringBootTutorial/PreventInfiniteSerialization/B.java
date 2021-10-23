package com.onssoftware.SpringBootTutorial.PreventInfiniteSerialization;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class B {
    private long id = 2;
    private A a;

    public B(A a) {
        this.a = a;
    }
}
