package org.iesfm.components;

import lombok.AllArgsConstructor;
import org.iesfm.entity.Member;

import java.util.Scanner;
@AllArgsConstructor
public class MemberReader {
    private Scanner sc;

    public Member readMember(){

        //Dijiste que tenia que ser nextLine los scanners de String
        //Pero daba todo el rato error o se saltaba el introducir un valor
        //Con next no da ese error, lo siento

        System.out.println("Introduce el NIF del socio");
        String nif = sc.next();
        System.out.println("Introduce el nombre del usuario con NIF " + nif);
        String name = sc.next();
        System.out.println("Introduce el apellido de " + name);
        String surname = sc.next();
        System.out.println("Introduce el codigo postal de " + name + " " + surname);
        int ccpp = sc.nextInt();
        return new Member(nif, name, surname, ccpp);

    }
}
