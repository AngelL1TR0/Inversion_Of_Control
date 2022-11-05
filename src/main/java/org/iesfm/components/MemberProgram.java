package org.iesfm.components;

import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class MemberProgram {

    private Scanner sc;
    private MemberReader memberReader;
    private MemberStorage memberStorage;

    public void execute() {

        int awnser;
        String nif;

        do {
            System.out.println("Introduce el numero de opcion que quieras ejecutar" +
                    "\n1. 'Listar'" +
                    "\n2. 'Añadir'" +
                    "\n3. 'Eliminar'" +
                    "\n4. 'Salir'");
            awnser = sc.nextInt();
            switch (awnser) {
                case 1:
                    memberStorage.listMembers();
                    break;
                case 2:
                    memberStorage.addMember(memberReader.readMember());
                    break;
                case 3:
                    System.out.println("Introduce el NIF del usuario a eliminar");
                    nif = sc.next();
                    memberStorage.deleteMember(nif);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
            }
        }
        while (awnser == 1 || awnser == 2 || awnser == 3);
    }
}
