
public class Test35 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 132);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 955);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 780);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 347);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 737);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 305);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 849);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 927);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 863);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 341);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 622);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 758);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 187);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 555);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 287);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 270);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 15);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 354);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o7, o12, o3, o0, o1, o17});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o3, o1, o17, o7, o12});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o1, o15, o4, o12, o11});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o12, o3, o6});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o17, o7});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o4, o0});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o13});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o7, o14, o5, o12});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o13, o10, o16, o11});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o7, o10, o13, o0, o9, o5});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o12, o7, o17, o0});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o7, o6, o14, o17, o5});
        Tretja.Projekt p12 = new Tretja.Projekt("p12", new Tretja.Opravilo[]{o11, o14, o7});
        Tretja.Projekt p13 = new Tretja.Projekt("p13", new Tretja.Opravilo[]{o1, o7, o17, o3, o12});
        Tretja.Projekt p14 = new Tretja.Projekt("p14", new Tretja.Opravilo[]{o10, o5, o7, o0, o13});
        Tretja.Projekt p15 = new Tretja.Projekt("p15", new Tretja.Opravilo[]{o11, o17, o3});
        Tretja.Projekt p16 = new Tretja.Projekt("p16", new Tretja.Opravilo[]{o11, o10, o16, o13});

        System.out.println(p9.jePermutacijaOd(p15));
        System.out.println(p12.jePermutacijaOd(p10));
        System.out.println(p6.jePermutacijaOd(p11));
        System.out.println(p6.jePermutacijaOd(p11));
        System.out.println(p13.jePermutacijaOd(p9));
        System.out.println(p4.jePermutacijaOd(p7));
        System.out.println(p1.jePermutacijaOd(p3));
        System.out.println(p10.jePermutacijaOd(p6));
        System.out.println(p3.jePermutacijaOd(p13));
        System.out.println(p6.jePermutacijaOd(p7));
        System.out.println(p11.jePermutacijaOd(p2));
        System.out.println(p10.jePermutacijaOd(p7));
        System.out.println(p11.jePermutacijaOd(p6));
        System.out.println(p0.jePermutacijaOd(p4));
        System.out.println(p9.jePermutacijaOd(p11));
        System.out.println(p2.jePermutacijaOd(p1));
        System.out.println(p4.jePermutacijaOd(p5));
        System.out.println(p14.jePermutacijaOd(p8));
        System.out.println(p2.jePermutacijaOd(p9));
        System.out.println(p2.jePermutacijaOd(p14));
        System.out.println(p1.jePermutacijaOd(p7));
        System.out.println(p7.jePermutacijaOd(p12));
        System.out.println(p4.jePermutacijaOd(p3));
        System.out.println(p14.jePermutacijaOd(p7));
        System.out.println(p1.jePermutacijaOd(p9));
        System.out.println(p12.jePermutacijaOd(p14));
        System.out.println(p4.jePermutacijaOd(p1));
        System.out.println(p15.jePermutacijaOd(p7));
        System.out.println(p11.jePermutacijaOd(p7));
        System.out.println(p7.jePermutacijaOd(p3));
        System.out.println(p5.jePermutacijaOd(p7));
        System.out.println(p13.jePermutacijaOd(p10));
        System.out.println(p16.jePermutacijaOd(p8));
        System.out.println(p0.jePermutacijaOd(p13));
        System.out.println(p1.jePermutacijaOd(p3));
        System.out.println(p2.jePermutacijaOd(p0));
        System.out.println(p5.jePermutacijaOd(p10));
        System.out.println(p0.jePermutacijaOd(p6));
        System.out.println(p15.jePermutacijaOd(p11));
        System.out.println(p4.jePermutacijaOd(p6));
        System.out.println(p3.jePermutacijaOd(p0));
        System.out.println(p8.jePermutacijaOd(p16));
        System.out.println(p9.jePermutacijaOd(p1));
        System.out.println(p9.jePermutacijaOd(p8));
        System.out.println(p14.jePermutacijaOd(p2));
        System.out.println(p7.jePermutacijaOd(p0));
        System.out.println(p12.jePermutacijaOd(p1));
        System.out.println(p4.jePermutacijaOd(p3));
        System.out.println(p0.jePermutacijaOd(p13));
        System.out.println(p15.jePermutacijaOd(p8));
    }
}
