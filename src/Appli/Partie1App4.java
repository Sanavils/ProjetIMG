package Appli;

import fr.unistra.pelican.Image;
import fr.unistra.pelican.algorithms.io.ImageLoader;
import algoimage.HistogrammeTools;

import static algoimage.Algorithme.Histo;
import static algoimage.Algorithme.normaliser;

public class Partie1App4 {

    public static void main(String[] args) throws Exception {
        Image test1 = ImageLoader.exec("C:/Users/33783/OneDrive/Images/motos/motos/240.jpg");
        double[][] histoRGB = Histo(test1);
        double [][] normHisto = normaliser(histoRGB, histoRGB.length);
        HistogrammeTools.plotHistogram( normHisto[0]);
        HistogrammeTools.plotHistogram( normHisto[1]);
        HistogrammeTools.plotHistogram( normHisto[2]);

    }










}
