package pm_prova2;

import java.util.ArrayList;

public class PlanoPremium extends Plano {
    public PlanoPremium(String nome, double valorMensal, int quantidadeMaximaAtividades, StatusPlano status, ArrayList<Atividade> atividadesAssociadas) {
        super(nome, valorMensal, quantidadeMaximaAtividades, status);
        atividadesAssociadas = new ArrayList<>();
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Valor mensal: " + getValorMensal());
        System.out.println("Quantidade máxima de atividades: " + getQuantidadeMaximaAtividades());
        System.out.println("Status da atividade: " + getStatus());
    }

    @Override
    public boolean permiteAtividadeColetiva(){
        return true;
    }

    @Override
    public void associarAtividade(Atividade atividade){
        getAtividadesAssociadas().add(atividade);
    }
}
