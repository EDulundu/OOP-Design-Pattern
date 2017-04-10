package algorithm;

import vpt.Image;

/**
 * This algorithm for Smoothing.
 * SmoothingAverage
 * Created by safa emre dulundu on 27.10.2016.
 */
public class SmoothingAverage implements Algorithm {

    /**
     * four algorithms are implemented.
     * @param originalImage original image
     * @return copy image
     */
    @Override
    public Image implementAlgorithm(Image originalImage) {

        Image copyImage = originalImage.newInstance(false);

        for(int i = 0; i < originalImage.getYDim(); i++){
            for(int j = 0; j < originalImage.getXDim(); j++){
                int sum = 0;
                for(int k = i - 2; k <= i + 2; k++){
                    for(int l = j - 2; l <= j + 2; l++){
                        sum += getValue(l,k, originalImage);
                    }
                }
                sum = sum / 25;
                copyImage.setXYByte(j,i, sum);
            }
        }

        return copyImage;
    }

    /**
     * This is a helper function.
     * @param xCoor x axis
     * @param yCoor y axis
     * @param img original image
     * @return if coordinate is available return pixel value, otherwise return zero.
     */
    private int getValue(int xCoor, int yCoor, Image img){

        if( (xCoor >= 0 && yCoor >= 0) && (xCoor < img.getXDim() && yCoor < img.getYDim()))
            return img.getXYByte(xCoor,yCoor);
        else
            return 0;
    }
}
