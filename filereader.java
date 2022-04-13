package com.company;
import java.io.File;
import java.util.Scanner;
import java.util.concurrent.*;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class filereader {
    public static void main(String[] args) throws IOException {
        int width = 1536;
        int height = 2048;
        BufferedImage image = null;
        //BufferedImage newimage = null;
        int[][] newarray = new int[height][width];
        File f = null;
        File g = null;
        //File x = null;

        try {
            System.out.println("Insert your file");
            Scanner scanney = new Scanner(System.in);
            String arg1 = scanney.next();
            f = new File(arg1);  //C:\Users\jjbla\Pictures\Myselfintrees.jpg
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(f);
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    newarray[i][j] = image.getRGB(j, i);
                    //System.out.println(newarray[i][j]);
                }
            }

            BufferedImage newimage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            //BufferedImage newimage2 = newimage;
            //newimage = ImageIO.read(f);
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    int newimagestuff = newarray[i][j];
                    newimage.setRGB(j, i, newimagestuff);
                }
            }
            System.out.println(newimage.getRGB(3, 3));
            //newimage = ImageIO.read(f);
            //System.out.println(image);
            //String gew = String.valueOf(image);
            //x = new File(gew);
            int i = 0;

            //String newthing = String(image);
            // System.out.println(newthing);
            System.out.println("C:\\Users\\jjbla\\Documents\\File Reading\\Outputstuff11.jpg");

            //g = new File("C:\\Users\\jjbla\\Pictures\\Outputstuff10.jpg");
            ImageIO.write(newimage,"jpg", new File("C:\\Users\\jjbla\\Documents\\File Reading\\Outputstuff15.jpg"));

            //System.out.println("C:\\Users\\jjbla\\Pictures\\Outputstuff10.jpg");

        } catch (IOException e) {
            System.out.println("Error:" + e);

        }


    }
}