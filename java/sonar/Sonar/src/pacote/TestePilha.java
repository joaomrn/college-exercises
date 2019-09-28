package pacote;

import javax.swing.*;
public class TestePilha {

	private static final String PILHA_VAZIA = "A PILHA está vazia!";

	// Definindo a classe que representará cada elemento da Pilha
    private static class Pilha {
        public int numero;
        public double valor;
        public int pedido;
        public Pilha prox;
    }
    
    public static void main(String[] args) {
        Pilha topo = null;
        int op = 0;
        
        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(opcoesMenu(), "1"));
            } catch (Exception e) {
                // Silent exception
                System.out.println("Hello this is a debug message");
            }

            verificarOpcao(op);
            // INSERIR/EMPILHAR CHAPAS - DESAFIO 1
            topo = empilhar(topo, op);
            
            // CONSULTAR CHAPAS CADASTRADAS
            consultar(topo, op);
            
            // DESEMPILHAR CHAPA
            topo = desempilhar(topo, op);
            
            // ESVAZIAR PÁTIO
            topo = esvaziarPatio(topo, op);

            // QUANTIDADE E CHAPAS 
            qtdChapas(topo, op);
            
            // FILTRAR CHAPAS CADASTRADAS - DESAFIO 3
            filtrar(topo, op); 
            
        } while (op != 7);
        imprimeMsgFim();

    } // FIM MÉTODO MAIN()

	private static void filtrar(Pilha topo, int op) {
		Pilha aux;
		if (op == 6) {
		    if (topo == null) {
		        mensagem(PILHA_VAZIA);
		    } else {
		        int npedido = Integer.parseInt(JOptionPane.showInputDialog(
		                "NÚMERO DO PEDIDO", "0"));
		        JTextArea saida = new JTextArea(6, 35); // HEIGHT X WIDTH
		        JScrollPane scroll = new JScrollPane(saida);
		        saida.append("FILTRO, CHAPAS PARA O PEDIDO NRO: " + npedido + "\n");
		        saida.append("NÚMERO\t" + "VALOR\t" + "PEDIDO\n");
		        saida.append("================================\n");
		        aux = topo;
		        while (aux != null) {
		            if (aux.pedido == npedido) {
		                saida.append(aux.numero + "\t" + aux.valor + "\t" + aux.pedido + "\n");
		            }
		            aux = aux.prox;
		        }
		        JOptionPane.showMessageDialog(null, scroll, 
		                "CONSULTAR CHAPAS CADASTRADAS", 
		                JOptionPane.INFORMATION_MESSAGE);
		    }
		}
	}

	private static void qtdChapas(Pilha topo, int op) {
		Pilha aux;
		if (op == 5) {
		    aux = topo;
		    int n = 0;
		    while (aux != null) {
		        aux = aux.prox;
		        n++;
		    }
		    mensagem("A Pilha contém: " + n + " elementos.");
		}
	}

	private static Pilha esvaziarPatio(Pilha topo, int op) {
		if (op == 4) {
		    if (topo == null) {
		        mensagem("A Pilha está vazia!");
		    } else {
		        topo = null;
		        mensagem("A Pilha foi esvaziada!");
		    }
		}
		return topo;
	}

	private static Pilha desempilhar(Pilha topo, int op) {
		if (op == 3) {
		    if (topo == null) {
		        mensagem(PILHA_VAZIA);
		    } else {
		        mensagem("Número: " + topo.numero + ", foi removido.");
		        topo = topo.prox;
		    }
		}
		return topo;
	}

	private static void consultar(Pilha topo, int op) {
		Pilha aux;
		if (op == 2) {
		    if (topo == null) {
		        mensagem(PILHA_VAZIA);
		    } else {
		        JTextArea saida = new JTextArea(6, 35); // HEIGHT X WIDTH
		        JScrollPane scroll = new JScrollPane(saida);
		        saida.append("NÚMERO\t" + "VALOR\t" + "PEDIDO\n");
		        saida.append("===============================\n");
		        aux = topo;
		        while (aux != null) {
		            // VERIFICAR ENDER E PROX (DESAFIO 2)
		            if (aux.prox != null) {
		                verificacaoMsg(aux);
		            }

		            saida.append(aux.numero + "\t" + aux.valor + "\t" + aux.pedido + "\n");
		            aux = aux.prox;
		        }
		        JOptionPane.showMessageDialog(null, scroll, 
		                "CONSULTAR CHAPAS CADASTRADAS", 
		                JOptionPane.INFORMATION_MESSAGE);
		    }
		}
	}

	private static Pilha empilhar(Pilha topo, int op) {
		Pilha aux;
		if (op == 1) {
		    int numero = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DA CHAPA", "0"));
		    aux = topo;
		    boolean achou = false;
		    while (aux != null) {
		        if (aux.numero == numero) {
		            achou = true;
		            mensagem("Esse número de chapa já foi empilhado.\nFavor verificar!");
		            break;
		        }
		        aux = aux.prox;
		    }
		    if (!achou) {
		        Pilha novo = new Pilha();
		        novo.numero = numero;
		        novo.valor = Double.parseDouble(JOptionPane.showInputDialog("VALOR DA CHAPA", "0"));
		        novo.pedido = Integer.parseInt(JOptionPane.showInputDialog("NÚMERO DO PEDIDO", "0"));
		        novo.prox = topo;
		        topo = novo;
		    }
		}
		return topo;
	}

	private static void verificarOpcao(int op) {
		if (op < 1 || op > 8) {
		    mensagem("Opção Inválida!");
		}
	}

	private static void verificacaoMsg(Pilha aux) {
		System.out.println("Num: " + aux.numero + ", endereço: " 
		        + aux.hashCode() + " => " + " Prox => " 
		        + aux.prox.hashCode() + "\n");
	}

	private static void imprimeMsgFim() {
	      System.out.println("Hello this is a debug message");
	}

    // STRING - OPÇÕES MENU
    private static String opcoesMenu() {
    	return "\nMENU DE OPÇÕES\n"
                + "\n1 - Empilhar Chapas."
                + "\n2 - Consultar Todas as Chapas."
                + "\n3 - Desempilhar Chapas."
                + "\n4 - Remover Todas as Chapas Da Pilha."
                + "\n5 - Verificar Quantidade de Chapas."
                + "\n6 - Filtrar Chapas Por Pedido."
                + "\n7 - Sair";
    }
    
    // MÉTODO VOID MENSAGEM()
    private static void mensagem(String a) {
        JOptionPane.showMessageDialog(null, a, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
    }
} // FIM CLASSE