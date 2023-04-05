package Presenter;

import Model.Entities.Patrulater;
import Model.Entities.Punct;
import Model.Entities.Segment;
import View.IGameView;
import View.PatrulaterDrawing;

import java.util.ArrayList;

public class GamePresenter {

    final private IGameView iGameView;

    private ArrayList<Punct> listaPuncte = new ArrayList<>();
    private Patrulater patrulaterCalcule;

    public GamePresenter(IGameView iGameView) {
        this.iGameView = iGameView;
    }

    public void handleClick(int x, int y) {
        if (x < 390 && y < 390) {

            System.out.println(x + "," + y);
            Punct punct = new Punct(x, y);
            listaPuncte.add(punct);

            if (listaPuncte.size() == 4) {
                System.out.println("Informatii patrulater complete");

                Patrulater patrulater = new Patrulater(listaPuncte);
                patrulaterCalcule = patrulater;
                PatrulaterDrawing patrulaterDrawing = new PatrulaterDrawing(patrulater);

                iGameView.getDrawingsArray().clear();

                iGameView.getDrawingsArray().add(patrulaterDrawing);
                iGameView.redraw();
                listaPuncte.clear();
            }
        }
    }

    public void afisareInformatii() {

        int L1 = patrulaterCalcule.getListaSegmente().get(0).getLength();
        int L2 = patrulaterCalcule.getListaSegmente().get(1).getLength();
        int L3 = patrulaterCalcule.getListaSegmente().get(2).getLength();
        int L4 = patrulaterCalcule.getListaSegmente().get(3).getLength();

        iGameView.getLatura1Field().setText(L1 + " cm");
        iGameView.getLatura2Field().setText(L2 + " cm");
        iGameView.getLatura3Field().setText(L3 + " cm");
        iGameView.getLatura4Field().setText(L4 + " cm");

        int perimetru = L1 + L2 + L3 + L4;
        int produsulLaturilor = L1 * L2 * L3 * L4;
        double aria = 0;

        iGameView.getPerimetruField().setText(perimetru + " cm");

        Punct p1 = new Punct(patrulaterCalcule.getListaPuncte().get(0).getX(), patrulaterCalcule.getListaPuncte().get(0).getY());
        Punct p2 = new Punct(patrulaterCalcule.getListaPuncte().get(1).getX(), patrulaterCalcule.getListaPuncte().get(1).getY());
        Punct p3 = new Punct(patrulaterCalcule.getListaPuncte().get(2).getX(), patrulaterCalcule.getListaPuncte().get(2).getY());
        Punct p4 = new Punct(patrulaterCalcule.getListaPuncte().get(3).getX(), patrulaterCalcule.getListaPuncte().get(3).getY());

        Segment diagonala1 = new Segment(p1, p3);
        Segment diagonala2 = new Segment(p2, p4);

        int D1 = diagonala1.getLength();
        int D2 = diagonala2.getLength();

        double unghi1 = Math.toDegrees(Math.acos((double) (L1 * L1 + L4 * L4 - D2 * D2) / (2 * L1 * L4)));
        double unghi2 = Math.toDegrees(Math.acos((double) (L1 * L1 + L2 * L2 - D1 * D1) / (2 * L1 * L2)));
        double unghi3 = Math.toDegrees(Math.acos((double) (L2 * L2 + L3 * L3 - D2 * D2) / (2 * L2 * L3)));
        double unghi4 = Math.toDegrees(Math.acos((double) (L3 * L3 + L4 * L4 - D1 * D1) / (2 * L3 * L4)));

        double sumaUnghiuri = unghi1 + unghi2 + unghi3 + unghi4;

        String output1 = String.format("%.3f°", unghi1);
        String output2 = String.format("%.3f°", unghi2);
        String output3 = String.format("%.3f°", unghi3);
        String output4 = String.format("%.3f°", unghi4);

        iGameView.getUnghi1Field().setText(output1);
        iGameView.getUnghi2Field().setText(output2);
        iGameView.getUnghi3Field().setText(output3);
        iGameView.getUnghi4Field().setText(output4);

        if (358 < sumaUnghiuri && sumaUnghiuri < 362) {

            aria = Math.sqrt(((double) perimetru / 2 - L1) * ((double) perimetru / 2 - L2) * ((double) perimetru / 2 - L3) *
                    ((double) perimetru / 2 - L4) - produsulLaturilor * Math.pow(Math.cos((unghi1 + unghi3) / 2), 2));

            iGameView.getArieField().setText(String.format("%.2f cm2", aria));
            iGameView.getConvexConcavField().setText("Convex");

        } else {

            iGameView.getConvexConcavField().setText("Concav");
            double unghi1obtuz = 360 - unghi1;
            double unghi2obtuz = 360 - unghi2;
            double unghi3obtuz = 360 - unghi3;
            double unghi4obtuz = 360 - unghi4;

            if (unghi1obtuz + unghi2 + unghi3 + unghi4 > 358 && unghi1obtuz + unghi2 + unghi3 + unghi4 < 362) {

                unghi1 = unghi1obtuz;
                iGameView.getUnghi1Field().setText(String.format("%.3f°", unghi1));
                aria = Math.sqrt(((double) perimetru / 2 - L1) * ((double) perimetru / 2 - L2) * ((double) perimetru / 2 - L3) *
                        ((double) perimetru / 2 - L4) - produsulLaturilor * Math.pow(Math.cos((unghi1 + unghi3) / 2), 2));
                iGameView.getArieField().setText(String.format("%.2f cm2", aria));

            } else if (unghi1 + unghi2obtuz + unghi3 + unghi4 > 358 && unghi1 + unghi2obtuz + unghi3 + unghi4 < 362) {

                unghi2 = unghi2obtuz;
                iGameView.getUnghi2Field().setText(String.format("%.3f°", unghi2));
                aria = Math.sqrt(((double) perimetru / 2 - L1) * ((double) perimetru / 2 - L2) * ((double) perimetru / 2 - L3) *
                        ((double) perimetru / 2 - L4) - produsulLaturilor * Math.pow(Math.cos((unghi1 + unghi3) / 2), 2));
                iGameView.getArieField().setText(String.format("%.2f cm2", aria));

            } else if (unghi1 + unghi2 + unghi3obtuz + unghi4 > 358 && unghi1 + unghi2 + unghi3obtuz + unghi4 < 362) {

                unghi3 = unghi3obtuz;
                iGameView.getUnghi3Field().setText(String.format("%.3f°", unghi3));
                aria = Math.sqrt(((double) perimetru / 2 - L1) * ((double) perimetru / 2 - L2) * ((double) perimetru / 2 - L3) *
                        ((double) perimetru / 2 - L4) - produsulLaturilor * Math.pow(Math.cos((unghi1 + unghi3) / 2), 2));
                iGameView.getArieField().setText(String.format("%.2f cm2", aria));

            } else if (unghi1 + unghi2 + unghi3 + unghi4obtuz > 358 && unghi1 + unghi2 + unghi3 + unghi4obtuz < 362) {

                unghi4 = unghi4obtuz;
                iGameView.getUnghi4Field().setText(String.format("%.3f°", unghi4));
                aria = Math.sqrt(((double) perimetru / 2 - L1) * ((double) perimetru / 2 - L2) * ((double) perimetru / 2 - L3) *
                        ((double) perimetru / 2 - L4) - produsulLaturilor * Math.pow(Math.cos((unghi1 + unghi3) / 2), 2));
                iGameView.getArieField().setText(String.format("%.2f cm2", aria));

            }
        }

        double suma1UnghiuriOpuse = unghi1 + unghi3;
        double suma2UnghiuriOpuse = unghi2 + unghi4;
        double razaCerculuiInscris = 0;

        if (176 < suma1UnghiuriOpuse && suma1UnghiuriOpuse < 184 && 176 < suma2UnghiuriOpuse && suma2UnghiuriOpuse < 184) {

            iGameView.getInscriptibilField().setText("Da");
            razaCerculuiInscris = aria / ((double) perimetru / 2);
            iGameView.getRazaCercInscrisField().setText(String.format("%.2f cm", razaCerculuiInscris));

        } else {
            iGameView.getInscriptibilField().setText("Nu");
            iGameView.getRazaCercInscrisField().setText("-");
        }

        double produsDiagonale = D1 * D2;
        double produsLungimiLaturiOpuse = 2 * (L1 * L3 + L2 * L4);
        double razaCerculuiCircumscris = 0;

        if (produsDiagonale == produsLungimiLaturiOpuse) {

            iGameView.getCircumscriptibilField().setText("Da");
            razaCerculuiCircumscris = produsulLaturilor / (4 * aria);
            iGameView.getRazaCerCircumscrisField().setText(String.format("%.2f cm", razaCerculuiCircumscris));

        } else {
            iGameView.getCircumscriptibilField().setText("Nu");
            iGameView.getRazaCerCircumscrisField().setText("-");
        }

    }


}
