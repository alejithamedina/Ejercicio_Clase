import java.util.Scanner;

public class Main {

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
        int total =  0;
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
                                Costo1 += Costo_Radio;

                            } else if (medio == 3) {
                                AT++;
                                Costo1 += Costo_Tv;
                            }
                            break;
                    }
                    total++;
                    System.out.println("Voto registrado.");
                    break;

                case 2:
                    Voto_2++;
                    System.out.println("Por favor ingrese el medio : Internet=I, Radio=R, Televisión=T: ");
                    System.out.print("Medio: ");
                    int medio1 = sc.nextInt();

                    if (medio1 == 1) {
                        BI++;
                        Costo2 += Costo_Internet;

                    } else if (medio1 == 2) {
                        BR++;
                        Costo2 += Costo_Radio;

                    } else if (medio1 == 3) {
                        BT++;
                        Costo2 += Costo_Tv;
                    }
                    break;

                    total++;
                    System.out.println("Voto registrado.");
                    break;

            case 3:
                Voto_3++;
                System.out.println("Por favor ingrese el medio : Internet=I, Radio=R, Televisión=T: ");
                System.out.print("Medio: ");
                int medio2 = sc.nextInt();

                if (medio2 == 1) {
                    CI++;
                    Costo3 += Costo_Internet;

                } else if (medio2 == 2) {
                    CR++;
                    Costo3 += Costo_Radio;

                } else if (medio2 == 3) {
                    CT++;
                    Costo3 += Costo_Tv;

                break;
            total++;
            System.out.println("Voto registrado.");
            break;
        }
                        case 2:
                            System.out.println("Por favor ingrese el numero del candidato: 1)Andres  2)Blanca  3)Carlos");
                            System.out.print("candidato: ");


                            if (sel == 1) {
                                System.out.println("1  I=" + AI + " ($" + (AI * Costo_Internet) + "), R=" + AR + " ($" + (AR * Costo_Radio) + "), T=" + AT + " ($" + (AT * Costo_Tv) + ")");
                                System.out.println("Costo total A: $" + Costo1);
                            } else if (sel == 2) {
                                System.out.println("2  I=" + BI + " ($" + (BI * Costo_Internet) + "), R=" + BR + " ($" + (BR * Costo_Radio) + "), T=" + BT + " ($" + (BT * Costo_Tv) + ")");
                                System.out.println("Costo total B: $" + Costo2);
                            } else if (sel == 3) {
                                System.out.println("3  I=" + CI + " ($" + (CI * Costo_Internet) + "), R=" + CR + " ($" + (CR * Costo_Radio) + "), T=" + CT + " ($" + (CT * Costo_Tv) + ")");
                                System.out.println("Costo total C: $" + Costo3);
                            } else {
                                System.out.println("Candidato inválido.");
                            }
                            break;

                        case 3:
                            Voto_1 = Voto_2 = Voto_3 = 0;
                            AI = AR = AT = 0;
                            BI = BR = BT = 0;
                            CI = CR = CT = 0;
                            Costo1 = Costo2 = Costo3 = 0;
                            total = 0;
                            System.out.println("Urnas y costos reiniciados.");
                            break;
                        case 4:
                            System.out.println("Total de votos: " + total);
                            System.out.println("Andres: " + Voto_1 + "  Blanca: " + Voto_2 + "  Carlos: " + Voto_3);
                            break;

                         case 5:
                             if (total == 0) {
                                 System.out.println("Aún no hay votos.");
                             } else {
                                 double pA = (Voto_1 * 100.0) / total;
                                 double pB = (Voto_2 * 100.0) / total;
                                 double pC = (Voto_3 * 100.0) / total;
                                 System.out.printf("Porcentajes -> Andres: %.2f%%, Blanca: %.2f%%, Carlos: %.2f%%%n", pA, pB, pC);
                             }
                             break;
                             case 6:
                            int costoTotal = Costo1 + Costo2 + Costo3;
                            if (total == 0) {
                                System.out.println("No hay votos para calcular promedios.");
                            } else {
                                double costoPromedioPorVoto = costoTotal / (double) total;
                                System.out.println("Costo total campañas: $" + costoTotal);
                                System.out.printf("Costo promedio por voto: $%.2f%n", costoPromedioPorVoto);
                            }
                            break;

                case 7:
                    if (total == 0) {
                        System.out.println("Aún no hay votos.");
                    } else {
                        int max = Math.max(Voto_1, Math.max(Voto_2, Voto_3));
                        boolean a = Voto_1 == max;
                        boolean b = Voto_2 == max;
                        boolean c = Voto_3 == max;
                        if ((a ? 1 : 0) + (b ? 1 : 0) + (c ? 1 : 0) > 1) {
                            System.out.println("Empate entre: " + (a ? "Andres " : "") + (b ? "Blanca " : "") + (c ? "Carlos " : ""));
                        } else {
                            String ganador = a ? "Andres" : b ? "Blanca" : "Carlos";
                            System.out.println("Ganador: " + ganador);
                        }
                    }
                    break;
                    case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 8);

        sc.close();
    }
}



