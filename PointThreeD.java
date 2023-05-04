
public class PointThreeD {
private double xPoint;
private double yPoint;
private double zPoint;

public PointThreeD() {
	
}//end of default
/**
 * @param xPoint
 * @param yPoint
 * @param zPoint
 */
public PointThreeD(double xPoint, double yPoint, double zPoint) {
	super();
	this.xPoint = xPoint;
	this.yPoint = yPoint;
	this.zPoint = zPoint;
}//end of preferred
@Override
public String toString() {
	return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
}


}
