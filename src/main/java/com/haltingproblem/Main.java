package com.haltingproblem;

import com.haltingproblem.builders.ProgramBuilderImpl;
import com.haltingproblem.model.Program;
import com.haltingproblem.reverser.Reverser;

public class Main {
    public static void main(String[] args) {
        ProgramBuilderImpl builder = new ProgramBuilderImpl();

        Program haltingProgram = builder
            .setInitialValue(3)
            .setHalting(true)
            .build();

        Program nonHaltingProgram = builder
            .setInitialValue(0)
            .setHalting(false)
            .build();

        System.out.println("=== Simulación con Builder ===");
        Reverser reverser1 = new Reverser(haltingProgram);
        Reverser reverser2 = new Reverser(nonHaltingProgram);

        reverser2.run();
        reverser1.run();
    }
}