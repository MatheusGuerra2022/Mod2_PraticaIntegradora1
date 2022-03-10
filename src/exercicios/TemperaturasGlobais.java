package exercicios;

import java.util.Arrays;

public class TemperaturasGlobais {




    public static void main(String[] args) {

        int tempMax = -100;
        int tempMaxPosition = 0;

        int tempMin = 100;
        int tempMinPosition = 0;

        //Inicialização do vetor com o nome das cidades
        String[] cidades = new String[10];

        cidades[0] = "Londres";
        cidades[1] = "Madrid";
        cidades[2] = "Nueva York";
        cidades[3] = "Buenos Aires";
        cidades[4] = "Asuncion";
        cidades[5] = "Sao Paulo";
        cidades[6] = "Lima";
        cidades[7] = "Santiago de Chile";
        cidades[8] = "Lisboa";
        cidades[9] = "Tokio";

        // Teste de impressão
        // System.out.println(Arrays.toString(cidades));

        //Inicialização da matriz com os valores de temperatura
        int[][]temperaturas = new int[][]
                {
                        {-2,33},
                        {-3,32},
                        {-8,27},
                        {4,37},
                        {6,42},
                        {5,43},
                        {0,39},
                        {-7,26},
                        {-1,31},
                        {-10,35}
                };
        // Teste de impressão
//        for(int i = 0; i < temperaturas.length; i++ ){
//            System.out.println(Arrays.toString(temperaturas[i]));
//
//        }

        for (int i = 0; i < temperaturas.length; i ++){

            if(temperaturas[i][1] > tempMax){
                tempMax = temperaturas[i][1];
                tempMaxPosition = i;
            }
            if(temperaturas[i][0] < tempMin){
                tempMin = temperaturas[i][0];
                tempMinPosition = i;
            }

        }

        System.out.println("A temperatura maxima foi observada em " + cidades[tempMaxPosition] +
                " com " + temperaturas[tempMaxPosition][1] + " °C");

        System.out.println("A temperatura minima foi observada em " +  cidades[tempMinPosition] +
                " com " + temperaturas[tempMinPosition][0] + " °C");

    }



}
