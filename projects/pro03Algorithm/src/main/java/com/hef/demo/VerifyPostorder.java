package com.hef.demo;

/**
 * @Date 2021/11/10
 * @Author lifei
 */
public class VerifyPostorder {

    public static void main(String[] args) {
        VerifyPostorder verifyPostorder = new VerifyPostorder();
        int[] postorder = {39, 80, 199, 215, 90, 397, 465, 385, 362, 513, 588, 741, 711, 1023, 706, 510,
                1135, 1071, 1374, 1320, 1204, 1495, 1657, 2038, 1775, 1526, 1400, 2109, 2148, 2140, 2338, 2300,
                1042, 44, 2566, 2599, 2441, 2832, 3314, 3189, 3089, 2969, 3395, 3485, 3456, 3403, 3700, 3646, 3812,
                3840, 4191, 4372, 3917, 4939, 4754, 4575, 3740, 5355, 5538, 5175, 5104, 3568, 3353, 3321, 2675, 5575,
                5660, 5574, 2409, 6142, 6059, 6153, 6207, 5893, 6664, 6612, 7176, 7154, 6669, 6466, 7705, 7853, 8317,
                8416, 8334, 8310, 8273, 7825, 8719, 9037, 8670, 9050, 9672, 10015, 9941, 9788, 10075, 10352, 10020,
                9441, 10522, 10572, 10682, 10676, 10583, 10434, 10861, 10784, 8511, 7492, 11116, 11045, 11557, 11909,
                11957, 12076, 11945, 11941, 12305, 12199, 11782, 11425, 12337, 12809, 12901, 12609, 13128, 13320, 13733,
                13654, 13345, 12947, 12312, 14131, 13876, 14191, 14461, 14756, 14755, 14520, 14816, 14850, 14870, 14763,
                14897, 14163, 15037, 15221, 15625, 15504, 15776, 15839, 15975, 16527, 16425, 15824, 15812, 16654, 15114,
                16801, 17016, 16949, 16873, 16769, 17226, 17029, 16708, 17272, 17459, 17523, 17260, 15000, 17712, 17898,
                17856, 17944, 17943, 18145, 17921, 18341, 18264, 18663, 18480, 19191, 19006, 19258, 19273, 19201, 19391,
                19576, 19606, 19723, 19831, 19855, 19964, 19760, 19629, 19365, 18459, 18261, 20337, 19995, 20388, 20384,
                20659, 21073, 20923, 20567, 21123, 21360, 21547, 21378, 21354, 21584, 21574, 21644, 21798, 21903, 21956,
                22052, 22030, 22054, 22214, 22457, 22589, 22734, 22511, 22493, 22182, 22018, 23056, 22896, 22751, 21816,
                21641, 21241, 19979, 23308, 23600, 23494, 23429, 23723, 23698, 23259, 17560, 23868, 23964, 23995, 24313,
                24306, 24378, 24355, 23947, 23894, 24444, 24478, 24996, 24873, 25099, 25111, 25263, 25467, 25405, 25338,
                25185, 25059, 24442, 25881, 26457, 26100, 25997, 25722, 25621, 23745, 26761, 26860, 26814, 26975, 26996,
                26989, 26969, 26553, 13734, 27644, 27872, 27340, 27928, 27995, 28431, 28161, 28061, 27914, 28816, 28783,
                29216, 29348, 29630, 29520, 29375, 29732, 29164, 28553, 27221, 30054, 30275, 30104, 30360, 30053, 30610, 30549, 30946, 30934, 30947, 30860, 31189, 31274, 31018, 31314, 31333, 31366, 31335, 31479, 31752, 31884, 32021, 31980, 31766, 32153, 31408, 31286, 32690, 32865, 32949, 32703, 33093, 33393, 33398, 33579, 33509, 33592, 33694, 33760, 33698, 34001, 33975, 33932, 33772, 33589, 33129, 33066, 34294, 34423, 34341, 34161, 34534, 34606, 35088, 34836, 34474, 35094, 34440, 32313, 29961, 11013, 5804, 35153, 35409, 35496, 35271, 35998, 36109, 36217, 36335, 36412, 36691, 36782, 36662, 36569, 36468, 35562, 35237, 35178, 36898, 36862, 37118, 37142, 37358, 37194, 37096, 36922, 37745, 37893, 37808, 37898, 37757, 37739, 37962, 38350, 38489, 38427, 38331, 37991, 38530, 38564, 38501, 38604, 37928, 38789, 39080, 38930, 39554, 39522, 39746, 39664, 39349, 38685, 40233, 40185, 40629, 40697, 41403, 40699, 41484, 41748, 41687, 41959, 41939, 42068, 41858, 41843, 41481, 42342, 42200, 42593, 42395, 42700, 42713, 42861, 42919, 42751, 42653, 43190, 43024, 43308, 43647, 43676, 44032, 44204, 44080, 43677, 43463, 44433, 44593, 44602, 44680, 44493, 44322, 45249, 45373, 45366, 44840, 44790, 44782, 43223, 42390, 45659, 45759, 45888, 45921, 45890, 45795, 45940, 45707, 45973, 46014, 46013, 45948, 46263, 46612, 46800, 46535, 46305, 46256, 46905, 47224, 47487, 47286, 47582, 46819, 45945, 47736, 47676, 47962, 48158, 48273, 47973, 48704, 48865, 48823, 49112, 49427, 49475, 49416, 49145, 48883, 47858, 49532, 49605, 50062, 49715, 49477, 47625, 45645, 42156, 50436, 50533, 50593, 50437, 50759, 50763, 50747, 51201, 51350, 51945, 51038, 50868, 50852, 52337, 52011, 52482, 52343, 52657, 52741, 52553, 51994, 53023, 53138, 53062, 53236, 53253, 53318, 53497, 53745, 53678, 53632, 53156, 54010, 54259, 54297, 54105, 54320, 54609, 54599, 54882, 54694, 54659, 54641, 54344, 54306, 53808, 55355, 55464, 55240, 55177, 55608, 55649, 55797, 55832, 56031, 56052, 55888, 55563, 55540, 56550, 56583, 56355, 55483, 55141, 53140, 56881, 56998, 57011, 57205, 56856, 57952, 57503, 58244, 58238, 58066, 57412, 52801, 58410, 58431, 58511, 58470, 58623, 58674, 58772, 58826, 58720, 58875, 58922, 58856, 59011, 58520, 58355, 59201, 59120, 59476, 59228, 60122, 59824, 59505, 60440, 60401, 60625, 60663, 60615, 60718, 60525, 61139, 60886, 59215, 61264, 61213, 61469, 61656, 61639, 61728, 61676, 62098, 61842, 61572, 62164, 61312, 62341};
        boolean res = verifyPostorder.verifyPostorder(postorder);
        System.out.println(res);
    }

    public boolean verifyPostorder(int[] postorder) {
        return solve(postorder, 0, postorder.length-1);
    }

    private boolean solve(int[] postorder, int lo, int hi){
        if (lo>=hi) return true;
        int i=lo-1, j=hi;
        int lt = hi;
        while (true){
            while(postorder[++i]<postorder[lt]) if (i==hi) break;
            while(postorder[--j]>postorder[lt]) if (j==lo) break;
            if (i>=j) break;
            System.out.println(i+" "+j);
            return false;
        }
        exch(postorder, lt, i);
        boolean left= solve(postorder, lo, i-1);
        boolean right=solve(postorder, i+1, hi);
        return left && right;
    }

    private void exch(int[] postorder, int i, int j) {
        int t = postorder[i];
        postorder[i] = postorder[j];
        postorder[j] = t;
    }
}