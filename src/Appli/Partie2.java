package Appli;

import algoimage.Algorithme;
import algoimage.Indexation;
import fr.unistra.pelican.Image;
import fr.unistra.pelican.algorithms.io.ImageLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Partie2 {
    private static String MODE="rgb";
    public static void main(String[] args) throws Exception {

        Image result;
        List<String> imagesResultat = new ArrayList<>();
        Indexation.writeHistograms();
        result = Algorithme.getImageQuery();
        if (result.getBDim() == 3) {
            Map<Double, String> similar = Algorithme.getSimilarImages(result, MODE);
            for (Map.Entry<Double, String> entry : similar.entrySet()) {
                System.out.println("Distance : " + entry.getKey() + " Fichier : " + entry.getValue());
                imagesResultat.add(entry.getValue());
            }

        }

    }


}

