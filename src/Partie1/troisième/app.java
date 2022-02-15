package Partie1.troisième;

import Partie1.deuxième.Histo;
import fr.unistra.pelican.Image;
import fr.unistra.pelican.algorithms.io.ImageLoader;

import static Partie1.deuxième.app.*;

public class app {
    public static void main(String[] args) throws Exception {
        Image test1 = ImageLoader.exec("C:/Users/33783/OneDrive/Images/motos/motos/240.jpg");
        Histo(test1);
    }

    public static void Histo(Image test) throws Exception {
        double[] histoRouge = Discretisation(Discretisation(getHisto(test, 0)));
        double[] histoVert = Discretisation(Discretisation(getHisto(test, 1)));
        double[] histoBleu = Discretisation(Discretisation(getHisto(test, 2)));
        Histo.plotHistogram(histoRouge);
        Histo.plotHistogram(histoVert);
        Histo.plotHistogram(histoBleu);
}

    public static double[] Discretisation(double[] hist) {
        double discreHist[] = new double[hist.length / 2];
        System.out.println(hist.length);
        for (int i = 0; i < discreHist.length-1 ; i = i+2) {
            discreHist[i] = hist[i] + hist[i + 1];
        }

        return discreHist;

    }


}
