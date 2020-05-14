public class DrawTriangle {
    public static void drawTriangles(int n) {

      for (int j = 0; j < n; j += 1) {
        String currentLine = "";
        for (int i = 0; i <= j; i += 1) {
          currentLine += '*';
        }
        System.out.println(currentLine);
      }
      
    }

    public static void main(String[] args) {
      drawTriangles(5);
    }
}
