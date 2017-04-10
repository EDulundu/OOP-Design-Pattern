package algorithm;

import vpt.Image;

/**
 * This interface was implemented by MorphoInt,Ext,SmoothingAverage and Median
 * Created by safa emre dulundu on 27.10.2016.
 */
public interface Algorithm {

    /**
     * four algorithms are implemented.
     * @param originalImage original image
     * @return copy image
     */
    Image implementAlgorithm(Image originalImage);
}
