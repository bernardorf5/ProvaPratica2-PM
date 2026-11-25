package pm_prova2;

import java.util.ArrayList;

public class PlanoBasico extends Plano implements ControladorPresenca {
    private boolean acessoDiario;
    public PlanoBasico(String nome, double valorMensal, int quantidadeMaximaAtividades, StatusPlano status, ArrayList<Atividade> atividadesAssociadas) {
        super(nome, valorMensal, quantidadeMaximaAtividades, status);
        this.acessoDiario = false;
        atividadesAssociadas = new ArrayList<>();
    }

    public boolean isAcessoDiario() {
        return acessoDiario;
    }


    public void setAcessoDiario(boolean acessoDiario) {
        this.acessoDiario = acessoDiario;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Valor mensal: " + getValorMensal());
        System.out.println("Quantidade máxima de atividades: " + getQuantidadeMaximaAtividades());
        System.out.println("Status da atividade: " + getStatus());
        if(acessoDiario){
            System.out.println("Acesso diário: Já utilizado");
        }
        else {
            System.out.println("Acesso diário: Não utilizado");
        }
    }

    @Override
    public boolean permiteAtividadeColetiva() {
        return false;
    }

    @Override
    public void associarAtividade(Atividade atividade){
        if(!permiteAtividadeColetiva() && !atividade.atividadeColetiva()){
            getAtividadesAssociadas().add(atividade);
        }
        else {
            throw new IllegalStateException("A atividade é coletiva e o plano não permite");
        }
    }

    @Override
    public void registrarPresenca(String nomeParticipante) {
        System.out.println("Presença de " + nomeParticipante + " registrada");
        setAcessoDiario(true);
    }
}
