package filter;

import algorithm.Algorithm;
import vpt.Image;

/**
 * all of classes extends of abstractFilter.
 * Created by safa emre dulundu on 27.10.2016.
 */
public abstract class AbstractFilter implements Filter {

    protected Algorithm filterAlgo;

    public AbstractFilter(){
        this.filterAlgo = null;
    }

    /**
     * First of all, User set any algorithm. Otherwise get NullPointerException.
     * Because abstractFilter will be null.
     * @param filterAlgo any algorithm.
     */
    public void setFilterAlgo(Algorithm filterAlgo){
        this.filterAlgo = filterAlgo;
    }

    /**
     * User should use to use filter algorithms.
     * @param originalImage original image (greyscale image)
     * @return copy image.
     */
    public Image useFilter(Image originalImage){
        return this.filterAlgo.implementAlgorithm(originalImage);
    }
}
