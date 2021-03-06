package elements;

import primitives.Color;
import primitives.Point3D;
import primitives.Vector;

/**
 *Light source  that is far away  has  only a direction
 */
public class
DirectionalLight extends Light implements LightSource {
    private  Vector _direction;

    public void set_direction(Vector _direction) {
        this._direction = _direction.normalize();
    }

    /**
     * constructor
     * @param _intensity the color of the light
     * @param _direction the direction of the light
     */
    public DirectionalLight(Color _intensity, Vector _direction) {
        set_direction(_direction.normalized()) ;

        this._intensity=_intensity;


    }

    @Override
    public Vector getLightDirection(Point3D p) {
        return _direction.normalize();
    }

    @Override
    public Color getIntensity(Point3D p) {
        return super.get_intensity();

    }

    @Override
    public double getDistance(Point3D pointGeo) {
        return Double.MAX_VALUE;
    }


}
