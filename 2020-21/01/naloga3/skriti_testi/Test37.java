
public class Test37 {

    public static void main(String[] args) {
        Tretja.Opravilo o0 = new Tretja.Opravilo("o0", 347);
        Tretja.Opravilo o1 = new Tretja.Opravilo("o1", 211);
        Tretja.Opravilo o2 = new Tretja.Opravilo("o2", 72);
        Tretja.Opravilo o3 = new Tretja.Opravilo("o3", 447);
        Tretja.Opravilo o4 = new Tretja.Opravilo("o4", 903);
        Tretja.Opravilo o5 = new Tretja.Opravilo("o5", 102);
        Tretja.Opravilo o6 = new Tretja.Opravilo("o6", 3);
        Tretja.Opravilo o7 = new Tretja.Opravilo("o7", 833);
        Tretja.Opravilo o8 = new Tretja.Opravilo("o8", 20);
        Tretja.Opravilo o9 = new Tretja.Opravilo("o9", 507);
        Tretja.Opravilo o10 = new Tretja.Opravilo("o10", 717);
        Tretja.Opravilo o11 = new Tretja.Opravilo("o11", 579);
        Tretja.Opravilo o12 = new Tretja.Opravilo("o12", 391);
        Tretja.Opravilo o13 = new Tretja.Opravilo("o13", 709);
        Tretja.Opravilo o14 = new Tretja.Opravilo("o14", 292);
        Tretja.Opravilo o15 = new Tretja.Opravilo("o15", 323);
        Tretja.Opravilo o16 = new Tretja.Opravilo("o16", 852);
        Tretja.Opravilo o17 = new Tretja.Opravilo("o17", 370);
        Tretja.Opravilo o18 = new Tretja.Opravilo("o18", 487);
        Tretja.Opravilo o19 = new Tretja.Opravilo("o19", 796);
        Tretja.Opravilo o20 = new Tretja.Opravilo("o20", 709);
        Tretja.Opravilo o21 = new Tretja.Opravilo("o21", 8);
        Tretja.Opravilo o22 = new Tretja.Opravilo("o22", 815);
        Tretja.Opravilo o23 = new Tretja.Opravilo("o23", 574);
        Tretja.Opravilo o24 = new Tretja.Opravilo("o24", 984);
        Tretja.Opravilo o25 = new Tretja.Opravilo("o25", 551);
        Tretja.Opravilo o26 = new Tretja.Opravilo("o26", 1000);
        Tretja.Opravilo o27 = new Tretja.Opravilo("o27", 274);
        Tretja.Opravilo o28 = new Tretja.Opravilo("o28", 198);
        Tretja.Opravilo o29 = new Tretja.Opravilo("o29", 555);
        Tretja.Opravilo o30 = new Tretja.Opravilo("o30", 638);
        Tretja.Opravilo o31 = new Tretja.Opravilo("o31", 330);

        Tretja.Projekt p0 = new Tretja.Projekt("p0", new Tretja.Opravilo[]{o5});
        Tretja.Projekt p1 = new Tretja.Projekt("p1", new Tretja.Opravilo[]{o5});
        Tretja.Projekt p2 = new Tretja.Projekt("p2", new Tretja.Opravilo[]{o5});
        Tretja.Projekt p3 = new Tretja.Projekt("p3", new Tretja.Opravilo[]{o5});
        Tretja.Projekt p4 = new Tretja.Projekt("p4", new Tretja.Opravilo[]{o5});
        Tretja.Projekt p5 = new Tretja.Projekt("p5", new Tretja.Opravilo[]{o5});
        Tretja.Projekt p6 = new Tretja.Projekt("p6", new Tretja.Opravilo[]{o9, o2, o23, o6, o21, o3, o4, o28, o18, o5});
        Tretja.Projekt p7 = new Tretja.Projekt("p7", new Tretja.Opravilo[]{o19, o28, o1, o15, o21, o29, o18});
        Tretja.Projekt p8 = new Tretja.Projekt("p8", new Tretja.Opravilo[]{o5});
        Tretja.Projekt p9 = new Tretja.Projekt("p9", new Tretja.Opravilo[]{o18, o9, o28, o3, o23, o5, o6, o4, o2, o21});
        Tretja.Projekt p10 = new Tretja.Projekt("p10", new Tretja.Opravilo[]{o28, o18, o1, o29});
        Tretja.Projekt p11 = new Tretja.Projekt("p11", new Tretja.Opravilo[]{o30, o0, o22, o9});
        Tretja.Projekt p12 = new Tretja.Projekt("p12", new Tretja.Opravilo[]{o16, o10});
        Tretja.Projekt p13 = new Tretja.Projekt("p13", new Tretja.Opravilo[]{o10, o26, o28, o20, o24, o15});
        Tretja.Projekt p14 = new Tretja.Projekt("p14", new Tretja.Opravilo[]{o29, o28, o19, o21, o18, o1, o15});
        Tretja.Projekt p15 = new Tretja.Projekt("p15", new Tretja.Opravilo[]{o9, o25});

        System.out.println(p14.jePermutacijaOd(p5));
        System.out.println(p0.jePermutacijaOd(p8));
        System.out.println(p9.jePermutacijaOd(p6));
        System.out.println(p1.jePermutacijaOd(p13));
        System.out.println(p4.jePermutacijaOd(p6));
        System.out.println(p9.jePermutacijaOd(p1));
        System.out.println(p5.jePermutacijaOd(p11));
        System.out.println(p0.jePermutacijaOd(p14));
        System.out.println(p7.jePermutacijaOd(p6));
        System.out.println(p10.jePermutacijaOd(p7));
        System.out.println(p7.jePermutacijaOd(p1));
        System.out.println(p7.jePermutacijaOd(p6));
        System.out.println(p12.jePermutacijaOd(p15));
        System.out.println(p0.jePermutacijaOd(p2));
        System.out.println(p13.jePermutacijaOd(p0));
        System.out.println(p5.jePermutacijaOd(p2));
        System.out.println(p14.jePermutacijaOd(p6));
        System.out.println(p14.jePermutacijaOd(p12));
        System.out.println(p10.jePermutacijaOd(p9));
        System.out.println(p2.jePermutacijaOd(p3));
        System.out.println(p14.jePermutacijaOd(p3));
        System.out.println(p2.jePermutacijaOd(p3));
        System.out.println(p14.jePermutacijaOd(p1));
        System.out.println(p11.jePermutacijaOd(p13));
        System.out.println(p15.jePermutacijaOd(p5));
        System.out.println(p1.jePermutacijaOd(p3));
        System.out.println(p5.jePermutacijaOd(p8));
        System.out.println(p8.jePermutacijaOd(p15));
        System.out.println(p3.jePermutacijaOd(p14));
        System.out.println(p11.jePermutacijaOd(p5));
        System.out.println(p3.jePermutacijaOd(p0));
        System.out.println(p3.jePermutacijaOd(p6));
        System.out.println(p1.jePermutacijaOd(p9));
        System.out.println(p9.jePermutacijaOd(p6));
        System.out.println(p11.jePermutacijaOd(p4));
        System.out.println(p6.jePermutacijaOd(p4));
        System.out.println(p2.jePermutacijaOd(p11));
        System.out.println(p8.jePermutacijaOd(p0));
        System.out.println(p8.jePermutacijaOd(p0));
        System.out.println(p7.jePermutacijaOd(p9));
        System.out.println(p13.jePermutacijaOd(p12));
        System.out.println(p12.jePermutacijaOd(p9));
        System.out.println(p14.jePermutacijaOd(p4));
        System.out.println(p13.jePermutacijaOd(p9));
        System.out.println(p15.jePermutacijaOd(p5));
        System.out.println(p3.jePermutacijaOd(p6));
        System.out.println(p3.jePermutacijaOd(p5));
        System.out.println(p8.jePermutacijaOd(p12));
        System.out.println(p2.jePermutacijaOd(p3));
        System.out.println(p1.jePermutacijaOd(p10));
        System.out.println(p14.jePermutacijaOd(p5));
        System.out.println(p11.jePermutacijaOd(p5));
        System.out.println(p14.jePermutacijaOd(p6));
        System.out.println(p9.jePermutacijaOd(p3));
        System.out.println(p8.jePermutacijaOd(p0));
    }
}
