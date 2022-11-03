package org.iesfm.components;

import lombok.AllArgsConstructor;
import org.iesfm.entity.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
@AllArgsConstructor
public class MemberReader {
    private final static Logger log = LoggerFactory.getLogger(MemberReader.class);
    private Scanner sc;

    public Member readMember(){
        log.info("Introduce el NIF del socio");
        String nif = sc.nextLine();
        log.info("Introduce el nombre del usuario con NIF " + nif);
        String name = sc.nextLine();
        log.info("Introduce el apellido de " + name);
        String surname = sc.nextLine();
        log.info("Introduce el codigo postal de " + name + " " + surname);
        int ccpp = sc.nextInt();
        return new Member(nif, name, surname, ccpp);
    }
}
