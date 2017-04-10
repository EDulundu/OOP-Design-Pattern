package filter;

import algorithm.Algorithm;
import vpt.Image;

/**
 * This interface was done for the user to use.
 * User interface. Something like that.
 * Created by safa emre dulundu on 27.10.2016.
 */
public interface Filter {

    /**
     * First of all, User set any algorithm. Otherwise get NullPointerException.
     * Because abstractFilter will be null.
     * @param filterAlgo any algorithm.
     */
    void setFilterAlgo(Algorithm filterAlgo);

    /**
     * User should use to use filter algorithms.
     * @param originalImage original image (greyscale image)
     * @return copy image.
     */
    Image useFilter(Image originalImage);
}