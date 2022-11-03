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

        String awnser;
        String nif;
        do {
            log.info("Introduce la opcion que quieras ejecutar" +
                    "\n'Listar'" +
                    "\n'Añadir'" +
                    "\n'Eliminar'" +
                    "\n'Salir'");
            awnser = sc.nextLine();
            switch (awnser) {
                case "Listar":
                    memberStorage.listMembers();
                    awnser = sc.nextLine();
                    break;
                case "Añadir":
                    memberReader.readMember();
                    memberStorage.addMember(memberReader.readMember());
                    awnser = sc.nextLine();
                    break;
                case "Eliminar":
                    log.info("Introduce el NIF del usuario a eliminar");
                    nif = sc.nextLine();
                    memberStorage.deleteMember(nif);
                    awnser = sc.nextLine();
                    break;
                case "Salir":
                    log.info("Saliendo...");
                    System.exit(0);
                    break;
            }
        }
        while (awnser.equalsIgnoreCase("Listar")
                || awnser.equalsIgnoreCase("Añadir")
                || awnser.equals("Eliminar")
                || awnser.equalsIgnoreCase("Salir"));
    }
}
