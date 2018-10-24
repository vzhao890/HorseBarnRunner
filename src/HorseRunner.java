public class HorseRunner
{
    public static void main(String[] args)
    {
        Horse horse1 = new Mustang("Secretariat, 12000");
        Horse horse2 = new Mustang("Dusty Trail, 22000");
        Horse horse3 = new Mustang("Silver, 12000");

        Horse[] horses = new Horse[6];

        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println(" Dusty trail is in space: " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println(" Dusty trail is now in space: " + barn.findHorseSpace("Dusty Trail");


    }
    public void consolidate() {
        for (int i = 0; i < this.spaces.length-1; i++) {
            if (this.spaces[i] == null) {
                for (int j = i+1; j < this.spaces.length; j++) {
                    if (this.spaces[j] != null) {
                        this.spaces[i] = this.spaces[j];
                        this.spaces[j] = null;
                        j = this.spaces.length;
                    }
                }
            }
        }
    }
    public int findHorseSpace(String name) {
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i]!=null && name.equals(this.spaces[i].getName())) {
                return i;
            }
        }
        return -1;
    }

}
