import java.util.Scanner;

public class Main {
    private static final int I = ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Costo_Internet = 700000;
        int Costo_Radio = 200000;
        int Costo_Tv = 600000;

        int Voto_1 = 0;
        int Voto_2 = 0;
        int Voto_3 = 0;

        int AI = 0, AR = 0, AT = 0;
        int BI = 0, BR = 0, BT = 0;
        int CI = 0, CR = 0, CT = 0;


        int Costo1 = 0;
        int Costo2 = 0;
        int Costo3 = 0;
        int total = 0;
        int opcion = 0;

        do {
            System.out.println("\n=== Elecciones ===");
            System.out.println("1) Votar por el candidato de su elección ");
            System.out.println("2) Calcular el costo de campaña de un candidato dependiendo de la influencia publicitaria de cada voto");
            System.out.println("3) Vaciar todas las urnas de la votación ");
            System.out.println("4) Conocer el número total de votos");
            System.out.println("5) Porcentaje de votos obtenidos por cada candidato");
            System.out.println("6) Costo promedio de campaña en las elecciones");
            System.out.println("7) Conocer el candidato ganador");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    System.out.println("Por favor ingrese el numero del candidato: 1)Andres  2)Blanca  3)Carlos");
                    System.out.print("candidato: ");
                    int Candidato = sc.nextInt();

                    switch (Candidato) {
                        case 1:
                            Voto_1++;

                            System.out.println("Por favor ingrese el medio : Internet=I, Radio=R, Televisión=T: ");
                            System.out.print("Medio: ");
                            int medio = sc.nextInt();

                            if (medio == 1) {
                                AI++;
                                Costo1 += Costo_Internet;

                            } else if (medio == 2) {
                                AR++;
                                Costo2 += Costo_Radio;

                            } else if (medio == 3) {
                                AT++;
                                Costo3 += Costo_Tv;
                            }
                        case 2:
                            Voto_2++;
                            System.out.println("Por favor ingrese el medio : Internet=I, Radio=R, Televisión=T: ");
                            System.out.print("Medio: ");
                            int medio = sc.nextInt();

                    }
                    if (medio == 1) {
                        BI++;
                        Costo1 += Costo_Internet;

                    } else if (medio == 2) {
                        BR++;
                        Costo2 += Costo_Radio;

                    } else if (medio == 3) {
                        BT++;
                        Costo3 += Costo_Tv;
                    }

                case 3:
                    Voto_3++;
                    System.out.println("Por favor ingrese el medio : Internet=I, Radio=R, Televisión=T: ");
                    System.out.print("Medio: ");
                    int medio = sc.nextInt();

                    if (medio == 1) {
                        CI++;
                        Costo1 += Costo_Internet;

                    } else if (medio == 2) {
                        CR++;
                        Costo2 += Costo_Radio;

                    } else if (medio == 3) {
                        CT++;
                        Costo3 += Costo_Tv;


                        total++;
                        System.out.println("Voto registrado.");
                    } else {
                        System.out.println("Datos inválidos.");
                    }
                    break;


                case 4:
                    System.out.println("Por favor ingrese el numero del candidato: 1)A  2)B  3) C");
                    System.out.print("Número candidato: ");


                    if (sel == 1) {
                        System.out.println("Candidato A  I=" + AI + " ($" + (AI * Costo_Internet) + "), R=" + AR + " ($" + (AR * Costo_Radio) + "), T=" + AT + " ($" + (AT * Costo_Tv) + ")");
                        System.out.println("Costo total A: $" + Costo1);
                    } else if (sel == 2) {
                        System.out.println("Candidato B  I=" + BI + " ($" + (BI * Costo_Internet) + "), R=" + BR + " ($" + (BR * Costo_Radio) + "), T=" + BT + " ($" + (BT * Costo_Tv) + ")");
                        System.out.println("Costo total B: $" + Costo2);
                    } else if (sel == 3) {
                        System.out.println("Candidato C  I=" + CI + " ($" + (CI * Costo_Internet) + "), R=" + CR + " ($" + (CR * Costo_Radio) + "), T=" + CT + " ($" + (CT * Costo_Tv) + ")");
                        System.out.println("Costo total C: $" + Costo3);
                    } else {
                        System.out.println("Candidato inválido.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");

            }
            }while(opcion!=7);
        }
    }
