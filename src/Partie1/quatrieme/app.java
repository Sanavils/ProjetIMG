package Partie1.quatrieme;

import Partie1.deuxième.Histo;
import fr.unistra.pelican.Image;
import fr.unistra.pelican.algorithms.io.ImageLoader;

public class app {

    public static void main(String[] args) throws Exception {
        Image test1 = ImageLoader.exec("C:/Users/33783/OneDrive/Images/motos/motos/240.jpg");
        Histo(test1);

    }

    public static void Histo(Image test) throws Exception {
        int largeur = test.getXDim();
        int hauteur = test.getYDim();
        int nbDim = test.getBDim();
        double histoRGB[][] = new double[3][256];

        for (int x = 0; x < largeur; x++) {
            for (int y = 0; y < hauteur; y++) {
                for (int a = 0; a < nbDim; a++) {
                    int valeur = test.getPixelXYBByte(x, y, a);
                    if (a == 0) {
                        histoRGB[a][valeur] += 1;
                    } else if (a == 1) {
                        histoRGB[a][valeur] += 1;
                    } else if (a == 2) {
                        histoRGB[a][valeur] += 1;

                    }
                }

            }

        }
        double [][] normHisto = normaliser(histoRGB, histoRGB.length);
        Histo.plotHistogram( normHisto[0]);
        Histo.plotHistogram( normHisto[1]);
        Histo.plotHistogram( normHisto[2]);
    }



    public static double[][] normaliser(double[][] histo, int pixels){
        double[][] n = new double[3][histo[0].length];
        pixels = histo.length;
        for(int a=0; a<3; a++){
            for(int i =0; i< histo[0].length;i++) {
                n[a][i] = (histo[a][i]) / pixels;
            }
        }
        return n;
    }



}
