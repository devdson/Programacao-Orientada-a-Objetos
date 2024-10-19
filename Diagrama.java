import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Classe do contrato de plano de saúde
class Contrato {
    private int id;
    private Date dataCelebracao;
    private boolean reajusteAnual;
    private List<Pessoa> pessoas;

    public Contrato(int id, Date dataCelebracao, boolean reajusteAnual) {
        this.id = id;
        this.dataCelebracao = dataCelebracao;
        this.reajusteAnual = reajusteAnual;
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public void imprimirInformacoes() {
        System.out.println("Contrato ID: " + id);
        System.out.println("Data de Celebração: " + dataCelebracao);
        System.out.println("Reajuste Anual: " + reajusteAnual);
        System.out.println("Pessoas no Contrato:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(" - " + pessoa.getNome());
        }
    }
}

// Classe pessoa
class Pessoa {
    private String nome;
    private String endereco;
    private Date dataNascimento;
    private String sexo;

    public Pessoa(String nome, String endereco, Date dataNascimento, String sexo) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
    }
}

// Classe do dependente, que herda de Pessoa
class Dependente extends Pessoa {
    private String grauParentesco;

    public Dependente(String nome, String endereco, Date dataNascimento, String sexo, String grauParentesco) {
        super(nome, endereco, dataNascimento, sexo);
        this.grauParentesco = grauParentesco;
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Grau de Parentesco: " + grauParentesco);
    }
}

// Classe principal para executar o código
public class Diagrama {
    public static void main(String[] args) {
        
        Pessoa titular = new Pessoa("João Silva", "Rua A, 123", new Date(), "Masculino");
        Dependente dependente = new Dependente("Maria Silva", "Rua A, 123", new Date(), "Feminino", "Cônjuge");

        Contrato contrato = new Contrato(1, new Date(), true);
        contrato.adicionarPessoa(titular);
        contrato.adicionarPessoa(dependente);
        
        contrato.imprimirInformacoes();
        
        titular.imprimirInformacoes();

        dependente.imprimirInformacoes();
    }
}
