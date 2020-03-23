package primitives;
import primitives.Coordinate;

/**
 * basic coordinate in 3 dimentinon
 */

/**
 * @ _x x accses coordinate
 * @ _y y accses coordinate
 * @ _z z accses coordinate
 */
public class Point3D {
    Coordinate _x;
    Coordinate _y;
    Coordinate _z;


    public final static Point3D ZERO =new Point3D(0.0, 0.0, 0.0);

    public Point3D(Coordinate _x, Coordinate _y, Coordinate _z) {
        this._x = _x;
        this._y = _y;
        this._z = _z;
    }
    public Point3D(double _x, double _y, double _z) {
        this( new Coordinate(_x),new Coordinate(_y),new Coordinate(_z));
    }


    /**
     *
     * @return new coordinate based on x
     */
    public Coordinate get_x() {
        return new Coordinate(_x);
    }

    /**
     *
     * @return new coordinate based on y
     */
    public Coordinate get_y() {
        return new Coordinate(_y);
    }

    /**
     *
     * @return new coordinate based on z
     */
    public Coordinate get_z() {
        return new Coordinate(_z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return _x.equals(point3D._x) &&
                _y.equals(point3D._y) &&
                _z.equals(point3D._z);
    }



        public Vector substract(Point3D  p )
        {
            return new Vector( new Point3D(
                    p.get_x().get()-this.get_x().get(),
                    p.get_y().get()-this.get_y().get(),
                    p.get_z().get()-this.get_z().get()
            )
            );
        }

    @Override
    public String toString() {
        return
                "(" + _x +
                ", " + _y +
                ", " + _z +
                ')';
    }
}

