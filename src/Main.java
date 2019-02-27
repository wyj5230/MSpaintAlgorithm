import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] x1Axis =  {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] x2Axis =  {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x3Axis =  {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x4Axis =  {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x5Axis =  {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x6Axis =  {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x7Axis =  {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x8Axis =  {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x9Axis =  {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x10Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x11Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x12Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x13Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x14Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x15Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x16Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x17Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x18Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x19Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x20Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x21Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x22Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x23Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x24Axis = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] x25Axis = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};


        int[][] result = {x1Axis, x2Axis, x3Axis, x4Axis, x5Axis, x6Axis, x7Axis, x8Axis, x9Axis, x10Axis, x11Axis, x12Axis, x13Axis, x14Axis, x15Axis, x16Axis, x17Axis, x18Axis, x19Axis, x20Axis, x21Axis, x22Axis, x23Axis, x24Axis, x25Axis};

        drawPic(result);


        int[] startPoint = {38, 17};
        long time = System.currentTimeMillis();
        paint(startPoint, result);
        System.out.println("time usage:"+(System.currentTimeMillis()-time));
    }

    public static void drawPic(int[][] pixels) {
/*        try {
            Thread.sleep(10);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }*/
        for (int y = 0; y < pixels.length; y++) {
            for (int x = 0; x < pixels[0].length; x++) {
                if (pixels[y][x] == 0)
                    System.out.print(' ');
                else if (pixels[y][x] == 1)
                    System.out.print('*');
                else if (pixels[y][x] == 2)
                    System.out.print('x');
            }
            System.out.print('\n');
        }
    }

    public static void paint(int[] startPoint, int[][] pixels) {
        int xMax = pixels[0].length;
        int yMax = pixels.length;
        Stack<int[]> startPoints = new Stack<>();
        startPoints.push(startPoint);
        do {
            int[] point = startPoints.pop();
            System.out.println("proceeding point: "+point[0]+point[1]);
            int x = point[0];
            int y = point[1];
            if (pixels[y][x] == 2){
                continue;
            }
            pixels[y][x] = 2;
            drawPic(pixels);
            //step 1, scan the y-Axis
            boolean xHit = false;
            boolean yHit = false;

            int xLeft = x;
            int xRight = x;
            //left side
            if (xLeft > 0) {
                do {
                    xLeft--;
                    if (pixels[y][xLeft] == 1) {
                        xHit = true;
                        System.out.println("left side hit the wall!!");
                    } else {
                        pixels[y][xLeft] = 2;
                        drawPic(pixels);
                    }
                } while (xLeft > 0 && !xHit);
                System.out.println("Left side finish");
                if (!xHit) {
                    System.out.println("case 1: Left side clear, no wall hit");
                }else{
                    System.out.println("case 2: Left side hit the wall");
                }
            }
            xHit = false;
            System.out.println("x right value:" + xRight);
            //right side
            if (xRight < xMax - 1) {
                do {
                    xRight++;
                    if (pixels[y][xRight] == 1) {
                        xHit = true;
                        System.out.println("Right side hit the wall!!");
                    } else {
                        pixels[y][xRight] = 2;
                        drawPic(pixels);
                    }
                } while (xRight < xMax - 1 && !xHit);
                System.out.println("Right side finish");
                if (!xHit) {
                    System.out.println("case 1: Right side clear, no wall hit");
                } else{
                    System.out.println("case 2: Right side hit the wall");
                }
            }
            xLeft += 1;
            xRight -= 1;
            System.out.println("x left:" + xLeft);
            System.out.println("x right:" + xRight);
            // upside
            int yUp = y + 1;
            if (y < yMax - 1) {
                findNewRootPoint(pixels[yUp], yMax, startPoints, xLeft, xRight, yUp);
            }
            //downside
            int yDown = y - 1;
            if (y > 0) {
                findNewRootPoint(pixels[yDown], yMax, startPoints, xLeft, xRight, yDown);
            }

        } while (!startPoints.isEmpty());

    }

    private static void findNewRootPoint(int[] pixel, int yMax, Stack<int[]> startPoints, int xLeft, int xRight, int y) {
        int tempRightPoint = 0;
        int lastAdd = 0;
        for (int i = xLeft; i <= xRight; i++) {
            if (pixel[i] == 0) {
                tempRightPoint = i;
            }else if (pixel[i] == 1 && tempRightPoint!=0 && tempRightPoint!= lastAdd){
                startPoints.push(new int[] {tempRightPoint, y});
                System.out.println("Found new root point: [" + tempRightPoint + "," + y + "]");
                lastAdd=tempRightPoint;
            }
        }
        if (tempRightPoint == xRight) {
            for (int i = xRight; i < yMax - 1; i++) {
                if (pixel[i] == 0) {
                    tempRightPoint = i;
                } else {
                    break;
                }
            }
        }
        if (tempRightPoint != lastAdd && tempRightPoint != 0) {
            System.out.println("Found new root point: [" + tempRightPoint + "," + y + "]");
            int[] newRoot = {tempRightPoint, y};
            startPoints.push(newRoot);
        }
    }

}
