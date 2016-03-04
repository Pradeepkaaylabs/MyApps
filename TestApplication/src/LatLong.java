
public class LatLong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rad = 8045.03 / 1609.006;
    	double d = rad / 3963.189;
		double lat1 = (Math.PI/180)* 13.008140;
		double lng1 = (Math.PI/180)* 80.203347;
		for (int a = 0 ; a < 361 ; a+=10 ) {
		    double tc = (Math.PI/180)*a;
		    double y = Math.asin(Math.sin(lat1)*Math.cos(d)+Math.cos(lat1)*Math.sin(d)*Math.cos(tc));
		    double dlng = Math.atan2(Math.sin(tc)*Math.sin(d)*Math.cos(lat1),Math.cos(d)-Math.sin(lat1)*Math.sin(y));
		    double x = ((lng1-dlng+Math.PI) % (2*Math.PI)) - Math.PI ;
		    double lat = y*(180/Math.PI);
		    double lon = x*(180/Math.PI);
        System.out.println(lat+", "+lon);
		}

	}

 }

 //Changes made Here

 //dev-changes here