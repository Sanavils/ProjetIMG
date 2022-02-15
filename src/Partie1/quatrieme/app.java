package Partie1.quatrieme;

import Partie1.deuxième.Histo;
import fr.unistra.pelican.Image;
import fr.unistra.pelican.algorithms.io.ImageLoader;

import static Partie1.deuxième.app.getHisto;
import static Partie1.troisième.app.Discretisation;

public class app {

    public static void main(String[] args) throws Exception {
        Image test1 = ImageLoader.exec("C:/Users/33783/OneDrive/Images/motos/motos/240.jpg");
        Histo(test1);

    }

    public static void Histo(Image test) throws Exception {
        double[] histoRouge = getHisto(test, 0);
        double[] histoVert = getHisto(test, 1);
        double[] histoBleu = getHisto(test, 2);
        Histo.plotHistogram(histoRouge);
        Histo.plotHistogram(histoVert);
        Histo.plotHistogram(histoBleu);
    }

    public static double[] getHisto(Image image, int canal) {
        double histo[] = new double[256];
        for (int i = 0; i < histo.length; i++) {
            histo[i] = 0;
        }
        for (int x = 0; x < image.getXDim(); x++) {
            for (int y = 0; y < image.getYDim(); y++) {
                histo[image.getPixelXYBByte(x, y, canal)] += 1;
            }
        }
        return histo;
    }

    public static double[] normaliser(double[] histo, int pixels){
        double[] n = new double[histo.length];
        pixels = histo.length;
        for(int i =0; i< histo.length;i++){
            n[i] = (histo[i]) / pixels;
        }
        return n;
    }



}
