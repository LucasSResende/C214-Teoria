package busca;

public class Professor {
    private String nome;
    private String horarioDeAtendimento;
    private String periodo;

    public Professor(String nome, String horarioDeAtendimento, String periodo) {
        this.nome = nome;
        this.horarioDeAtendimento = horarioDeAtendimento;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    public void setHorarioDeAtendimento(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
