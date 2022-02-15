package Partie1.deuxième;

import fr.unistra.pelican.Image;
import fr.unistra.pelican.algorithms.io.ImageLoader;

import java.io.IOException;

import static Partie1.troisième.app.Discretisation;

public class app {

    public static void main(String[] args) throws Exception {
        Image test1 = ImageLoader.exec("./motos/motos/240.jpg");
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



}


