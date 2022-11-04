package org.iesfm.configuration;

import org.iesfm.components.MemberProgram;
import org.iesfm.components.MemberReader;
import org.iesfm.components.MemberStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.Scanner;

@Configuration

public class MemberConfiguration {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    @Bean
    public MemberReader memberReader(Scanner scanner) {
        return new MemberReader(scanner);
    }

    @Bean
    public MemberStorage memberStorage(
            Map partnersMap
    )  {
        return new MemberStorage(partnersMap);
    }

    @Bean
    public MemberProgram memberProgram(
            Scanner sc,
            MemberReader  memberReader,
            MemberStorage memberStorage
    ) {
        return new MemberProgram(sc, memberReader, memberStorage);
    }
}
