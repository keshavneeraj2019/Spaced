public class Main {

    public static void main(String[] args) {
	// write your code here
        double Dax= 5.0;
        double Day= 2.0;
        double Daz= -5.0;
        double Dbx= 4.0;
        double Dby= 9.0;
        double Dbz= 2.0;
        double Dcx= -3.0;
        double Dcy= 2.0;
        double Dcz= 6.0;
        double powerabx= Math.pow(Dax-Dbx,2);
        double poweraby= Math.pow(Day-Dby,2);
        double powerabz= Math.pow(Daz-Dbz,2);
        double distanceab= Math.sqrt(powerabx+poweraby+powerabz);
        double powerbcx= Math.pow(Dbx-Dcx,2);
        double powerbcy= Math.pow(Dby-Dcy,2);
        double powerbcz= Math.pow(Dbz-Dcz,2);
        double distancebc= Math.sqrt(powerbcx+powerbcy+powerbcz);
        double poweracx= Math.pow(Dax-Dcx,2);
        double poweracy= Math.pow(Day-Dcy,2);
        double poweracz= Math.pow(Daz-Dcz,2);
        double distanceac= Math.sqrt(poweracx+poweracy+poweracz);
        double maximum=  Math.max(distanceab, Math.max(distancebc, distanceac));
        double minimum=  Math.min(distanceab, Math.max(distancebc, distanceac));
        System.out.println("The longest distance between the 3 drones are " + maximum);
        System.out.println("The shortest distance between the 3 drones are " + minimum);





    }
}
