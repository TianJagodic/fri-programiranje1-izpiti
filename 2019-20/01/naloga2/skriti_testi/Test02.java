
public class Test02 {

    public static void main(String[] args) {
        int[][] t = {
            {  598, 3744, 5099,  549, 4337, 3573,  522, 4933, 7970, 8652, 2461, 7608, 7822, 5304, 8904, 6255, 9355, 9999, 8077, 3402, 9544,  930, 6981 },
            { 6363, 4149, 9574, 5569, 4498, 9099, 5002,  820, 7177, 5703, 1614, 5883, 9718, 6102, 3006, 9529, 5385, 7905, 8222, 8592, 2794, 4541, 6080 },
            { 8216, 1450, 8600, 8866, 5774, 2889, 9014, 3635,  770, 6258, 1382, 4869, 8890, 6514, 9114, 8070,  660, 3873, 5684, 1668, 1346, 8690, 7986 },
            { 5218, 9625, 9175, 2455, 2678, 5786, 4212, 5188, 6816,  489, 4052, 4889, 7950, 3648, 5594, 7483, 1739, 8526, 8422, 7794, 2870, 5008, 5411 },
            { 4428, 3467, 5379, 4268, 6415,  215, 4021, 5076,  300, 3127, 8196,  218, 2556, 3339, 8604, 5392, 5221,  240, 1644, 2227, 8485, 5620, 1914 },
            { 6445, 9392, 4743, 9086, 5950, 7637, 7646, 7136, 6830,  506, 5264,  733, 5967, 8452, 3848, 6591, 3762, 7242, 5485, 2266, 8346, 4598,  499 },
            { 6555, 7992, 9885,  821, 9245,  456, 4570, 2678, 4713, 9214, 7531, 2465, 9362, 9954, 6728,  863, 9268,  718, 6426, 6586, 8919, 5458, 6230 },
            { 2163, 8530, 4835, 8897, 4701,  420, 2359, 4818, 8950, 2375, 2255, 1307,  989, 9216, 9343, 9943, 2808, 8864,  827, 2809, 3698, 4530, 4810 },
            { 9043, 1023, 6108, 7762, 7444, 4243, 8940, 1861, 9990, 6779, 9345, 8012, 9995, 4721, 4597, 3745, 1009, 1778, 7592, 2994,  754, 5333, 6420 },
            { 2285, 6552, 1002, 4622, 8620, 7773, 9506, 2858, 1092, 3793, 3742, 7991, 2097, 2034, 5468, 7604, 9532, 8475, 8712, 4398, 3668, 4125, 3799 },
            {  254, 9164, 2486, 4939, 6279,  300, 3824, 4872, 6654, 7054, 1721, 4216, 2947, 1986, 4382, 2255, 8194, 8653, 2516, 9799, 2122, 3923, 7354 },
            { 5496, 5784, 1499, 1836, 2839, 3333, 1724, 1033, 8831, 2552, 5058, 5164, 3454, 5496, 2182,   50, 1521,  530, 9071, 8288, 1182, 7154, 3600 },
            { 8402, 6727, 3967, 7507, 1366, 4272,   70, 6164, 2422, 6972, 9723, 5643, 4433, 4687, 8478, 8326, 4849, 2212, 3577, 7926, 5441, 7210, 1774 },
            { 2882, 3295, 9641, 6171, 5141, 1356, 3989, 8935, 5155, 3190, 1426, 6523, 9386, 9690, 4162,  836, 5582, 5060, 4656, 1436, 3091, 2703, 3789 },
            { 3664, 4433, 9279, 9287, 8784,   95, 2052, 1449, 7643, 5436, 3079,  712, 4568, 4966, 1268, 5380, 4271, 5529, 2239, 3758, 8481, 7287, 8814 },
            { 8790, 2123, 9191, 9633, 3383,  277, 9556, 4131, 7465, 2530,  432, 7841, 9199, 8796, 4620, 2550, 7942,  653, 6209, 6312, 7945, 3771, 1014 },
            { 3958, 7055, 9566, 7976, 5667, 9764, 5939, 9081, 4765, 1001, 8307,  681, 1876, 7659,  801,  320, 2447, 7781, 7104, 7564, 4092, 4652, 7826 },
            { 9504, 2544, 1700, 4987, 1816, 6534, 7889, 1796, 3902, 8149, 8835, 6931, 6958, 9212, 8496, 4038, 3272, 3029, 9138, 5051, 5548, 8946, 6762 },
            { 4583, 2629, 1022, 4668, 5917, 9384,   62,  663, 2771,  241, 8797, 4319, 2516, 7304, 9888,  165, 4385, 1635, 6109, 2080, 9414, 4977, 5689 },
            { 9959, 8304, 4393, 7743, 4124, 8784, 3440,  788, 4609, 6064, 5571, 9039, 6572, 6163, 7785, 8834, 1160, 7392, 5708, 5827, 2514, 4818,  662 },
            { 4471, 3528, 4519, 2436, 8962, 4319, 8510, 8387, 1371, 4473, 6555, 6712, 3559, 2160, 5796, 2736, 1917, 2588, 6079, 7937, 2876, 1200, 4935 },
            { 8244, 6172, 7122, 6024, 8908,  962, 1908,  155, 8266, 9926, 5539, 9443, 6761,  896, 6773,  357,  815, 5166, 7951, 9218, 1826, 9824, 1250 },
            { 4241, 5635, 8978, 1038, 4547, 4711, 6473, 1236, 9128, 3613, 3586, 2816, 6946, 6030, 5720, 4007, 5574, 1448, 9610,   61, 7748,  727, 8754 },
            { 2707, 4419,  697, 8877, 9899, 6334,  803, 1704,  718, 4050, 3628, 7519, 3511, 1906, 3112, 7793, 8687, 8384,  802, 1148,  648, 5048, 2647 },
            { 9242, 5599, 1752, 4759, 7870, 7680,   76, 4576, 3822, 2844, 6935, 3462, 1644, 8274, 5342, 8536,  465, 1072, 6775, 3003, 9650, 9782,  447 },
        };

        for (int krog = 0;  krog < 23;  krog++) {
            System.out.println(Druga.najCas(t, krog));
        }
    }
}