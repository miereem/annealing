package com.company;

public class Main {
    public static void main(String[] args){

        TestFunction rosenbrock = new Rosenbrock();

        Optimizer simulated_annealing = new SA();

        System.out.println("=== Evaluation Rosenbrock with fmin: 0 at (0,0) ==");
        System.out.println();
        System.out.println("Simulated Annealing....");
        simulated_annealing.optimize(rosenbrock, 2);
        System.out.println();

    }
}
