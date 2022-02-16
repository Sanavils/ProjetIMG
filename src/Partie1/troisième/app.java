package Partie1.troisième;

import Partie1.deuxième.Histo;
import fr.unistra.pelican.Image;
import fr.unistra.pelican.algorithms.io.ImageLoader;

import java.io.IOException;

public class app {
    public static void main(String[] args) throws Exception {
        Image test1 = ImageLoader.exec("C:/Users/33783/OneDrive/Images/Webcam/eiffel.jpg");
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


        double[][] histoR = Discretisation(histoRGB);
        double[][] histoR1 = Discretisation(histoR);
        double[][] histoR2 = Discretisation(histoR1);
        double[][] histoR3 = Discretisation(histoR2);
        double[][] histoR4 = Discretisation(histoR3);


        Histo.plotHistogram( histoR4[0]);
        Histo.plotHistogram( histoR4[1]);
        Histo.plotHistogram( histoR4[2]);



    }




    public static double[][] Discretisation(double[][] hist) throws IOException {
        double[][] discreteHist = new double[3][hist[0].length / 2];
         for(int a=0; a<3; a++){
            for (int i = 0; i < discreteHist[0].length ; i = i+1) {
                discreteHist[a][i] = hist[a][i] + hist[a][i + 1];
            }
        }

        return discreteHist;

    }

}
