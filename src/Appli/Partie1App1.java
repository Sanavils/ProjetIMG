package Appli;

import fr.unistra.pelican.ByteImage;
import fr.unistra.pelican.Image;
import fr.unistra.pelican.algorithms.io.ImageLoader;
import fr.unistra.pelican.algorithms.visualisation.Viewer2D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static algoimage.Algorithme.filtreMedian;

public class Partie1App1 {
    public static void main(String[] args) {
        Image test1 = ImageLoader.exec("./data/motos/240.jpg");
        filtreMedian(test1);

    }

}
