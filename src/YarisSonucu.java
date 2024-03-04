public class YarisSonucu {

    private final String[] names;
    private final int[] minutes;

    public YarisSonucu(String[] names,int[] minutes) {
        this.names = names;
        this.minutes=minutes;
    }

    public int fastest(){
        int min=Integer.MAX_VALUE;
        for (int minute : minutes) {
            if (minute < min)
                min = minute;
        }
        for (int index = 0; index < minutes.length; index++) {
            if (minutes[index] == min) {
                return index;
            }
        }
        return -1;

    }
    public int secondFastest(){
        int min=Integer.MAX_VALUE;
        for (int minute : minutes) {
            if (minute < min && minute!=minutes[fastest()])
                min = minute;
        }
        for (int index = 0; index < minutes.length; index++) {
            if (minutes[index] == min) {
                return index;
            }
        }
        return -1;

    }
    public int thirdFastest(){
        int min=Integer.MAX_VALUE;
        for (int minute : minutes) {
            if (minute < min && minute!=minutes[fastest()] && minute!=minutes[secondFastest()])
                min = minute;
        }
        for (int index = 0; index < minutes.length; index++) {
            if (minutes[index] == min) {
                return index;
            }
        }
        return -1;

    }
    public void classes(){
        int A=0;
        int B=0;
        int C=0;
        for (int minute:minutes){
            if(199<minute && minute<300)
                A++;
            else if (299<minute && minute<400)
                B++;
            else if(399<minute)
                C++;
                

        }
        System.out.println("A -> "+ A);
        System.out.println("B -> "+ B);
        System.out.println("C -> "+ C);

    }
    public void displayWinners(){
        System.out.println("Birinci: "+names[fastest()]+ " " + minutes[fastest()]+"'");
        System.out.println("İkinci: "+names[secondFastest()]+ " " + minutes[secondFastest()]+"'");
        System.out.println("Üçüncü: "+names[thirdFastest()]+ " " + minutes[thirdFastest()]+"'");

    }


}
