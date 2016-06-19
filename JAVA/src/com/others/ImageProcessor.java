package nonweb.utils;


import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import com.sun.jimi.core.Jimi;
import com.sun.jimi.core.JimiException;
import com.sun.jimi.core.raster.JimiRasterImage;

public class ImageProcessor {

    public ImageProcessor() {
    }

    private void processImg(String inputImageURL, String imagePool,
            String imageFileName) {
        
        int thumbnailImgWidth = 200;

        // Taking thumbnail image height.
        int thumbnailImgHeight = 200;

        // Taking enlarg image width.
        int enlargedImgWidth = 600;
        // Taking enlarg image height.
        int enlargedImgHeight = 600;

        /*
         * Changing end part of image name in order to differentiate enlarge
         * image and thumbnail image.
         */

        Image image = null;
        URL url = null;
        try {
            url = new URL(inputImageURL);
        } catch (MalformedURLException e) {
        }

       
        image = Toolkit.getDefaultToolkit().createImage(url);
        /*
         * If image taken from URL is not in proper shape and size, processing
         * it as per requirement.
         */
        if (image.getWidth(null) != enlargedImgWidth
                || image.getHeight(null) != enlargedImgHeight) {
            image = image.getScaledInstance(enlargedImgWidth,
                    enlargedImgHeight, Image.SCALE_SMOOTH);
        }
        String enlargeImgName = imageFileName.replaceAll(".jpg", "Enlarge.jpg");
        // File outputFile = new File(imagePool + enlargeImgName);
        // outputFile.delete();
        JimiRasterImage jimiRasterImage = null;
        try {
            jimiRasterImage = Jimi.createRasterImage(image.getSource());
        } catch (JimiException e) {
        }
        FileOutputStream fileOutputStream = null;
        try {
            // Creating fileOutputStream correspond to process image.
            fileOutputStream = new FileOutputStream(imagePool + enlargeImgName);
        } catch (FileNotFoundException e) {
        }
        try {
            // Creating output image file.
            Jimi.putImage("image/jpeg", jimiRasterImage, fileOutputStream);
        } catch (JimiException e) {
        }

        
        image = new ImageIcon(imagePool + enlargeImgName).getImage();
        // Geting instance of thumbnail image.
        image = image.getScaledInstance(thumbnailImgWidth, thumbnailImgHeight,
                Image.SCALE_SMOOTH);
        String thumbNailImgName = imageFileName.replaceAll(".jpg",
                "ThumbNail.jpg");
        try {
            jimiRasterImage = Jimi.createRasterImage(image.getSource());
        } catch (JimiException e) {
        }

        try {
            // Creating fileOutputStream correspond to thumbnail image.
            fileOutputStream = new FileOutputStream(imagePool
                    + thumbNailImgName);
        } catch (FileNotFoundException e) {
        }
        try {
            // Creating output thumbanil image file.
            Jimi.putImage("image/jpeg", jimiRasterImage, fileOutputStream);
        } catch (JimiException e) {
        }
        
        try {
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
        }
        
    }

    /**
     * The method process the images and returns the location of the image
     * available.
     * 
     * @param inputImageURL
     * @param imagePool
     * @return
     * @throws CustomException
     */
    public String getProcessedImgURL(String inputImageURL, String imagePool)
             {
        
        String imageFileName = "none.jpg";
        if (inputImageURL == null || inputImageURL.equals("")) {
            return  imageFileName;
        }
        String[] urlTokens = inputImageURL.split("/");
        imageFileName = urlTokens[urlTokens.length - 1];
        File imageFile = new File(imagePool
                + imageFileName.replaceAll(".jpg", "Enlarge.jpg"));

        if (!imageFileName.endsWith(".jpg")) {
        }

        if (imageFile.exists() == false) {

            this.processImg(inputImageURL, imagePool, imageFileName);
        }
       
      
        return  imageFileName;
    }
    
    


    
    
    
    
    
    
    
    
    
}
