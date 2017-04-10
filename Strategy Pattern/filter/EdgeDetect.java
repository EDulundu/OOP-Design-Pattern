package filter;

import algorithm.Algorithm;

/**
 * Edge Detect class
 *
 * only use Edge Detection algorithms.
 *
 * Created by safa emre dulundu on 27.10.2016.
 */
public class EdgeDetect extends AbstractFilter {

    public EdgeDetect(){
        super();
    }

    public EdgeDetect(Algorithm algo){
        super();
        setFilterAlgo(algo);
    }
}
