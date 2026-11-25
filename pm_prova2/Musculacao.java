package pm_prova2;

public class Musculacao extends Atividade {
    private int quantidadeAparelhosDisponiveis;

    public Musculacao(String nome, int duracaoAula, int quantidadeMaximaParticipantes, double valorMensal, StatusAtividade status, int quantidadeAparelhosDisponiveis) {
        super(nome, duracaoAula, quantidadeMaximaParticipantes, valorMensal, status);
        this.quantidadeAparelhosDisponiveis = quantidadeAparelhosDisponiveis;
    }

    public int getQuantidadeAparelhosDisponiveis() {
        return quantidadeAparelhosDisponiveis;
    }

    public void setQuantidadeAparelhosDisponiveis(int quantidadeAparelhosDisponiveis) {
        this.quantidadeAparelhosDisponiveis = quantidadeAparelhosDisponiveis;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Duração da aula: " + getDuracaoAula());
        System.out.println("Quantidade máxima de participantes: " + getQuantidadeMaximaParticipantes());
        System.out.println("Valor mensal: " + getValorMensal());
        System.out.println("Status da atividade: " + getStatus());
        System.out.println("Quantidade máxima de aparelhos: " + getQuantidadeAparelhosDisponiveis());
    }

    @Override
    public boolean atividadeColetiva() {
        if(getQuantidadeMaximaParticipantes() > 1) {
            return true;
        }
        return false;
    }
}
