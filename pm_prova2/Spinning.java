package pm_prova2;

public class Spinning extends Atividade implements ControladorPresenca {
    private int quantidadeBicicletas;

    public Spinning(String nome, int duracaoAula, int quantidadeMaximaParticipantes, double valorMensal, StatusAtividade status, int quantidadeBicicletas){
        super(nome, duracaoAula, quantidadeMaximaParticipantes, valorMensal, status);
        this.quantidadeBicicletas = quantidadeBicicletas;
    }

    public int getQuantidadeBicicletas() {
        return quantidadeBicicletas;
    }

    public void setQuantidadeBicicletas(int quantidadeBicicletas) {
        this.quantidadeBicicletas = quantidadeBicicletas;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Duração da aula: " + getDuracaoAula());
        System.out.println("Quantidade máxima de participantes: " + getQuantidadeMaximaParticipantes());
        System.out.println("Valor mensal: " + getValorMensal());
        System.out.println("Status da atividade: " + getStatus());
        System.out.println("Quantidade de bicicletas: " + this.quantidadeBicicletas);
    }

    @Override
    public boolean atividadeColetiva() {
        if(getQuantidadeMaximaParticipantes() > 1) {
            return true;
        }
        return false;
    }

    @Override
    public void registrarPresenca(String nomeParticipante){
        System.out.println("Presença de " + nomeParticipante + " registrada");
    }

}
