package pm_prova2;

import java.util.ArrayList;

public class Funcionalidades {
    private ArrayList<Atividade> atividades;
    private ArrayList<Plano> planos;

    public Funcionalidades(){
        this.atividades = new ArrayList<>();
        this.planos = new ArrayList<>();
    }

    public void cadastrarAtividade(Atividade atividade){
        this.atividades.add(atividade);
    }

    public void cadastrarPlano(Plano plano){
        this.planos.add(plano);
    }

    public void exibirAtividades(){
        for(Atividade a : atividades){
            System.out.println("===========================================\n");
            a.exibirDetalhes();
            System.out.println("===========================================\n");
        }
    }
    public void exibirPlanos(){
        for(Plano p : planos){
            System.out.println("===========================================\n");
            p.exibirDetalhes();
            System.out.println("===========================================\n");
        }
    }

    public void exibirPlanosAtivos(){
        for(Plano p : planos){
            if(p.getStatus() == StatusPlano.ATIVO){
                System.out.println("===========================================\n");
                p.exibirDetalhes();
                System.out.println("===========================================\n");
            }
        }
    }

    public void removerAtividadesInativas(){
        for(Atividade a : atividades){
            if(a.getStatus() == StatusAtividade.INATIVA){
                atividades.remove(a);
            }
        }
    }
}
