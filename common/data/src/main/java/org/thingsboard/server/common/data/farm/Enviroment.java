package org.thingsboard.server.common.data.farm;

import java.util.List;

public class Enviroment {

    private Climatology climatology;
    private String orography;
    private float municipalDistance;
    private List<String> access;
    private String highwayState;

    public Enviroment(Climatology climatology, String orography, float municipalDistance, List<String> access, String highwayState) {
        this.climatology = climatology;
        this.orography = orography;
        this.municipalDistance = municipalDistance;
        this.access = access;
        this.highwayState = highwayState;
    }

    public Enviroment(){}

    public Climatology getClimatology() {
        return climatology;
    }

    public void setClimatology(Climatology climatology) {
        this.climatology = climatology;
    }

    public String getOrography() {
        return orography;
    }

    public void setOrography(String orography) {
        this.orography = orography;
    }

    public float getMunicipalDistance() {
        return municipalDistance;
    }

    public void setMunicipalDistance(float municipalDistance) {
        this.municipalDistance = municipalDistance;
    }

    public List<String> getAccess() {
        return this.access;
    }

    public void setAccess(List<String> access) {
        this.access = access;
    }

    public String getHighwayState() {
        return highwayState;
    }

    public void setHighwayState(String highwayState) {
        this.highwayState = highwayState;
    }
}
