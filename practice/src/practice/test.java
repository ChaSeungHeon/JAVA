package practice;

public class test {
	 private int width;
     private int height;
     private int depth;
     private int vol;

     public void Box9(int width, int height, int depth) {
         this.width = width;
         this.depth = depth;
         this.height = height;
         volume();
     }

     private void volume() {
         vol = width * height * depth;

     }

     public int getvolume() {
         return vol;
     }


     public static void main(String[] args) {

         int h = Integer.parseInt(args[0]);
         int w = Integer.parseInt(args[1]);
         int d = Integer.parseInt(args[2]);

         Box9 mybox1 = new Box9(h, w, d);
         System.out.println("정수 박스의 부피 : "+mybox1.getvolume());

     }
 }
