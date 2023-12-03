public class CalcControle {
    private CalcDados dados;
    private CalcInterface interf;

    public CalcControle(CalcDados dados, CalcInterface interf) {
        this.dados = dados;
        this.interf = interf;
    }

    public void executar() {
        while (true) {
            double op1 = interf.recebeOperando(1);
            double op2 = interf.recebeOperando(2);
            char operacao = interf.recebeOperacao();

            if (operacao == 's') {
                System.exit(0);
            }

            dados.setOperando(1, op1);
            dados.setOperando(2, op2);
            dados.setOperacao(operacao);

            double resultado = opera(op1, op2, operacao);

            interf.mostraResultado(resultado);
        }
    }

    private double opera(double opn1, double opn2, char op) {
        double resultado = 0;

        switch (op) {
            case '+':
                resultado = opn1 + opn2;
                break;
            case '-':
                resultado = opn1 - opn2;
                break;
            case '*':
                resultado = opn1 * opn2;
                break;
            case '/':
                if (opn2 != 0) {
                    resultado = opn1 / opn2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        return resultado;
    }
}
