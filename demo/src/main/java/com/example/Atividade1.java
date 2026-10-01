package com.example;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Atividade 1: Produção de Milho (7 semanas) ---");
        double[] producao = new double[7];
        double total = 0;
        double maiorProd = 0;
        int semanaMaior = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite a produção da semana " + (i + 1) + " (em toneladas): ");
            producao[i] = scanner.nextDouble();
            total += producao[i];
            
            if (i == 0 || producao[i] > maiorProd) {
                maiorProd = producao[i];
                semanaMaior = i + 1;
            }
        }

        double media = total / 7;
        System.out.printf("\nProdução Total: %.2f toneladas\n", total);
        System.out.printf("Média Semanal: %.2f toneladas\n", media);
        System.out.println("Maior Produção: Semana " + semanaMaior + " com " + maiorProd + " toneladas.");
        scanner.close();
    }
}

class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Atividade 2: Temperatura em Estufa (10 dias) ---");
        double[] temperaturas = new double[10];
        int contadorAcima30 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a temperatura do dia " + (i + 1) + " (°C): ");
            temperaturas[i] = scanner.nextDouble();
            if (temperaturas[i] > 30.0) {
                contadorAcima30++;
            }
        }

        System.out.println("\nTotal de dias com temperatura acima de 30°C: " + contadorAcima30);
        scanner.close();
    }
}

class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Atividade 3: Consumo de Água (12 setores) ---");
        double[] consumo = new double[12];
        double maiorConsumo = 0;
        int setorMaior = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o consumo de água do setor " + (i + 1) + ": ");
            consumo[i] = scanner.nextDouble();

            if (i == 0 || consumo[i] > maiorConsumo) {
                maiorConsumo = consumo[i];
                setorMaior = i + 1;
            }
        }

        System.out.println("\nO setor que consumiu mais água foi o Setor " + setorMaior + " com " + maiorConsumo + " unidades.");
        scanner.close();
    }
}

class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Atividade 4: Produção de Hortaliças (5 talhões) ---");
        double[] talhoes = new double[5];
        double totalGeral = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a produção do talhão " + (i + 1) + ": ");
            talhoes[i] = scanner.nextDouble();
            totalGeral += talhoes[i];
        }

        System.out.println("\n--- Relatório por Talhão ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Talhão " + (i + 1) + ": " + talhoes[i] + " unidades");
        }
        System.out.println("Total Geral Produzido: " + totalGeral + " unidades.");
        scanner.close();
    }
}

class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Atividade 5: Umidade do Solo (8 áreas) ---");
        double[] umidade = new double[8];
        int areasBaixas = 0;

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a umidade da área " + (i + 1) + " (%): ");
            umidade[i] = scanner.nextDouble();
            if (umidade[i] < 40.0) {
                areasBaixas++;
            }
        }

        System.out.println("\nQuantidade de áreas com umidade inferior a 40%: " + areasBaixas);
        scanner.close();
    }
}

class Atividade6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Atividade 6: Produção por Mês e Cultura (Matriz 4x3) ---");
        double[][] matriz = new double[4][3];
        String[] nomesCulturas = {"Cultura A", "Cultura B", "Cultura C"};

        for (int m = 0; m < 4; m++) {
            System.out.println("\n--- Mês " + (m + 1) + " ---");
            for (int c = 0; c < 3; c++) {
                System.out.print("Digite a produção da " + nomesCulturas[c] + ": ");
                matriz[m][c] = scanner.nextDouble();
            }
        }

        System.out.println("\n--- Produção Total de Cada Cultura ---");
        for (int c = 0; c < 3; c++) {
            double totalCultura = 0;
            for (int m = 0; m < 4; m++) {
                totalCultura += matriz[m][c];
            }
            System.out.println(nomesCulturas[c] + " - Total: " + totalCultura);
        }
        scanner.close();
    }
}

class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Atividade 7: Monitoramento de Chuvas (Matriz 7x4) ---");
        double[][] chuvas = new double[7][4];

        for (int dia = 0; dia < 7; dia++) {
            System.out.println("\n--- Dia " + (dia + 1) + " ---");
            for (int area = 0; area < 4; area++) {
                System.out.print("Chuva na Área " + (area + 1) + " (mm): ");
                chuvas[dia][area] = scanner.nextDouble();
            }
        }

        System.out.println("\n--- Total de Chuva por Área ---");
        for (int area = 0; area < 4; area++) {
            double totalArea = 0;
            for (int dia = 0; dia < 7; dia++) {
                totalArea += chuvas[dia][area];
            }
            System.out.printf("Área %d - Total acumulado: %.2f mm\n", (area + 1), totalArea);
        }
        scanner.close();
    }
}

class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Atividade 8: Controle de Pragas (Matriz 5x5) ---");
        int[][] pragas = new int[5][5];
        int maiorFocos = -1;
        int linhaMaior = 0, colunaMaior = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Focos de pragas na Região [Linha " + (i + 1) + ", Coluna " + (j + 1) + "]: ");
                pragas[i][j] = scanner.nextInt();

                if (pragas[i][j] > maiorFocos) {
                    maiorFocos = pragas[i][j];
                    linhaMaior = i + 1;
                    colunaMaior = j + 1;
                }
            }
        }

        System.out.println("\nRegião crítica com maior quantidade de focos de pragas:");
        System.out.println("Linha " + linhaMaior + ", Coluna " + colunaMaior + " com " + maiorFocos + " focos.");
        scanner.close();
    }
}

class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Atividade 9: Mapa de Fertilidade do Solo (Matriz 6x6) ---");
        double[][] fertilidade = new double[6][6];

        for (int i = 0; i < 6; i++) {
            System.out.println("\n--- Linha " + (i + 1) + " ---");
            for (int j = 0; j < 6; j++) {
                System.out.print("Índice de fertilidade [Coluna " + (j + 1) + "]: ");
                fertilidade[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n--- Média de Fertilidade por Linha ---");
        for (int i = 0; i < 6; i++) {
            double somaLinha = 0;
            for (int j = 0; j < 6; j++) {
                somaLinha += fertilidade[i][j];
            }
            double mediaLinha = somaLinha / 6;
            System.out.printf("Média da Linha %d: %.2f\n", (i + 1), mediaLinha);
        }
        scanner.close();
    }
}

class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Atividade 10: Produção de Frutas (Matriz 4x12) ---");
        double[][] producaoPomar = new double[4][12];
        double maiorProducaoAnual = -1;
        int pomarCampeao = 0;

        for (int p = 0; p < 4; p++) {
            System.out.println("\n--- Pomar " + (p + 1) + " ---");
            double totalAnualPomar = 0;
            for (int m = 0; m < 12; m++) {
                System.out.print("Produção no mês " + (m + 1) + ": ");
                producaoPomar[p][m] = scanner.nextDouble();
                totalAnualPomar += producaoPomar[p][m];
            }

            if (totalAnualPomar > maiorProducaoAnual) {
                maiorProducaoAnual = totalAnualPomar;
                pomarCampeao = p + 1;
            }
        }

        System.out.println("\nO pomar que obteve a maior produção anual foi o Pomar " + pomarCampeao + " com um total de " + maiorProducaoAnual + " unidades.");
        scanner.close();
    }
}