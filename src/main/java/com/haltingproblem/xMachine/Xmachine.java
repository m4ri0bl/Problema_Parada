package com.haltingproblem.xMachine;

        import com.haltingproblem.builders.HaltingProgramBuilder;
        import com.haltingproblem.builders.NonHaltingProgramBuilder;
        import com.haltingproblem.haltchecker.HaltChecker;
        import com.haltingproblem.model.Program;
        import com.haltingproblem.reverser.Reverser;

        import java.util.ArrayList;
        import java.util.List;

        public class Xmachine {
            public void run() {
                List<Program> programs = new ArrayList<>();

                programs.add(new HaltingProgramBuilder().setInitialValue(3).build());
                programs.add(new NonHaltingProgramBuilder().setInitialValue(0).build());

                for (Program program : programs) {
                    boolean willHalt = HaltChecker.willHalt(program);
                    System.out.println("=== Verificación de HaltChecker ===");
                    System.out.println("El programa se detendrá: " + willHalt);

                    System.out.println("=== Simulación con Reverser ===");
                    Reverser reverser = new Reverser(program);
                    reverser.runProgram();
                }
            }
        }