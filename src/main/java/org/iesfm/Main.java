package org.iesfm;

import org.iesfm.components.MemberProgram;
import org.iesfm.configuration.MemberConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                MemberConfiguration.class
        );

        MemberProgram program = context.getBean(MemberProgram.class);
        program.execute();
    }
}