package br.edu.up;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.modelos.Aluno;

public class App {
    public static void main(String[] args) throws FileNotFoundException {

        String alunosFile = "src/alunos.csv";
        String resumoFile = "resumo.csv";

        List<Aluno> alunos = new ArrayList<>();

        Scanner alunosScanner = new Scanner(new File(alunosFile));
        while(alunosScanner.hasNextLine()){
            String line = alunosScanner.nextLine();
            String[] data = line.split(";");
            int matricula = Integer.parseInt(data[0]);
            String nome = data[1];
            double nota = Double.parseDouble(data[2]);
            Aluno aluno = new Aluno(matricula, nome, nota);
            alunos.add(aluno);
        }

    }
}
