/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;
import java.util.ArrayList;
import java.util.List;



public class Socio {    
    public  List<Emprestimo> emprestimo;
    private String nome;
    private String cpf;
 

    Socio(){

    }
    
    public Socio(String nome, String cpf, List<Emprestimo> emprestimo) {
        this.nome = nome;
        this.cpf = cpf;
        this.emprestimo = emprestimo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Emprestimo> getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(ArrayList<Emprestimo> emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    public void addEmprestimo(Emprestimo emprestimo)
    {
        emprestimo.add(emprestimo);
    }

   

    public void mostrarDados() {
        System.out.println("--------- Socio ------------ " );
        System.out.println(" " );
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        for (Emprestimo emprestimo : getEmprestimo()) {
            System.out.println("Data de empréstimo: " + emprestimo.getDataEmprestimo());
            System.out.println("Data de entrega: " + emprestimo.getDatadeEntrega());
            System.out.println("ID do exemplar: " + emprestimo.getExemplar().getNumero());
            System.out.println("Nome do livro: " + emprestimo.getExemplar().getLivro().getNome());
            System.out.println("ID do livro: " + emprestimo.getExemplar().getLivro().getId());
            System.out.println("Preço do livro: " + emprestimo.getExemplar().getLivro().getPreco());
            System.out.println("ISBN do livro: " + emprestimo.getExemplar().getLivro().getIsbn());
            System.out.println("Nome do sócio: " + emprestimo.getSocio().getNome());
            System.out.println("CPF do sócio: " + emprestimo.getSocio().getCpf());
        }
        System.out.println(" " );
        System.out.println("---------------------------- " );
        System.out.println(" " );
    }
    
    
    
}
