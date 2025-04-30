public class Registro {
    private Integer Id;
    private String nome;
    private Double salario;

    public Registro() {
    }

    public Registro(Integer Id,String nome, Double salario) {
        this.Id = Id;
        this.nome = nome;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Integer getId() {
        return Id;
    }
    public void setId(Integer Id) {
        this.Id = Id;
    }
    public void addSalario(double taxa) {
        salario = salario + (salario * taxa) / 100;
    }
    public String toString() {
        return Id + ", " + nome + ", " + String.format("%.2f", salario);
    }
}
