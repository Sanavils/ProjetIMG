import fr.unistra.pelican.ByteImage;
import fr.unistra.pelican.Image;
import fr.unistra.pelican.algorithms.io.ImageLoader;
import fr.unistra.pelican.algorithms.visualisation.Viewer2D;

import java.util.ArrayList;
import java.util.Collections;

public class app {
    public static void main(String[] args) {
        Image test1 = ImageLoader.exec("/Users/hassenarkab/Downloads/motos/240.jpg");
        median(test1);

    }

    public static void median(Image image){
        ByteImage imageModif = new ByteImage(image.getXDim(), image.getYDim(), 1, 1, 1);
        for (int i = 1; i < image.getXDim() - 2; i++) {
            for (int j = 1; j < image.getYDim() - 2; j++) {
                ArrayList<Integer> tab = new ArrayList<Integer>();
                tab.add(image.getPixelXYByte(i,j));
                tab.add(image.getPixelXYByte(i,j-1));
                tab.add(image.getPixelXYByte(i,j+1));
                tab.add(image.getPixelXYByte(i+1,j));
                tab.add(image.getPixelXYByte(i+1,j-1));
                tab.add(image.getPixelXYByte(i+1,j+1));
                tab.add(image.getPixelXYByte(i-1,j));
                tab.add(image.getPixelXYByte(i-1,j-1));
                tab.add(image.getPixelXYByte(i-1,j+1));
                Collections.sort(tab);
                int median = tab.get(tab.size()/2);
                imageModif.setPixelXYByte(i,j,median);
            }
        }
        Viewer2D.exec(imageModif);
    }

}

