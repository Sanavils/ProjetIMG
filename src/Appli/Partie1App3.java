package Appli;

import algoimage.HistogrammeTools;
import fr.unistra.pelican.Image;
import fr.unistra.pelican.algorithms.io.ImageLoader;

import static algoimage.Algorithme.Discretisation;
import static algoimage.Algorithme.Histo;

public class Partie1App3 {
    public static void main(String[] args) throws Exception {
        Image test1 = ImageLoader.exec("C:/Users/33783/OneDrive/Images/Webcam/eiffel.jpg");
        double[][] histo = Histo(test1);

        double[][] histoR = Discretisation(histo);
        double[][] histoR1 = Discretisation(histoR);
        double[][] histoR2 = Discretisation(histoR1);
        double[][] histoR3 = Discretisation(histoR2);
        double[][] histoR4 = Discretisation(histoR3);


        HistogrammeTools.plotHistogram( histoR4[0]);
        HistogrammeTools.plotHistogram( histoR4[1]);
        HistogrammeTools.plotHistogram( histoR4[2]);



    }


}
