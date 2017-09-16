package project001;

public class SettingsConfig {

    public String sensorType;
    public String fears;
    public String strengths;
    public String projectorResolution;
    public String projectorName;
    public String fontName;
    public String fontSize;
    
    /*
        Constructors
    */
    
    public SettingsConfig (){
        
    }
    
    /*
        Methods
    */
    
    
    
    
    /*
        Getters && Setters
     */
    public String getSensorType() {
        return sensorType;
    }

    public String getFears() {
        return fears;
    }

    public String getStrengths() {
        return strengths;
    }

    public String getProjectorResolution() {
        return projectorResolution;
    }

    public String getProjectorName() {
        return projectorName;
    }

    public String getFontName() {
        return fontName;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public void setFears(String fears) {
        this.fears = fears;
    }

    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public void setProjectorResolution(String projectorResolution) {
        this.projectorResolution = projectorResolution;
    }

    public void setProjectorName(String projectorName) {
        this.projectorName = projectorName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    /*
        ToString
    */

    @Override
    public String toString() {
        return "SettingsConfig{" + "sensorType=" + sensorType + ", fears=" + fears + ", strengths=" + strengths + ", projectorResolution=" + projectorResolution + ", projectorName=" + projectorName + ", fontName=" + fontName + ", fontSize=" + fontSize + '}';
    }
    
}
