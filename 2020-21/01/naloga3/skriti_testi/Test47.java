
public class Test47 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 812);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 253);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 166);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 313);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 825);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 223);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 555);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 659);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 318);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 947);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 415);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 322);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 964);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 335);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 314);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 469);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 352);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 520);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 255);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 608);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 648);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 193);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 85);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 595);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 5);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 526);
        Tretja.Opravilo o26 = new Tretja.Opravilo("o26", 385);
        Tretja.Opravilo o27 = new Tretja.Opravilo("o27", 378);
        Tretja.Opravilo o28 = new Tretja.Opravilo("o28", 925);
        Tretja.Opravilo o29 = new Tretja.Opravilo("o29", 700);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o7, o10, o21});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o7, o21, o10});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o29, o23, o18, o4, o0, o9});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o21, o7, o10});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o28, o16, o4});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o18, o0, o23, o29, o4, o9});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o29, o18});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o21, o10, o7});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o24, o13, o14, o2, o4, o27});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o29});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o4, o9, o18, o29, o0, o23});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o22, o16, o7, o29});
        Tretja.Projekt p12 = new Tretja.Projekt("p12", new Tretja.Opravilo[]{o10, o21, o7});
        Tretja.Projekt p13 = new Tretja.Projekt("p13", new Tretja.Opravilo[]{o6, o22, o25});
        Tretja.Projekt p14 = new Tretja.Projekt("p14", new Tretja.Opravilo[]{o4, o29, o9, o23, o18, o0});
        Tretja.Projekt p15 = new Tretja.Projekt("p15", new Tretja.Opravilo[]{o28, o16, o4});
        Tretja.Projekt p16 = new Tretja.Projekt("p16", new Tretja.Opravilo[]{o29});

        System.out.println(p10.jePermutacijaOd(p2));
        System.out.println(p1.jePermutacijaOd(p8));
        System.out.println(p10.jePermutacijaOd(p11));
        System.out.println(p11.jePermutacijaOd(p12));
        System.out.println(p9.jePermutacijaOd(p2));
        System.out.println(p4.jePermutacijaOd(p7));
        System.out.println(p1.jePermutacijaOd(p4));
        System.out.println(p11.jePermutacijaOd(p5));
        System.out.println(p9.jePermutacijaOd(p3));
        System.out.println(p3.jePermutacijaOd(p13));
        System.out.println(p2.jePermutacijaOd(p4));
        System.out.println(p14.jePermutacijaOd(p5));
        System.out.println(p14.jePermutacijaOd(p3));
        System.out.println(p12.jePermutacijaOd(p9));
        System.out.println(p14.jePermutacijaOd(p8));
        System.out.println(p8.jePermutacijaOd(p10));
        System.out.println(p0.jePermutacijaOd(p2));
        System.out.println(p3.jePermutacijaOd(p13));
        System.out.println(p12.jePermutacijaOd(p13));
        System.out.println(p1.jePermutacijaOd(p3));
        System.out.println(p4.jePermutacijaOd(p10));
        System.out.println(p1.jePermutacijaOd(p6));
        System.out.println(p4.jePermutacijaOd(p2));
        System.out.println(p5.jePermutacijaOd(p3));
        System.out.println(p4.jePermutacijaOd(p16));
        System.out.println(p15.jePermutacijaOd(p6));
        System.out.println(p11.jePermutacijaOd(p0));
        System.out.println(p1.jePermutacijaOd(p3));
        System.out.println(p8.jePermutacijaOd(p0));
        System.out.println(p15.jePermutacijaOd(p8));
        System.out.println(p8.jePermutacijaOd(p7));
        System.out.println(p16.jePermutacijaOd(p5));
        System.out.println(p1.jePermutacijaOd(p7));
        System.out.println(p9.jePermutacijaOd(p3));
        System.out.println(p13.jePermutacijaOd(p3));
        System.out.println(p3.jePermutacijaOd(p8));
        System.out.println(p1.jePermutacijaOd(p11));
        System.out.println(p9.jePermutacijaOd(p4));
        System.out.println(p6.jePermutacijaOd(p11));
        System.out.println(p3.jePermutacijaOd(p13));
        System.out.println(p0.jePermutacijaOd(p2));
        System.out.println(p12.jePermutacijaOd(p15));
        System.out.println(p7.jePermutacijaOd(p9));
        System.out.println(p7.jePermutacijaOd(p5));
        System.out.println(p4.jePermutacijaOd(p8));
        System.out.println(p7.jePermutacijaOd(p4));
        System.out.println(p5.jePermutacijaOd(p0));
        System.out.println(p5.jePermutacijaOd(p13));
        System.out.println(p7.jePermutacijaOd(p3));
        System.out.println(p1.jePermutacijaOd(p11));
        System.out.println(p11.jePermutacijaOd(p7));
        System.out.println(p1.jePermutacijaOd(p4));
        System.out.println(p15.jePermutacijaOd(p0));
        System.out.println(p12.jePermutacijaOd(p13));
        System.out.println(p1.jePermutacijaOd(p4));
        System.out.println(p3.jePermutacijaOd(p4));
        System.out.println(p4.jePermutacijaOd(p5));
        System.out.println(p4.jePermutacijaOd(p11));
        System.out.println(p7.jePermutacijaOd(p15));
        System.out.println(p15.jePermutacijaOd(p16));
        System.out.println(p0.jePermutacijaOd(p6));
        System.out.println(p3.jePermutacijaOd(p8));
    }
}