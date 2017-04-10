package filter;

import algorithm.Algorithm;

/**
 * Smooth class.
 *
 * only use Smoothing algorithms.
 *
 * Created by safa emre dulundu on 27.10.2016.
 */
public class Smooth extends AbstractFilter {

    public Smooth(){
        super();
    }

    public Smooth(Algorithm algo){
        super();
        setFilterAlgo(algo);
    }
}
