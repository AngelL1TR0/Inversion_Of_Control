package org.iesfm.components;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

@AllArgsConstructor
public class MemberProgram {

    private Scanner sc;
    private MemberReader memberReader;
    private MemberStorage memberStorage;

    private final static Logger log = LoggerFactory.getLogger(MemberProgram.class);

    public void execute() {

        int awnser;
        String nif;
        do {
            log.info("Introduce el numero de opcion que quieras ejecutar" +
                    "\n1. 'Listar'" +
                    "\n2. 'Añadir'" +
                    "\n3. 'Eliminar'" +
                    "\n4. 'Salir'");
            awnser = sc.nextInt();
            switch (awnser) {
                case 1:
                    memberStorage.listMembers();
                    awnser = sc.nextInt();
                    break;
                case 2:
                    memberReader.readMember();
                    memberStorage.addMember(memberReader.readMember());
                    awnser = sc.nextInt();
                    break;
                case 3:
                    log.info("Introduce el NIF del usuario a eliminar");
                    nif = sc.nextLine();
                    memberStorage.deleteMember(nif);
                    awnser = sc.nextInt();
                    break;
                case 4:
                    log.info("Saliendo...");
                    System.exit(0);
                    break;
            }
        }
        while (awnser == 1
                || awnser == 2
                || awnser == 3
                || awnser == 4);
    }
}
