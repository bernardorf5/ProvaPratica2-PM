package pm_prova2;

public class Natacao extends Atividade implements Certificavel, ControladorPresenca {
    private double profundidadePiscina;
    
    public Natacao(String nome, int duracaoAula, int quantidadeMaximaParticipantes, double valorMensal, StatusAtividade status, double profundidadePiscina){
        super(nome, duracaoAula, quantidadeMaximaParticipantes, valorMensal, status);
        this.profundidadePiscina = profundidadePiscina;
    }

    public double getProfundidadePiscina() {
        return profundidadePiscina;
    }

    public void setProfundidadePiscina(double profundidadePiscina) {
        this.profundidadePiscina = profundidadePiscina;
    }
    
    @Override
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Duração da aula: " + getDuracaoAula());
        System.out.println("Quantidade máxima de participantes: " + getQuantidadeMaximaParticipantes());
        System.out.println("Valor mensal: " + getValorMensal());
        System.out.println("Status da atividade: " + getStatus());
        System.out.println("Profundidade da piscina: " + this.profundidadePiscina);
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

    @Override
    public void emitirCertificado(String nomeParticipante){
        System.out.println("Certificado de " + nomeParticipante + " emitido");
    }
}
