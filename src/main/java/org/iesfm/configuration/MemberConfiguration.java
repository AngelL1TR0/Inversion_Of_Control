package org.iesfm.configuration;

import org.iesfm.components.MemberProgram;
import org.iesfm.components.MemberReader;
import org.iesfm.components.MemberStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@Configuration
@PropertySource("application.properties")
public class MemberConfiguration {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    /*@Bean
    public MemberReader memberReader(){
        return new MemberReader();
    }

     */

    @Bean
    public MemberStorage memberStorage(){
        return new MemberStorage();
    }

    /*@Bean
    public MemberProgram memberProgram(){
        return new MemberProgram();
    }

     */
}
