class Point {
    private String nom;
    private int absisse;
    private int ordonnee;

    private Point(int a, int b) {
        absisse = a;
        ordonnee = b;
    }

    public Point(String r) {
        nom = r;
    }

    public Point(String r, int a, int b) {
        absisse = a;
        ordonnee = b;
        nom = r;
    }

    void affiche() {
        System.out.println(nom + "(" + absisse + "," + ordonnee + ")");
    }

    void TransHoriz(int a) {
        absisse = absisse + a;
    }

    void TranslVert(int b) {
        ordonnee = ordonnee + b;
    }

    void Translation(int a, int b) {
        absisse = absisse + a;
        ordonnee = ordonnee + b;
    }

   
    String getNom() {
        return nom;
    }

    public int getAbscisse() {
        return absisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    void setNom(String ch) {
        nom = ch;
    }

    void setAbscisse(int a) {
        absisse = a;
    }

    void setOrdonnee(int a) {
        ordonnee = a;
    }

    public static void main(String[] args) {
        Point p1;
        p1 = new Point(3, 5);
        Point p2 = new Point("a");
        Point p3 = new Point("b", 3, 5);

        System.out.println("\n ---------------------------\n");
        System.out.println("les points créés sont :");
        p1.affiche();
        p2.affiche();
        p3.affiche();

        System.out.println("\n ---------------------------\n");
        System.out.println("translation des points ");
        p1.TransHoriz(4);
        p2.TranslVert(3);
        p3.Translation(5, 2);
        p1.affiche();
        p2.affiche();
        p3.affiche();

        System.out.println("\n ---------------------------\n");
        System.out.println("modification des attributs des points");
        p1.setNom("SRI21");
        p2.setAbscisse(25);
        p3.setOrdonnee(50);
        p1.affiche();
        p2.affiche();
        p3.affiche();

        System.out.println("\n ---------------------------\n");
        System.out.println("utilisation des méthodes get");
        String x = p1.getNom();
        int y = p1.getAbscisse();
        int z = p1.getOrdonnee();
        System.out.println("le nom du point p1 est : " + x);
        System.out.println("son abscisse est : " + y);
        System.out.println("son ordonnée est : " + z);
    }
}
