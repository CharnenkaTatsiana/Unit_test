public class Triangle {
    private int a;
    private int b;
    private int c;

  public Triangle (int a, int b, int c) {
     this.a = a;
     this.b = b;
     this.c = c;
  }

     public boolean isTriangle (int a, int b, int c){
        return a > 0 && b > 0 && c > 0 && (a + b) > c && (b + c) > a && (a + c) > b;
    }
    public boolean isEquilateralTriangle (int a, int b, int c){
      return (a == b & b == c);
    }

    public boolean isIsoscelesTriangle (int a, int b, int c){
        return (a == b && a != c) || (a == c && a != b) || (b == c && b != a);
    }

}
